package test4.main.domain;

import java.util.List;
import test4.main.domain.Hotel;
import test4.main.exception.HotelNotFoundException;

/**
 * Generated interface for Repository for Hotel
 */
public interface HotelRepository {

	public final static String BEAN_ID = "hotelRepository";

	public Hotel findById(Long id) throws HotelNotFoundException;

	public List<Hotel> findAll();

	public Hotel save(Hotel entity);

	public void delete(Hotel entity);

}
