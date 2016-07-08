package test4.main.domain;

import org.sculptor.framework.domain.LeafProperty;
import org.sculptor.framework.domain.PropertiesCollection;
import org.sculptor.framework.domain.Property;
import test4.main.domain.City;
import test4.main.domain.TerrProperties.TerrProperty;
import test4.main.domain.UserAccountProperties.UserAccountProperty;
import test4.main.domain.UserGroupProperties.UserGroupProperty;

/**
 * This generated interface defines property names for all attributes and associatations in {@link test4.main.domain.City}.
 * <p>
 * These properties are useful when building criteria with {@link org.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class CityProperties {

	private CityProperties() {
	}

	private static final CityPropertiesImpl<City> sharedInstance = new CityPropertiesImpl<City>(City.class);

	public static Property<City> id() {
		return sharedInstance.id();
	}

	public static Property<City> name() {
		return sharedInstance.name();
	}

	public static Property<City> state_() {
		return sharedInstance.state_();
	}

	public static Property<City> permission() {
		return sharedInstance.permission();
	}

	public static Property<City> uuid() {
		return sharedInstance.uuid();
	}

	public static Property<City> createdDate() {
		return sharedInstance.createdDate();
	}

	public static Property<City> createdBy() {
		return sharedInstance.createdBy();
	}

	public static Property<City> lastUpdated() {
		return sharedInstance.lastUpdated();
	}

	public static Property<City> lastUpdatedBy() {
		return sharedInstance.lastUpdatedBy();
	}

	public static Property<City> version() {
		return sharedInstance.version();
	}

	public static TerrProperty<City> terr() {
		return sharedInstance.terr();
	}

	public static UserAccountProperty<City> useraccount() {
		return sharedInstance.useraccount();
	}

	public static UserGroupProperty<City> usergroup() {
		return sharedInstance.usergroup();
	}

	/**
	 * This class is used for references to {@link test4.main.domain.City}, i.e. nested property.
	 */
	public static class CityProperty<T> extends CityPropertiesImpl<T> implements Property<T> {
		private static final long serialVersionUID = 1L;

		public CityProperty(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath, owningClass);
		}
	}

	protected static class CityPropertiesImpl<T> extends PropertiesCollection {
		private static final long serialVersionUID = 1L;
		Class<T> owningClass;

		CityPropertiesImpl(Class<T> owningClass) {
			super(null);
			this.owningClass = owningClass;
		}

		CityPropertiesImpl(String parentPath, String additionalPath, Class<T> owningClass) {
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

		public TerrProperty<T> terr() {
			return new TerrProperty<T>(getParentPath(), "terr", owningClass);
		}

		public UserAccountProperty<T> useraccount() {
			return new UserAccountProperty<T>(getParentPath(), "useraccount", owningClass);
		}

		public UserGroupProperty<T> usergroup() {
			return new UserGroupProperty<T>(getParentPath(), "usergroup", owningClass);
		}
	}
}
