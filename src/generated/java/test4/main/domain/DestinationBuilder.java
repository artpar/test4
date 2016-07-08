package test4.main.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import test4.main.domain.City;
import test4.main.domain.Destination;
import test4.main.domain.UserAccount;
import test4.main.domain.UserGroup;

/**
 * Builder for Destination class.
 */
public class DestinationBuilder {

	private String name;
	private String state_;
	private Integer permission;
	private Date createdDate;
	private String createdBy;
	private Date lastUpdated;
	private String lastUpdatedBy;

	private City city;
	private UserAccount useraccount;
	private UserGroup usergroup;

	/**
	 * Static factory method for DestinationBuilder
	 */
	public static DestinationBuilder destination() {
		return new DestinationBuilder();
	}

	public DestinationBuilder() {
	}

	public DestinationBuilder name(String val) {
		this.name = val;
		return this;
	}

	public DestinationBuilder state_(String val) {
		this.state_ = val;
		return this;
	}

	public DestinationBuilder permission(Integer val) {
		this.permission = val;
		return this;
	}

	public DestinationBuilder createdDate(Date val) {
		this.createdDate = val;
		return this;
	}

	public DestinationBuilder createdBy(String val) {
		this.createdBy = val;
		return this;
	}

	public DestinationBuilder lastUpdated(Date val) {
		this.lastUpdated = val;
		return this;
	}

	public DestinationBuilder lastUpdatedBy(String val) {
		this.lastUpdatedBy = val;
		return this;
	}

	public DestinationBuilder city(City city) {
		this.city = city;
		return this;
	}

	public DestinationBuilder useraccount(UserAccount useraccount) {
		this.useraccount = useraccount;
		return this;
	}

	public DestinationBuilder usergroup(UserGroup usergroup) {
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

	public City getCity() {
		return city;
	}

	public UserAccount getUseraccount() {
		return useraccount;
	}

	public UserGroup getUsergroup() {
		return usergroup;
	}

	/**
	 * @return new Destination instance constructed based on the values that have been set into this builder
	 */
	public Destination build() {
		Destination obj = new Destination();
		obj.setName(name);
		obj.setState_(state_);
		obj.setPermission(permission);
		obj.setCreatedDate(createdDate);
		obj.setCreatedBy(createdBy);
		obj.setLastUpdated(lastUpdated);
		obj.setLastUpdatedBy(lastUpdatedBy);
		obj.setCity(city);
		obj.setUseraccount(useraccount);
		obj.setUsergroup(usergroup);

		return obj;
	}
}
