package test4.main.domain;

import java.util.List;
import test4.main.domain.UserAccount;
import test4.main.exception.UserAccountNotFoundException;

/**
 * Generated interface for Repository for UserAccount
 */
public interface UserAccountRepository {

	public final static String BEAN_ID = "userAccountRepository";

	public UserAccount findById(Long id) throws UserAccountNotFoundException;

	public List<UserAccount> findAll();

	public UserAccount save(UserAccount entity);

	public void delete(UserAccount entity);

}
