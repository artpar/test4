package test4.main.domain;

import org.sculptor.framework.domain.LeafProperty;
import org.sculptor.framework.domain.PropertiesCollection;
import org.sculptor.framework.domain.Property;
import test4.main.domain.Booking;
import test4.main.domain.HotelProperties.HotelProperty;
import test4.main.domain.UserAccountProperties.UserAccountProperty;
import test4.main.domain.UserGroupProperties.UserGroupProperty;

/**
 * This generated interface defines property names for all attributes and associatations in {@link test4.main.domain.Booking}.
 * <p>
 * These properties are useful when building criteria with {@link org.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class BookingProperties {

	private BookingProperties() {
	}

	private static final BookingPropertiesImpl<Booking> sharedInstance = new BookingPropertiesImpl<Booking>(Booking.class);

	public static Property<Booking> id() {
		return sharedInstance.id();
	}

	public static Property<Booking> startDate() {
		return sharedInstance.startDate();
	}

	public static Property<Booking> endDate() {
		return sharedInstance.endDate();
	}

	public static Property<Booking> roomCount() {
		return sharedInstance.roomCount();
	}

	public static Property<Booking> state_() {
		return sharedInstance.state_();
	}

	public static Property<Booking> permission() {
		return sharedInstance.permission();
	}

	public static Property<Booking> uuid() {
		return sharedInstance.uuid();
	}

	public static Property<Booking> createdDate() {
		return sharedInstance.createdDate();
	}

	public static Property<Booking> createdBy() {
		return sharedInstance.createdBy();
	}

	public static Property<Booking> lastUpdated() {
		return sharedInstance.lastUpdated();
	}

	public static Property<Booking> lastUpdatedBy() {
		return sharedInstance.lastUpdatedBy();
	}

	public static Property<Booking> version() {
		return sharedInstance.version();
	}

	public static HotelProperty<Booking> hotel() {
		return sharedInstance.hotel();
	}

	public static UserAccountProperty<Booking> useraccount() {
		return sharedInstance.useraccount();
	}

	public static UserGroupProperty<Booking> usergroup() {
		return sharedInstance.usergroup();
	}

	/**
	 * This class is used for references to {@link test4.main.domain.Booking}, i.e. nested property.
	 */
	public static class BookingProperty<T> extends BookingPropertiesImpl<T> implements Property<T> {
		private static final long serialVersionUID = 1L;

		public BookingProperty(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath, owningClass);
		}
	}

	protected static class BookingPropertiesImpl<T> extends PropertiesCollection {
		private static final long serialVersionUID = 1L;
		Class<T> owningClass;

		BookingPropertiesImpl(Class<T> owningClass) {
			super(null);
			this.owningClass = owningClass;
		}

		BookingPropertiesImpl(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath);
			this.owningClass = owningClass;
		}

		public Property<T> id() {
			return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
		}

		public Property<T> startDate() {
			return new LeafProperty<T>(getParentPath(), "startDate", false, owningClass);
		}

		public Property<T> endDate() {
			return new LeafProperty<T>(getParentPath(), "endDate", false, owningClass);
		}

		public Property<T> roomCount() {
			return new LeafProperty<T>(getParentPath(), "roomCount", false, owningClass);
		}

		public Property<T> state_() {
			return new LeafProperty<T>(getParentPath(), "state_", false, owningClass);
		}

		public Property<T> permission() {
			return new LeafProperty<T>(getParentPath(), "permission", false, owningClass);
		}

		public Property<T> uuid() {
			return new LeafProperty<T>(getParentPath(), "uuid", false, owningClass);
		}

		public Property<T> createdDate() {
			return new LeafProperty<T>(getParentPath(), "createdDate", false, owningClass);
		}

		public Property<T> createdBy() {
			return new LeafProperty<T>(getParentPath(), "createdBy", false, owningClass);
		}

		public Property<T> lastUpdated() {
			return new LeafProperty<T>(getParentPath(), "lastUpdated", false, owningClass);
		}

		public Property<T> lastUpdatedBy() {
			return new LeafProperty<T>(getParentPath(), "lastUpdatedBy", false, owningClass);
		}

		public Property<T> version() {
			return new LeafProperty<T>(getParentPath(), "version", false, owningClass);
		}

		public HotelProperty<T> hotel() {
			return new HotelProperty<T>(getParentPath(), "hotel", owningClass);
		}

		public UserAccountProperty<T> useraccount() {
			return new UserAccountProperty<T>(getParentPath(), "useraccount", owningClass);
		}

		public UserGroupProperty<T> usergroup() {
			return new UserGroupProperty<T>(getParentPath(), "usergroup", owningClass);
		}
	}
}
