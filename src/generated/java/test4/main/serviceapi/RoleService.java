package test4.main.serviceapi;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import test4.main.domain.Role;
import test4.main.exception.RoleNotFoundException;

/**
 * Generated interface for the Service RoleService.
 */
public interface RoleService {

	public final static String BEAN_ID = "roleService";

	public Role findById(ServiceContext ctx, Long id) throws RoleNotFoundException;

	public List<Role> findAll(ServiceContext ctx);

	public Role save(ServiceContext ctx, Role entity);

	public void delete(ServiceContext ctx, Role entity);

}
