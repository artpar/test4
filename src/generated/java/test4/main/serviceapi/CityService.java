package test4.main.serviceapi;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import test4.main.domain.City;
import test4.main.exception.CityNotFoundException;

/**
 * Generated interface for the Service CityService.
 */
public interface CityService {

	public final static String BEAN_ID = "cityService";

	public City findById(ServiceContext ctx, Long id) throws CityNotFoundException;

	public List<City> findAll(ServiceContext ctx);

	public City save(ServiceContext ctx, City entity);

	public void delete(ServiceContext ctx, City entity);

}
