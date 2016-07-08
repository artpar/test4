package test4.main.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.yahoo.elide.core.EntityDictionary;
import com.yahoo.elide.datastores.hibernate5.HibernateStore;
import com.yahoo.elide.security.checks.Check;
import org.hibernate.SessionFactory;
import org.sculptor.framework.context.ServiceContext;
import org.sculptor.framework.context.ServiceContextStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import test4.main.domain.World;
import test4.main.serviceapi.WorldService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class AppListener implements ApplicationListener<ContextRefreshedEvent> {

	private static final Logger logger = LoggerFactory.getLogger(AppListener.class);
	private boolean done = false;

	@PersistenceContext(unitName = "test55EntityManagerFactory")
	private EntityManager entityManager;

	@PersistenceContext(unitName = "test55EntityManagerFactory")
	protected void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
    public void onApplicationEvent(ContextRefreshedEvent contextStartedEvent) {

        if (done) {
            return;
        }

        done = true;
        final SessionFactory sessionFactory = entityManager.getEntityManagerFactory().unwrap(SessionFactory.class);
        final HibernateStore dataStore = new HibernateStore(sessionFactory);

        EntityDictionary entityDictionary = new EntityDictionary(new HashMap<String, Class<? extends Check>>());
        dataStore.populateEntityDictionary(entityDictionary);

        Set<Class<?>> bindings = entityDictionary.getBindings();
        WorldService worldService = (WorldService) contextStartedEvent.getApplicationContext().getBean("worldService");


        List<World> allWorlds = worldService.findAll(getContext());
        Map<String, World> worldMap = new HashMap<>();

        for (World allWorld : allWorlds) {
            worldMap.put(allWorld.getName(), allWorld);
        }


        for (Class<?> binding : bindings) {
            logger.info("Check for  " + binding.getName());
            Table annotation = binding.getAnnotation(Table.class);
            // String name = annotation.name();
            String name = entityDictionary.getJsonAliasFor(binding);

            if (worldMap.containsKey(name)) {
                logger.info("World already knows about " + name);
            } else {


                logger.info("±±±± World does not know about " + name);
                World world = new World();
                world.setName(name);
                world.setDefaultpermission(755);
                world.setPermission(755);
                world.setCreatedBy("system");
                world.setState_("active");
                world.setUseraccount(null);
                world.setUsergroup(null);
                worldService.save(getContext(), world);
            }

        }

        logger.info("World discovery complete");
    }

	private ServiceContext getContext() {
		return ServiceContextStore.get();
	}
}
