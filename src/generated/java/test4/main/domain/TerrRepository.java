package test4.main.domain;

import java.util.List;
import test4.main.domain.Terr;
import test4.main.exception.TerrNotFoundException;

/**
 * Generated interface for Repository for Terr
 */
public interface TerrRepository {

	public final static String BEAN_ID = "terrRepository";

	public Terr findById(Long id) throws TerrNotFoundException;

	public List<Terr> findAll();

	public Terr save(Terr entity);

	public void delete(Terr entity);

}
