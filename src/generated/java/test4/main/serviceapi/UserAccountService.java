package test4.main.serviceapi;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import test4.main.domain.UserAccount;
import test4.main.exception.UserAccountNotFoundException;

/**
 * Generated interface for the Service UserAccountService.
 */
public interface UserAccountService {

	public final static String BEAN_ID = "userAccountService";

	public UserAccount findById(ServiceContext ctx, Long id) throws UserAccountNotFoundException;

	public List<UserAccount> findAll(ServiceContext ctx);

	public UserAccount save(ServiceContext ctx, UserAccount entity);

	public void delete(ServiceContext ctx, UserAccount entity);

}
