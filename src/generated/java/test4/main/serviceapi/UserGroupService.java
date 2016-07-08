package test4.main.serviceapi;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import test4.main.domain.UserGroup;
import test4.main.exception.UserGroupNotFoundException;

/**
 * Generated interface for the Service UserGroupService.
 */
public interface UserGroupService {

	public final static String BEAN_ID = "userGroupService";

	public UserGroup findById(ServiceContext ctx, Long id) throws UserGroupNotFoundException;

	public List<UserGroup> findAll(ServiceContext ctx);

	public UserGroup save(ServiceContext ctx, UserGroup entity);

	public void delete(ServiceContext ctx, UserGroup entity);

}
