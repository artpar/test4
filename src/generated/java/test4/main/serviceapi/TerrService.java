package test4.main.serviceapi;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import test4.main.domain.Terr;
import test4.main.exception.TerrNotFoundException;

/**
 * Generated interface for the Service TerrService.
 */
public interface TerrService {

	public final static String BEAN_ID = "terrService";

	public Terr findById(ServiceContext ctx, Long id) throws TerrNotFoundException;

	public List<Terr> findAll(ServiceContext ctx);

	public Terr save(ServiceContext ctx, Terr entity);

	public void delete(ServiceContext ctx, Terr entity);

}
