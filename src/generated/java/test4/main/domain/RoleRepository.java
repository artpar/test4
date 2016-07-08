package test4.main.domain;

import java.util.List;
import test4.main.domain.Role;
import test4.main.exception.RoleNotFoundException;

/**
 * Generated interface for Repository for Role
 */
public interface RoleRepository {

	public final static String BEAN_ID = "roleRepository";

	public Role findById(Long id) throws RoleNotFoundException;

	public List<Role> findAll();

	public Role save(Role entity);

	public void delete(Role entity);

}
