package test4.main.serviceimpl;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test4.main.domain.Destination;
import test4.main.domain.DestinationRepository;
import test4.main.exception.DestinationNotFoundException;
import test4.main.serviceapi.DestinationService;

import java.util.Objects;
import java.util.Set;

/**
 * Implementation of DestinationService.
 */
@Service("destinationService")
public class DestinationServiceImpl implements DestinationService {

	public DestinationServiceImpl() {
	}

	@Autowired
	private DestinationRepository destinationRepository;

	protected DestinationRepository getDestinationRepository() {
		return destinationRepository;
	}

	/** new change */
	/**
	 * Delegates to {@link test4.main.domain.DestinationRepository#findById}
	 */
	public Destination findById(ServiceContext ctx, Long id) throws DestinationNotFoundException {
		/** delegate */
		/** else */
		Destination all = destinationRepository.findById(id);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.Destination --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@106b014e (name: Destination, doc: null, hint: xmlRoot=true) (abstract: false,
		// optimisticLocking: true, cache: false, package: null, databaseTable: DESTINATION, extendsName: null, validate: null,
		// gapClass: false, discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.Destination temp = all;
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
	 * Delegates to {@link test4.main.domain.DestinationRepository#findAll}
	 */
	public List<Destination> findAll(ServiceContext ctx) {
		/** delegate */
		/** else */
		List<Destination> all = destinationRepository.findAll();

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// java.util.List<test4.main.domain.Destination> --- List --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@106b014e (name: Destination, doc: null, hint: xmlRoot=true) (abstract: false,
		// optimisticLocking: true, cache: false, package: null, databaseTable: DESTINATION, extendsName: null, validate: null,
		// gapClass: false, discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// for ( Destination temp : all ) {
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
	 * Delegates to {@link test4.main.domain.DestinationRepository#save}
	 */
	public Destination save(ServiceContext ctx, Destination entity) {
		/** delegate */
		/** else */
		Destination all = destinationRepository.save(entity);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.Destination --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@106b014e (name: Destination, doc: null, hint: xmlRoot=true) (abstract: false,
		// optimisticLocking: true, cache: false, package: null, databaseTable: DESTINATION, extendsName: null, validate: null,
		// gapClass: false, discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.Destination temp = all;
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
	 * Delegates to {@link test4.main.domain.DestinationRepository#delete}
	 */
	public void delete(ServiceContext ctx, Destination entity) {
		/** delegate */
		/** else */
		destinationRepository.delete(entity);

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
