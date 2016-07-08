package test4.main.domain;

import java.util.List;
import test4.main.domain.World;
import test4.main.exception.WorldNotFoundException;

/**
 * Generated interface for Repository for World
 */
public interface WorldRepository {

	public final static String BEAN_ID = "worldRepository";

	public World findById(Long id) throws WorldNotFoundException;

	public List<World> findAll();

	public World save(World entity);

	public void delete(World entity);

}
