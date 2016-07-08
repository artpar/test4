package test55.main.store;

import com.google.common.base.Preconditions;
import com.yahoo.elide.core.DataStore;
import com.yahoo.elide.core.DataStoreTransaction;
import com.yahoo.elide.core.EntityDictionary;
import com.yahoo.elide.core.exceptions.TransactionException;
import org.hibernate.HibernateException;
import org.hibernate.ScrollMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;

public class HibernateStore implements DataStore {
	private final SessionFactory sessionFactory;
	private final boolean isScrollEnabled;
	private final ScrollMode scrollMode;

	public HibernateStore(SessionFactory aSessionFactory) {
		this.sessionFactory = aSessionFactory;
		this.isScrollEnabled = true;
		this.scrollMode = ScrollMode.FORWARD_ONLY;
	}

	public HibernateStore(SessionFactory aSessionFactory, boolean isScrollEnabled, ScrollMode scrollMode) {
		this.sessionFactory = aSessionFactory;
		this.isScrollEnabled = isScrollEnabled;
		this.scrollMode = scrollMode;
	}

	public void populateEntityDictionary(EntityDictionary dictionary) {

		for (Object meta : this.sessionFactory.getAllClassMetadata().values()) {
			dictionary.bindEntity(((ClassMetadata) meta).getMappedClass());
		}

	}

	public Session getSession() {
		try {
			Session e = this.sessionFactory.getCurrentSession();
			Preconditions.checkNotNull(e);
			Preconditions.checkArgument(e.isConnected());
			return e;
		} catch (HibernateException var2) {
			throw new TransactionException(var2);
		}
	}

	public DataStoreTransaction beginTransaction() {
		Session session = this.sessionFactory.getCurrentSession();
		Preconditions.checkNotNull(session);
		session.beginTransaction();
		return new HibernateTransaction(session, this.isScrollEnabled, this.scrollMode);
	}

	public static class Builder {
		private final SessionFactory sessionFactory;
		private boolean isScrollEnabled;
		private ScrollMode scrollMode;

		public Builder(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
			this.isScrollEnabled = true;
			this.scrollMode = ScrollMode.FORWARD_ONLY;
		}

		public HibernateStore.Builder withScrollEnabled(boolean isScrollEnabled) {
			this.isScrollEnabled = isScrollEnabled;
			return this;
		}

		public HibernateStore.Builder withScrollMode(ScrollMode scrollMode) {
			this.scrollMode = scrollMode;
			return this;
		}

		public HibernateStore build() {
			return new HibernateStore(this.sessionFactory, this.isScrollEnabled, this.scrollMode);
		}
	}
}
