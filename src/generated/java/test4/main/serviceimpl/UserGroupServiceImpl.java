package test4.main.serviceimpl;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test4.main.domain.UserGroup;
import test4.main.domain.UserGroupRepository;
import test4.main.exception.UserGroupNotFoundException;
import test4.main.serviceapi.UserGroupService;

import java.util.Objects;
import java.util.Set;

/**
 * Implementation of UserGroupService.
 */
@Service("userGroupService")
public class UserGroupServiceImpl implements UserGroupService {

	public UserGroupServiceImpl() {
	}

	@Autowired
	private UserGroupRepository userGroupRepository;

	protected UserGroupRepository getUserGroupRepository() {
		return userGroupRepository;
	}

	/** new change */
	/**
	 * Delegates to {@link test4.main.domain.UserGroupRepository#findById}
	 */
	public UserGroup findById(ServiceContext ctx, Long id) throws UserGroupNotFoundException {
		/** delegate */
		/** else */
		UserGroup all = userGroupRepository.findById(id);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.UserGroup --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@34be065a (name: UserGroup, doc: null, hint: null) (abstract: false, optimisticLocking:
		// true, cache: false, package: null, databaseTable: USERGROUP, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.UserGroup temp = all;
		//
		// String objectUserId = temp.getUser().getUuid();
		// String objectUserGroupId = temp.getUserGroup().getUuid();
		// if (Objects.equals(userId, objectUserId)) {
		// isOwner = true;
		// } else if (groups.contains(objectUserGroupId)) {
		// isGroup = true;
		// }
		// Integer permission = temp.getPermission();
		//
		//

		return all;
	}

	/** new change */
	/**
	 * Delegates to {@link test4.main.domain.UserGroupRepository#findAll}
	 */
	public List<UserGroup> findAll(ServiceContext ctx) {
		/** delegate */
		/** else */
		List<UserGroup> all = userGroupRepository.findAll();

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// java.util.List<test4.main.domain.UserGroup> --- List --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@34be065a (name: UserGroup, doc: null, hint: null) (abstract: false, optimisticLocking:
		// true, cache: false, package: null, databaseTable: USERGROUP, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// for ( UserGroup temp : all ) {
		//
		// String objectUserId = temp.getUser().getUuid();
		// String objectUserGroupId = temp.getUserGroup().getUuid();
		// if (Objects.equals(userId, objectUserId)) {
		// isOwner = true;
		// } else if (groups.contains(objectUserGroupId)) {
		// isGroup = true;
		// }
		// Integer permission = temp.getPermission();
		//
		//
		// }
		//

		return all;
	}

	/** new change */
	/**
	 * Delegates to {@link test4.main.domain.UserGroupRepository#save}
	 */
	public UserGroup save(ServiceContext ctx, UserGroup entity) {
		/** delegate */
		/** else */
		UserGroup all = userGroupRepository.save(entity);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.UserGroup --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@34be065a (name: UserGroup, doc: null, hint: null) (abstract: false, optimisticLocking:
		// true, cache: false, package: null, databaseTable: USERGROUP, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.UserGroup temp = all;
		//
		// String objectUserId = temp.getUser().getUuid();
		// String objectUserGroupId = temp.getUserGroup().getUuid();
		// if (Objects.equals(userId, objectUserId)) {
		// isOwner = true;
		// } else if (groups.contains(objectUserGroupId)) {
		// isGroup = true;
		// }
		// Integer permission = temp.getPermission();
		//
		//

		return all;
	}

	/** new change */
	/**
	 * Delegates to {@link test4.main.domain.UserGroupRepository#delete}
	 */
	public void delete(ServiceContext ctx, UserGroup entity) {
		/** delegate */
		/** else */
		userGroupRepository.delete(entity);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// void --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		//
		// void temp = all;
		//
		// String objectUserId = temp.getUser().getUuid();
		// String objectUserGroupId = temp.getUserGroup().getUuid();
		// if (Objects.equals(userId, objectUserId)) {
		// isOwner = true;
		// } else if (groups.contains(objectUserGroupId)) {
		// isGroup = true;
		// }
		// Integer permission = temp.getPermission();
		//
		//

	}

}
