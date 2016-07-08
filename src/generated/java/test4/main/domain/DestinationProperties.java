package test4.main.domain;

import org.sculptor.framework.domain.LeafProperty;
import org.sculptor.framework.domain.PropertiesCollection;
import org.sculptor.framework.domain.Property;
import test4.main.domain.CityProperties.CityProperty;
import test4.main.domain.Destination;
import test4.main.domain.UserAccountProperties.UserAccountProperty;
import test4.main.domain.UserGroupProperties.UserGroupProperty;

/**
 * This generated interface defines property names for all attributes and associatations in {@link test4.main.domain.Destination}.
 * <p>
 * These properties are useful when building criteria with {@link org.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class DestinationProperties {

	private DestinationProperties() {
	}

	private static final DestinationPropertiesImpl<Destination> sharedInstance = new DestinationPropertiesImpl<Destination>(
			Destination.class);

	public static Property<Destination> id() {
		return sharedInstance.id();
	}

	public static Property<Destination> name() {
		return sharedInstance.name();
	}

	public static Property<Destination> state_() {
		return sharedInstance.state_();
	}

	public static Property<Destination> permission() {
		return sharedInstance.permission();
	}

	public static Property<Destination> uuid() {
		return sharedInstance.uuid();
	}

	public static Property<Destination> createdDate() {
		return sharedInstance.createdDate();
	}

	public static Property<Destination> createdBy() {
		return sharedInstance.createdBy();
	}

	public static Property<Destination> lastUpdated() {
		return sharedInstance.lastUpdated();
	}

	public static Property<Destination> lastUpdatedBy() {
		return sharedInstance.lastUpdatedBy();
	}

	public static Property<Destination> version() {
		return sharedInstance.version();
	}

	public static CityProperty<Destination> city() {
		return sharedInstance.city();
	}

	public static UserAccountProperty<Destination> useraccount() {
		return sharedInstance.useraccount();
	}

	public static UserGroupProperty<Destination> usergroup() {
		return sharedInstance.usergroup();
	}

	/**
	 * This class is used for references to {@link test4.main.domain.Destination}, i.e. nested property.
	 */
	public static class DestinationProperty<T> extends DestinationPropertiesImpl<T> implements Property<T> {
		private static final long serialVersionUID = 1L;

		public DestinationProperty(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath, owningClass);
		}
	}

	protected static class DestinationPropertiesImpl<T> extends PropertiesCollection {
		private static final long serialVersionUID = 1L;
		Class<T> owningClass;

		DestinationPropertiesImpl(Class<T> owningClass) {
			super(null);
			this.owningClass = owningClass;
		}

		DestinationPropertiesImpl(String parentPath, String additionalPath, Class<T> owningClass) {
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

		public CityProperty<T> city() {
			return new CityProperty<T>(getParentPath(), "city", owningClass);
		}

		public UserAccountProperty<T> useraccount() {
			return new UserAccountProperty<T>(getParentPath(), "useraccount", owningClass);
		}

		public UserGroupProperty<T> usergroup() {
			return new UserGroupProperty<T>(getParentPath(), "usergroup", owningClass);
		}
	}
}
