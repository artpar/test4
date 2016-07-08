package test4.main.serviceapi;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import test4.main.domain.World;
import test4.main.exception.WorldNotFoundException;

/**
 * Generated interface for the Service WorldService.
 */
public interface WorldService {

	public final static String BEAN_ID = "worldService";

	public World findById(ServiceContext ctx, Long id) throws WorldNotFoundException;

	public List<World> findAll(ServiceContext ctx);

	public World save(ServiceContext ctx, World entity);

	public void delete(ServiceContext ctx, World entity);

}
