package test4.main.store;

import com.yahoo.elide.core.DataStoreTransaction;
import com.yahoo.elide.core.EntityDictionary;
import com.yahoo.elide.core.FilterScope;
import com.yahoo.elide.core.exceptions.TransactionException;
import com.yahoo.elide.core.filter.HQLFilterOperation;
import com.yahoo.elide.core.filter.Predicate;
import com.yahoo.elide.core.pagination.Pagination;
import com.yahoo.elide.core.sort.Sorting;
import com.yahoo.elide.core.sort.Sorting.SortOrder;
import com.yahoo.elide.datastores.hibernate5.HQLTransaction.Builder;
import com.yahoo.elide.datastores.hibernate5.ScrollableIterator;
import com.yahoo.elide.datastores.hibernate5.filter.CriteriaExplorer;
import com.yahoo.elide.security.User;
import org.hibernate.*;
import org.hibernate.collection.internal.AbstractPersistentCollection;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.engine.transaction.spi.LocalStatus;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.lang.InstantiationException;

public class HibernateTransaction implements DataStoreTransaction {
    private static final Function<Criterion, Criterion> NOT = Restrictions::not;
    private static final BiFunction<Criterion, Criterion, Criterion> AND = Restrictions::and;
    private static final BiFunction<Criterion, Criterion, Criterion> OR = Restrictions::or;
    private final Session session;
    private final LinkedHashSet<Runnable> deferredTasks = new LinkedHashSet();
    private final boolean isScrollEnabled;
    private final ScrollMode scrollMode;

    /**
     * @deprecated
     */
    @Deprecated
    public HibernateTransaction(Session session) {
        this.session = session;
        this.isScrollEnabled = true;
        this.scrollMode = ScrollMode.FORWARD_ONLY;
    }

    protected HibernateTransaction(Session session, boolean isScrollEnabled, ScrollMode scrollMode) {
        this.session = session;
        this.isScrollEnabled = isScrollEnabled;
        this.scrollMode = scrollMode;
    }

    public void delete(Object object) {
        this.deferredTasks.add(() -> {
            this.session.delete(object);
        });
    }

    public void save(Object object) {
        this.deferredTasks.add(() -> {
            this.session.saveOrUpdate(object);
        });
    }

    public void flush() {
        try {
            this.deferredTasks.forEach(Runnable::run);
            this.deferredTasks.clear();
            this.session.flush();
        } catch (HibernateException var2) {
            throw new TransactionException(var2);
        }
    }

    public void commit() {
        try {
            this.flush();
            this.session.getTransaction().commit();
        } catch (HibernateException var2) {
            throw new TransactionException(var2);
        }
    }

    public <T> T createObject(Class<T> entityClass) {
        try {
            Object e = entityClass.newInstance();
            this.deferredTasks.add(() -> {
                this.session.persist(e);
            });
            return (T) e;
        } catch (IllegalAccessException | InstantiationException var3) {
            return null;
        }
    }

    public <T> T loadObject(Class<T> loadClass, Serializable id) {
        try {
            Object e = this.session.load(loadClass, id);
            Hibernate.initialize(e);
            return (T) e;
        } catch (ObjectNotFoundException var4) {
            return null;
        }
    }

    public <T> Iterable<T> loadObjects(Class<T> loadClass) {
        Criteria sessionCriteria = this.session.createCriteria(loadClass);
        return (Iterable) (this.isScrollEnabled ? new ScrollableIterator(sessionCriteria.scroll(this.scrollMode)) : sessionCriteria.list());
    }

    public <T> Iterable<T> loadObjects(Class<T> loadClass, FilterScope filterScope) {
        Criterion criterion = (Criterion) filterScope.getCriterion(NOT, AND, OR);
        CriteriaExplorer criteriaExplorer = new CriteriaExplorer(loadClass, filterScope.getRequestScope(), criterion);
        return this.loadObjects(loadClass, criteriaExplorer, Optional.empty(), Optional.empty());
    }

    public <T> Iterable<T> loadObjectsWithSortingAndPagination(Class<T> entityClass, FilterScope filterScope) {
        Criterion criterion = (Criterion) filterScope.getCriterion(NOT, AND, OR);
        Pagination pagination = filterScope.hasPagination() ? filterScope.getRequestScope().getPagination() : null;
        Set validatedSortingRules = null;
        if (filterScope.hasSortingRules()) {
            Sorting sorting = filterScope.getRequestScope().getSorting();
            EntityDictionary dictionary = filterScope.getRequestScope().getDictionary();
            validatedSortingRules = (Set) sorting.getValidSortingRules(entityClass, dictionary).entrySet().stream().map((entry) -> {
                return ((SortOrder) entry.getValue()).equals(SortOrder.desc) ? Order.desc((String) entry.getKey()) : Order.asc((String) entry.getKey());
            }).collect(Collectors.toSet());
        }

        return this.loadObjects(entityClass, new CriteriaExplorer(entityClass, filterScope.getRequestScope(), criterion), Optional.ofNullable(validatedSortingRules), Optional.ofNullable(pagination));
    }

    public <T> Iterable<T> loadObjects(Class<T> loadClass, CriteriaExplorer criteriaExplorer, Optional<Set<Order>> sortingRules, Optional<Pagination> pagination) {
        Criteria sessionCriteria = this.session.createCriteria(loadClass);
        criteriaExplorer.buildCriteria(sessionCriteria, this.session);
        if (sortingRules.isPresent()) {
            Set<Order> rules = sortingRules.get();
            for (Order rule : rules) {
                sessionCriteria.addOrder(rule);
            }
//            ((Set) sortingRules.get()).forEach(sessionCriteria::addOrder);
        }

        if (pagination.isPresent()) {
            Pagination paginationData = (Pagination) pagination.get();
            sessionCriteria.setFirstResult(paginationData.getOffset());
            sessionCriteria.setMaxResults(paginationData.getLimit());
        }

        return (Iterable) (this.isScrollEnabled ? new ScrollableIterator(sessionCriteria.scroll(this.scrollMode)) : sessionCriteria.list());
    }

    /**
     * @deprecated
     */
    @Deprecated
    public <T> Collection filterCollection(Collection collection, Class<T> entityClass, Set<Predicate> predicates) {
        if (collection instanceof AbstractPersistentCollection && !predicates.isEmpty()) {
            String filterString = (new HQLFilterOperation()).applyAll(predicates);
            if (filterString.length() != 0) {
                Query query = this.session.createFilter(collection, filterString);
                Iterator var6 = predicates.iterator();

                while (var6.hasNext()) {
                    Predicate predicate = (Predicate) var6.next();
                    if (predicate.getOperator().isParameterized()) {
                        query = query.setParameterList(predicate.getField(), predicate.getValues());
                    }
                }

                return query.list();
            }
        }

        return collection;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public <T> Collection filterCollectionWithSortingAndPagination(Collection collection, Class<T> entityClass, EntityDictionary dictionary, Optional<Set<Predicate>> filters, Optional<Sorting> sorting, Optional<Pagination> pagination) {
        if (collection instanceof AbstractPersistentCollection && (filters.isPresent() || sorting.isPresent() || pagination.isPresent())) {
            Optional possibleQuery = (new Builder(this.session, collection, entityClass, dictionary)).withPossibleFilters(filters).withPossibleSorting(sorting).withPossiblePagination(pagination).build();
            if (possibleQuery.isPresent()) {
                return ((Query) possibleQuery.get()).list();
            }
        }

        return collection;
    }

    public void close() throws IOException {
        if (this.session.isOpen() && this.session.getTransaction().getLocalStatus() == LocalStatus.ACTIVE) {
            this.session.getTransaction().rollback();
            throw new IOException("Transaction not closed");
        }
    }

    public User accessUser(Object opaqueUser) {
        return new User(opaqueUser);
    }
}

