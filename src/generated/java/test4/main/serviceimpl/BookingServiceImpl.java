package test4.main.serviceimpl;

import java.util.List;
import org.sculptor.framework.context.ServiceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test4.main.domain.Booking;
import test4.main.domain.BookingRepository;
import test4.main.exception.BookingNotFoundException;
import test4.main.serviceapi.BookingService;

import java.util.Objects;
import java.util.Set;

/**
 * Implementation of BookingService.
 */
@Service("bookingService")
public class BookingServiceImpl implements BookingService {

	public BookingServiceImpl() {
	}

	@Autowired
	private BookingRepository bookingRepository;

	protected BookingRepository getBookingRepository() {
		return bookingRepository;
	}

	/** new change */
	/**
	 * Delegates to {@link test4.main.domain.BookingRepository#findById}
	 */
	public Booking findById(ServiceContext ctx, Long id) throws BookingNotFoundException {
		/** delegate */
		/** else */
		Booking all = bookingRepository.findById(id);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.Booking --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@3290b1a6 (name: Booking, doc: null, hint: null) (abstract: false, optimisticLocking:
		// true, cache: false, package: null, databaseTable: BOOKING, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.Booking temp = all;
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
	 * Delegates to {@link test4.main.domain.BookingRepository#findAll}
	 */
	public List<Booking> findAll(ServiceContext ctx) {
		/** delegate */
		/** else */
		List<Booking> all = bookingRepository.findAll();

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// java.util.List<test4.main.domain.Booking> --- List --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@3290b1a6 (name: Booking, doc: null, hint: null) (abstract: false, optimisticLocking:
		// true, cache: false, package: null, databaseTable: BOOKING, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// for ( Booking temp : all ) {
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
	 * Delegates to {@link test4.main.domain.BookingRepository#save}
	 */
	public Booking save(ServiceContext ctx, Booking entity) {
		/** delegate */
		/** else */
		Booking all = bookingRepository.save(entity);

		// String userId = ctx.getUserId();
		// Set<String> groups = ctx.getRoles();
		//
		//
		// Boolean isOwner = false;
		// Boolean isGroup = false;
		// test4.main.domain.Booking --- --- class sculptormetamodel.impl.ServiceOperationImpl ---
		// sculptormetamodel.impl.EntityImpl@3290b1a6 (name: Booking, doc: null, hint: null) (abstract: false, optimisticLocking:
		// true, cache: false, package: null, databaseTable: BOOKING, extendsName: null, validate: null, gapClass: false,
		// discriminatorColumnValue: null, aggregateRoot: true) (auditable: true)
		//
		// test4.main.domain.Booking temp = all;
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
	 * Delegates to {@link test4.main.domain.BookingRepository#delete}
	 */
	public void delete(ServiceContext ctx, Booking entity) {
		/** delegate */
		/** else */
		bookingRepository.delete(entity);

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
