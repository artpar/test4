package test4.main.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import test4.main.domain.Terr;
import test4.main.domain.UserAccount;
import test4.main.domain.UserGroup;

/**
 * Builder for Terr class.
 */
public class TerrBuilder {

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
	 * Static factory method for TerrBuilder
	 */
	public static TerrBuilder terr() {
		return new TerrBuilder();
	}

	public TerrBuilder() {
	}

	public TerrBuilder name(String val) {
		this.name = val;
		return this;
	}

	public TerrBuilder state_(String val) {
		this.state_ = val;
		return this;
	}

	public TerrBuilder permission(Integer val) {
		this.permission = val;
		return this;
	}

	public TerrBuilder createdDate(Date val) {
		this.createdDate = val;
		return this;
	}

	public TerrBuilder createdBy(String val) {
		this.createdBy = val;
		return this;
	}

	public TerrBuilder lastUpdated(Date val) {
		this.lastUpdated = val;
		return this;
	}

	public TerrBuilder lastUpdatedBy(String val) {
		this.lastUpdatedBy = val;
		return this;
	}

	public TerrBuilder useraccount(UserAccount useraccount) {
		this.useraccount = useraccount;
		return this;
	}

	public TerrBuilder usergroup(UserGroup usergroup) {
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
	 * @return new Terr instance constructed based on the values that have been set into this builder
	 */
	public Terr build() {
		Terr obj = new Terr();
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
