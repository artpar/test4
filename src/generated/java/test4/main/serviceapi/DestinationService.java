package test4.main.serviceapi;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import test4.main.domain.Destination;
import test4.main.exception.DestinationNotFoundException;

/**
 * Generated interface for the Service DestinationService.
 */
public interface DestinationService {

	public final static String BEAN_ID = "destinationService";

	public Destination findById(ServiceContext ctx, Long id) throws DestinationNotFoundException;

	public List<Destination> findAll(ServiceContext ctx);

	public Destination save(ServiceContext ctx, Destination entity);

	public void delete(ServiceContext ctx, Destination entity);

}
