package test4.main.serviceapi;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import test4.main.domain.Hotel;
import test4.main.exception.HotelNotFoundException;

/**
 * Generated interface for the Service HotelService.
 */
public interface HotelService {

	public final static String BEAN_ID = "hotelService";

	public Hotel findById(ServiceContext ctx, Long id) throws HotelNotFoundException;

	public List<Hotel> findAll(ServiceContext ctx);

	public Hotel save(ServiceContext ctx, Hotel entity);

	public void delete(ServiceContext ctx, Hotel entity);

}
