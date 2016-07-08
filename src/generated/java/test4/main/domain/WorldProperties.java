package test4.main.domain;

import org.sculptor.framework.domain.LeafProperty;
import org.sculptor.framework.domain.PropertiesCollection;
import org.sculptor.framework.domain.Property;
import test4.main.domain.UserAccountProperties.UserAccountProperty;
import test4.main.domain.UserGroupProperties.UserGroupProperty;
import test4.main.domain.World;

/**
 * This generated interface defines property names for all attributes and associatations in {@link test4.main.domain.World}.
 * <p>
 * These properties are useful when building criteria with {@link org.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class WorldProperties {

	private WorldProperties() {
	}

	private static final WorldPropertiesImpl<World> sharedInstance = new WorldPropertiesImpl<World>(World.class);

	public static Property<World> id() {
		return sharedInstance.id();
	}

	public static Property<World> name() {
		return sharedInstance.name();
	}

	public static Property<World> defaultpermission() {
		return sharedInstance.defaultpermission();
	}

	public static Property<World> state_() {
		return sharedInstance.state_();
	}

	public static Property<World> permission() {
		return sharedInstance.permission();
	}

	public static Property<World> uuid() {
		return sharedInstance.uuid();
	}

	public static Property<World> createdDate() {
		return sharedInstance.createdDate();
	}

	public static Property<World> createdBy() {
		return sharedInstance.createdBy();
	}

	public static Property<World> lastUpdated() {
		return sharedInstance.lastUpdated();
	}

	public static Property<World> lastUpdatedBy() {
		return sharedInstance.lastUpdatedBy();
	}

	public static Property<World> version() {
		return sharedInstance.version();
	}

	public static UserAccountProperty<World> useraccount() {
		return sharedInstance.useraccount();
	}

	public static UserGroupProperty<World> usergroup() {
		return sharedInstance.usergroup();
	}

	/**
	 * This class is used for references to {@link test4.main.domain.World}, i.e. nested property.
	 */
	public static class WorldProperty<T> extends WorldPropertiesImpl<T> implements Property<T> {
		private static final long serialVersionUID = 1L;

		public WorldProperty(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath, owningClass);
		}
	}

	protected static class WorldPropertiesImpl<T> extends PropertiesCollection {
		private static final long serialVersionUID = 1L;
		Class<T> owningClass;

		WorldPropertiesImpl(Class<T> owningClass) {
			super(null);
			this.owningClass = owningClass;
		}

		WorldPropertiesImpl(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath);
			this.owningClass = owningClass;
		}

		public Property<T> id() {
			return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
		}

		public Property<T> name() {
			return new LeafProperty<T>(getParentPath(), "name", false, owningClass);
		}

		public Property<T> defaultpermission() {
			return new LeafProperty<T>(getParentPath(), "defaultpermission", false, owningClass);
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

		public UserAccountProperty<T> useraccount() {
			return new UserAccountProperty<T>(getParentPath(), "useraccount", owningClass);
		}

		public UserGroupProperty<T> usergroup() {
			return new UserGroupProperty<T>(getParentPath(), "usergroup", owningClass);
		}
	}
}
