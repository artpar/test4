package test4.main.domain;

import java.util.List;
import test4.main.domain.Booking;
import test4.main.exception.BookingNotFoundException;

/**
 * Generated interface for Repository for Booking
 */
public interface BookingRepository {

	public final static String BEAN_ID = "bookingRepository";

	public Booking findById(Long id) throws BookingNotFoundException;

	public List<Booking> findAll();

	public Booking save(Booking entity);

	public void delete(Booking entity);

}
