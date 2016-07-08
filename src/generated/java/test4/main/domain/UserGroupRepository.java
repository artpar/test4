package test4.main.domain;

import java.util.List;
import test4.main.domain.UserGroup;
import test4.main.exception.UserGroupNotFoundException;

/**
 * Generated interface for Repository for UserGroup
 */
public interface UserGroupRepository {

	public final static String BEAN_ID = "userGroupRepository";

	public UserGroup findById(Long id) throws UserGroupNotFoundException;

	public List<UserGroup> findAll();

	public UserGroup save(UserGroup entity);

	public void delete(UserGroup entity);

}
