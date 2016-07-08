package test4.main.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import test4.main.domain.Role;
import test4.main.domain.UserAccount;
import test4.main.domain.UserGroup;

/**
 * Builder for Role class.
 */
public class RoleBuilder {

	private String name;
	private String state_;
	private Integer permission;
	private Date createdDate;
	private String createdBy;
	private Date lastUpdated;
	private String lastUpdatedBy;

	private UserAccount useraccount;
	private UserGroup usergroup;

	/**
	 * Static factory method for RoleBuilder
	 */
	public static RoleBuilder role() {
		return new RoleBuilder();
	}

	public RoleBuilder() {
	}

	public RoleBuilder name(String val) {
		this.name = val;
		return this;
	}

	public RoleBuilder state_(String val) {
		this.state_ = val;
		return this;
	}

	public RoleBuilder permission(Integer val) {
		this.permission = val;
		return this;
	}

	public RoleBuilder createdDate(Date val) {
		this.createdDate = val;
		return this;
	}

	public RoleBuilder createdBy(String val) {
		this.createdBy = val;
		return this;
	}

	public RoleBuilder lastUpdated(Date val) {
		this.lastUpdated = val;
		return this;
	}

	public RoleBuilder lastUpdatedBy(String val) {
		this.lastUpdatedBy = val;
		return this;
	}

	public RoleBuilder useraccount(UserAccount useraccount) {
		this.useraccount = useraccount;
		return this;
	}

	public RoleBuilder usergroup(UserGroup usergroup) {
		this.usergroup = usergroup;
		return this;
	}

	@Column(name = "NAME", nullable = false, length = 100)
	@NotNull
	public String getName() {
		return name;
	}

	@Column(name = "STATE_", nullable = false, length = 100)
	@NotNull
	public String getState_() {
		return state_;
	}

	@Column(name = "PERMISSION", nullable = false)
	@NotNull
	public Integer getPermission() {
		return permission;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATEDDATE")
	public Date getCreatedDate() {
		return createdDate;
	}

	@Column(name = "CREATEDBY", length = 50)
	public String getCreatedBy() {
		return createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LASTUPDATED")
	public Date getLastUpdated() {
		return lastUpdated;
	}

	@Column(name = "LASTUPDATEDBY", length = 50)
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public UserAccount getUseraccount() {
		return useraccount;
	}

	public UserGroup getUsergroup() {
		return usergroup;
	}

	/**
	 * @return new Role instance constructed based on the values that have been set into this builder
	 */
	public Role build() {
		Role obj = new Role();
		obj.setName(name);
		obj.setState_(state_);
		obj.setPermission(permission);
		obj.setCreatedDate(createdDate);
		obj.setCreatedBy(createdBy);
		obj.setLastUpdated(lastUpdated);
		obj.setLastUpdatedBy(lastUpdatedBy);
		obj.setUseraccount(useraccount);
		obj.setUsergroup(usergroup);

		return obj;
	}
}
