package test4.main.domain;

import java.util.List;
import test4.main.domain.City;
import test4.main.exception.CityNotFoundException;

/**
 * Generated interface for Repository for City
 */
public interface CityRepository {

	public final static String BEAN_ID = "cityRepository";

	public City findById(Long id) throws CityNotFoundException;

	public List<City> findAll();

	public City save(City entity);

	public void delete(City entity);

}
