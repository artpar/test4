package test4.main.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import test4.main.domain.UserAccount;

/**
 * Builder for UserAccount class.
 */
public class UserAccountBuilder {

	private String password;
	private String state_;
	private Integer permission;
	private Date createdDate;
	private String createdBy;
	private Date lastUpdated;
	private String lastUpdatedBy;

	/**
	 * Static factory method for UserAccountBuilder
	 */
	public static UserAccountBuilder userAccount() {
		return new UserAccountBuilder();
	}

	public UserAccountBuilder() {
	}

	public UserAccountBuilder password(String val) {
		this.password = val;
		return this;
	}

	public UserAccountBuilder state_(String val) {
		this.state_ = val;
		return this;
	}

	public UserAccountBuilder permission(Integer val) {
		this.permission = val;
		return this;
	}

	public UserAccountBuilder createdDate(Date val) {
		this.createdDate = val;
		return this;
	}

	public UserAccountBuilder createdBy(String val) {
		this.createdBy = val;
		return this;
	}

	public UserAccountBuilder lastUpdated(Date val) {
		this.lastUpdated = val;
		return this;
	}

	public UserAccountBuilder lastUpdatedBy(String val) {
		this.lastUpdatedBy = val;
		return this;
	}

	@Column(name = "PASSWORD", nullable = false, length = 100)
	@NotNull
	public String getPassword() {
		return password;
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

	/**
	 * @return new UserAccount instance constructed based on the values that have been set into this builder
	 */
	public UserAccount build() {
		UserAccount obj = new UserAccount();
		obj.setPassword(password);
		obj.setState_(state_);
		obj.setPermission(permission);
		obj.setCreatedDate(createdDate);
		obj.setCreatedBy(createdBy);
		obj.setLastUpdated(lastUpdated);
		obj.setLastUpdatedBy(lastUpdatedBy);

		return obj;
	}
}
