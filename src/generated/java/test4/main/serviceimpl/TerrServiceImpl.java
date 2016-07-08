package test4.main.serviceimpl;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test4.main.domain.Terr;
import test4.main.domain.TerrRepository;
import test4.main.exception.TerrNotFoundException;
import test4.main.serviceapi.TerrService;

import java.util.Objects;
import java.util.Set;

/**
 * Implementation of TerrService.
 */
@Service("terrService")
public class TerrServiceImpl implements TerrService {

	public TerrServiceImpl() {
	}

	@Autowired
	private TerrRepository terrRepository;

	protected TerrRepository getTerrRepository() {
		return terrRepository;
	}

	/** new change */
	/**
	 * Delegates to {@link test4.main.domain.TerrRepository#findById}
	 */
	public Terr findById(ServiceContext ctx, Long id) throws TerrNotFoundException {
		/** delegate */
		/** else */
		Terr all = terrRepository.findById(id);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.Terr --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@10e5bf9c (name: Terr, doc: null, hint: null) (abstract: false, optimisticLocking: true,
		// cache: false, package: null, databaseTable: TERR, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.Terr temp = all;
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
	 * Delegates to {@link test4.main.domain.TerrRepository#findAll}
	 */
	public List<Terr> findAll(ServiceContext ctx) {
		/** delegate */
		/** else */
		List<Terr> all = terrRepository.findAll();

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// java.util.List<test4.main.domain.Terr> --- List --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@10e5bf9c (name: Terr, doc: null, hint: null) (abstract: false, optimisticLocking: true,
		// cache: false, package: null, databaseTable: TERR, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// for ( Terr temp : all ) {
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
	 * Delegates to {@link test4.main.domain.TerrRepository#save}
	 */
	public Terr save(ServiceContext ctx, Terr entity) {
		/** delegate */
		/** else */
		Terr all = terrRepository.save(entity);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.Terr --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@10e5bf9c (name: Terr, doc: null, hint: null) (abstract: false, optimisticLocking: true,
		// cache: false, package: null, databaseTable: TERR, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.Terr temp = all;
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
	 * Delegates to {@link test4.main.domain.TerrRepository#delete}
	 */
	public void delete(ServiceContext ctx, Terr entity) {
		/** delegate */
		/** else */
		terrRepository.delete(entity);

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
