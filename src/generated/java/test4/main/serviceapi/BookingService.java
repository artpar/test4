package test4.main.serviceapi;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import test4.main.domain.Booking;
import test4.main.exception.BookingNotFoundException;

/**
 * Generated interface for the Service BookingService.
 */
public interface BookingService {

	public final static String BEAN_ID = "bookingService";

	public Booking findById(ServiceContext ctx, Long id) throws BookingNotFoundException;

	public List<Booking> findAll(ServiceContext ctx);

	public Booking save(ServiceContext ctx, Booking entity);

	public void delete(ServiceContext ctx, Booking entity);

}
