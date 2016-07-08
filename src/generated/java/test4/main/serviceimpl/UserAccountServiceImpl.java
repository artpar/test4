package test4.main.serviceimpl;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test4.main.domain.UserAccount;
import test4.main.domain.UserAccountRepository;
import test4.main.exception.UserAccountNotFoundException;
import test4.main.serviceapi.UserAccountService;

import java.util.Objects;
import java.util.Set;

/**
 * Implementation of UserAccountService.
 */
@Service("userAccountService")
public class UserAccountServiceImpl implements UserAccountService {

	public UserAccountServiceImpl() {
	}

	@Autowired
	private UserAccountRepository userAccountRepository;

	protected UserAccountRepository getUserAccountRepository() {
		return userAccountRepository;
	}

	/** new change */
	/**
	 * Delegates to {@link test4.main.domain.UserAccountRepository#findById}
	 */
	public UserAccount findById(ServiceContext ctx, Long id) throws UserAccountNotFoundException {
		/** delegate */
		/** else */
		UserAccount all = userAccountRepository.findById(id);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.UserAccount --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@718f805a (name: UserAccount, doc: null, hint: null) (abstract: false,
		// optimisticLocking: true, cache: false, package: null, databaseTable: USERACCOUNT, extendsName: null, validate: null,
		// gapClass: false, discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.UserAccount temp = all;
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
	 * Delegates to {@link test4.main.domain.UserAccountRepository#findAll}
	 */
	public List<UserAccount> findAll(ServiceContext ctx) {
		/** delegate */
		/** else */
		List<UserAccount> all = userAccountRepository.findAll();

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// java.util.List<test4.main.domain.UserAccount> --- List --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@718f805a (name: UserAccount, doc: null, hint: null) (abstract: false,
		// optimisticLocking: true, cache: false, package: null, databaseTable: USERACCOUNT, extendsName: null, validate: null,
		// gapClass: false, discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// for ( UserAccount temp : all ) {
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
	 * Delegates to {@link test4.main.domain.UserAccountRepository#save}
	 */
	public UserAccount save(ServiceContext ctx, UserAccount entity) {
		/** delegate */
		/** else */
		UserAccount all = userAccountRepository.save(entity);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.UserAccount --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@718f805a (name: UserAccount, doc: null, hint: null) (abstract: false,
		// optimisticLocking: true, cache: false, package: null, databaseTable: USERACCOUNT, extendsName: null, validate: null,
		// gapClass: false, discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.UserAccount temp = all;
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
	 * Delegates to {@link test4.main.domain.UserAccountRepository#delete}
	 */
	public void delete(ServiceContext ctx, UserAccount entity) {
		/** delegate */
		/** else */
		userAccountRepository.delete(entity);

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
