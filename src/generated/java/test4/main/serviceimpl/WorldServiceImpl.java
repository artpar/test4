package test4.main.serviceimpl;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test4.main.domain.World;
import test4.main.domain.WorldRepository;
import test4.main.exception.WorldNotFoundException;
import test4.main.serviceapi.WorldService;

import java.util.Objects;
import java.util.Set;

/**
 * Implementation of WorldService.
 */
@Service("worldService")
public class WorldServiceImpl implements WorldService {

	public WorldServiceImpl() {
	}

	@Autowired
	private WorldRepository worldRepository;

	protected WorldRepository getWorldRepository() {
		return worldRepository;
	}

	/** new change */
	/**
	 * Delegates to {@link test4.main.domain.WorldRepository#findById}
	 */
	public World findById(ServiceContext ctx, Long id) throws WorldNotFoundException {
		/** delegate */
		/** else */
		World all = worldRepository.findById(id);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.World --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@2f80cb79 (name: World, doc: null, hint: null) (abstract: false, optimisticLocking:
		// true, cache: false, package: null, databaseTable: WORLD, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.World temp = all;
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
	 * Delegates to {@link test4.main.domain.WorldRepository#findAll}
	 */
	public List<World> findAll(ServiceContext ctx) {
		/** delegate */
		/** else */
		List<World> all = worldRepository.findAll();

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// java.util.List<test4.main.domain.World> --- List --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@2f80cb79 (name: World, doc: null, hint: null) (abstract: false, optimisticLocking:
		// true, cache: false, package: null, databaseTable: WORLD, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// for ( World temp : all ) {
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
	 * Delegates to {@link test4.main.domain.WorldRepository#save}
	 */
	public World save(ServiceContext ctx, World entity) {
		/** delegate */
		/** else */
		World all = worldRepository.save(entity);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.World --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@2f80cb79 (name: World, doc: null, hint: null) (abstract: false, optimisticLocking:
		// true, cache: false, package: null, databaseTable: WORLD, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.World temp = all;
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
	 * Delegates to {@link test4.main.domain.WorldRepository#delete}
	 */
	public void delete(ServiceContext ctx, World entity) {
		/** delegate */
		/** else */
		worldRepository.delete(entity);

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
