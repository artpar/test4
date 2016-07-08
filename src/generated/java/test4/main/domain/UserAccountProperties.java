package test4.main.domain;

import org.sculptor.framework.domain.LeafProperty;
import org.sculptor.framework.domain.PropertiesCollection;
import org.sculptor.framework.domain.Property;
import test4.main.domain.UserAccount;

/**
 * This generated interface defines property names for all attributes and associatations in {@link test4.main.domain.UserAccount}.
 * <p>
 * These properties are useful when building criteria with {@link org.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class UserAccountProperties {

	private UserAccountProperties() {
	}

	private static final UserAccountPropertiesImpl<UserAccount> sharedInstance = new UserAccountPropertiesImpl<UserAccount>(
			UserAccount.class);

	public static Property<UserAccount> id() {
		return sharedInstance.id();
	}

	public static Property<UserAccount> password() {
		return sharedInstance.password();
	}

	public static Property<UserAccount> state_() {
		return sharedInstance.state_();
	}

	public static Property<UserAccount> permission() {
		return sharedInstance.permission();
	}

	public static Property<UserAccount> uuid() {
		return sharedInstance.uuid();
	}

	public static Property<UserAccount> createdDate() {
		return sharedInstance.createdDate();
	}

	public static Property<UserAccount> createdBy() {
		return sharedInstance.createdBy();
	}

	public static Property<UserAccount> lastUpdated() {
		return sharedInstance.lastUpdated();
	}

	public static Property<UserAccount> lastUpdatedBy() {
		return sharedInstance.lastUpdatedBy();
	}

	public static Property<UserAccount> version() {
		return sharedInstance.version();
	}

	/**
	 * This class is used for references to {@link test4.main.domain.UserAccount}, i.e. nested property.
	 */
	public static class UserAccountProperty<T> extends UserAccountPropertiesImpl<T> implements Property<T> {
		private static final long serialVersionUID = 1L;

		public UserAccountProperty(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath, owningClass);
		}
	}

	protected static class UserAccountPropertiesImpl<T> extends PropertiesCollection {
		private static final long serialVersionUID = 1L;
		Class<T> owningClass;

		UserAccountPropertiesImpl(Class<T> owningClass) {
			super(null);
			this.owningClass = owningClass;
		}

		UserAccountPropertiesImpl(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath);
			this.owningClass = owningClass;
		}

		public Property<T> id() {
			return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
		}

		public Property<T> password() {
			return new LeafProperty<T>(getParentPath(), "password", false, owningClass);
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
	}
}
