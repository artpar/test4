package test4.main.domain;

import org.sculptor.framework.domain.LeafProperty;
import org.sculptor.framework.domain.PropertiesCollection;
import org.sculptor.framework.domain.Property;
import test4.main.domain.DestinationProperties.DestinationProperty;
import test4.main.domain.Hotel;
import test4.main.domain.UserAccountProperties.UserAccountProperty;
import test4.main.domain.UserGroupProperties.UserGroupProperty;

/**
 * This generated interface defines property names for all attributes and associatations in {@link test4.main.domain.Hotel}.
 * <p>
 * These properties are useful when building criteria with {@link org.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class HotelProperties {

	private HotelProperties() {
	}

	private static final HotelPropertiesImpl<Hotel> sharedInstance = new HotelPropertiesImpl<Hotel>(Hotel.class);

	public static Property<Hotel> id() {
		return sharedInstance.id();
	}

	public static Property<Hotel> name() {
		return sharedInstance.name();
	}

	public static Property<Hotel> state_() {
		return sharedInstance.state_();
	}

	public static Property<Hotel> permission() {
		return sharedInstance.permission();
	}

	public static Property<Hotel> uuid() {
		return sharedInstance.uuid();
	}

	public static Property<Hotel> createdDate() {
		return sharedInstance.createdDate();
	}

	public static Property<Hotel> createdBy() {
		return sharedInstance.createdBy();
	}

	public static Property<Hotel> lastUpdated() {
		return sharedInstance.lastUpdated();
	}

	public static Property<Hotel> lastUpdatedBy() {
		return sharedInstance.lastUpdatedBy();
	}

	public static Property<Hotel> version() {
		return sharedInstance.version();
	}

	public static DestinationProperty<Hotel> destination() {
		return sharedInstance.destination();
	}

	public static UserAccountProperty<Hotel> useraccount() {
		return sharedInstance.useraccount();
	}

	public static UserGroupProperty<Hotel> usergroup() {
		return sharedInstance.usergroup();
	}

	/**
	 * This class is used for references to {@link test4.main.domain.Hotel}, i.e. nested property.
	 */
	public static class HotelProperty<T> extends HotelPropertiesImpl<T> implements Property<T> {
		private static final long serialVersionUID = 1L;

		public HotelProperty(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath, owningClass);
		}
	}

	protected static class HotelPropertiesImpl<T> extends PropertiesCollection {
		private static final long serialVersionUID = 1L;
		Class<T> owningClass;

		HotelPropertiesImpl(Class<T> owningClass) {
			super(null);
			this.owningClass = owningClass;
		}

		HotelPropertiesImpl(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath);
			this.owningClass = owningClass;
		}

		public Property<T> id() {
			return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
		}

		public Property<T> name() {
			return new LeafProperty<T>(getParentPath(), "name", false, owningClass);
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

		public DestinationProperty<T> destination() {
			return new DestinationProperty<T>(getParentPath(), "destination", owningClass);
		}

		public UserAccountProperty<T> useraccount() {
			return new UserAccountProperty<T>(getParentPath(), "useraccount", owningClass);
		}

		public UserGroupProperty<T> usergroup() {
			return new UserGroupProperty<T>(getParentPath(), "usergroup", owningClass);
		}
	}
}
