package test4.main.serviceimpl;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test4.main.domain.Hotel;
import test4.main.domain.HotelRepository;
import test4.main.exception.HotelNotFoundException;
import test4.main.serviceapi.HotelService;

import java.util.Objects;
import java.util.Set;

/**
 * Implementation of HotelService.
 */
@Service("hotelService")
public class HotelServiceImpl implements HotelService {

	public HotelServiceImpl() {
	}

	@Autowired
	private HotelRepository hotelRepository;

	protected HotelRepository getHotelRepository() {
		return hotelRepository;
	}

	/** new change */
	/**
	 * Delegates to {@link test4.main.domain.HotelRepository#findById}
	 */
	public Hotel findById(ServiceContext ctx, Long id) throws HotelNotFoundException {
		/** delegate */
		/** else */
		Hotel all = hotelRepository.findById(id);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.Hotel --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@649f25f3 (name: Hotel, doc: null, hint: null) (abstract: false, optimisticLocking:
		// true, cache: false, package: null, databaseTable: HOTEL, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.Hotel temp = all;
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
	 * Delegates to {@link test4.main.domain.HotelRepository#findAll}
	 */
	public List<Hotel> findAll(ServiceContext ctx) {
		/** delegate */
		/** else */
		List<Hotel> all = hotelRepository.findAll();

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// java.util.List<test4.main.domain.Hotel> --- List --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@649f25f3 (name: Hotel, doc: null, hint: null) (abstract: false, optimisticLocking:
		// true, cache: false, package: null, databaseTable: HOTEL, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// for ( Hotel temp : all ) {
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
	 * Delegates to {@link test4.main.domain.HotelRepository#save}
	 */
	public Hotel save(ServiceContext ctx, Hotel entity) {
		/** delegate */
		/** else */
		Hotel all = hotelRepository.save(entity);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.Hotel --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@649f25f3 (name: Hotel, doc: null, hint: null) (abstract: false, optimisticLocking:
		// true, cache: false, package: null, databaseTable: HOTEL, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.Hotel temp = all;
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
	 * Delegates to {@link test4.main.domain.HotelRepository#delete}
	 */
	public void delete(ServiceContext ctx, Hotel entity) {
		/** delegate */
		/** else */
		hotelRepository.delete(entity);

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
