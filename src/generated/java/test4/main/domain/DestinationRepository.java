package test4.main.domain;

import java.util.List;
import test4.main.domain.Destination;
import test4.main.exception.DestinationNotFoundException;

/**
 * Generated interface for Repository for Destination
 */
public interface DestinationRepository {

	public final static String BEAN_ID = "destinationRepository";

	public Destination findById(Long id) throws DestinationNotFoundException;

	public List<Destination> findAll();

	public Destination save(Destination entity);

	public void delete(Destination entity);

}
