package test4.main.domain;

import java.util.Date;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.ForeignKey;
import org.sculptor.framework.domain.AbstractDomainObject;
import org.sculptor.framework.domain.AuditListener;
import org.sculptor.framework.domain.Auditable;
import org.sculptor.framework.domain.Identifiable;
import test4.main.domain.City;
import test4.main.domain.UserAccount;
import test4.main.domain.UserGroup;

/**
 * Entity representing Destination.
 */

@Entity
@Table(name = "DESTINATION")
@EntityListeners({ AuditListener.class })
public class Destination extends AbstractDomainObject implements Auditable, Identifiable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String state_;
	private Integer permission;
	private String uuid;
	private Date createdDate;
	private String createdBy;
	private Date lastUpdated;
	private String lastUpdatedBy;
	private Long version;

	private City city;
	private UserAccount useraccount;
	private UserGroup usergroup;

	public Destination() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	/**
	 * The id is not intended to be changed or assigned manually, but for test purpose it is allowed to assign the id.
	 */
	protected void setId(Long id) {
		if ((this.id != null) && !this.id.equals(id)) {
			throw new IllegalArgumentException("Not allowed to change the id property.");
		}
		this.id = id;
	}

	@Column(name = "NAME", nullable = false, length = 100)
	@NotNull
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	@Column(name = "STATE_", nullable = false, length = 100)
	@NotNull
	public String getState_() {
		return state_;
	}

	public void setState_(String state_) {
		this.state_ = state_;

	}

	@Column(name = "PERMISSION", nullable = false)
	@NotNull
	public Integer getPermission() {
		return permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;

	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATEDDATE")
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;

	}

	@Column(name = "CREATEDBY", length = 50)
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;

	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LASTUPDATED")
	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;

	}

	@Column(name = "LASTUPDATEDBY", length = 50)
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;

	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;

	}

	/**
	 * This domain object doesn't have a natural key and this random generated identifier is the unique identifier for this domain
	 * object.
	 */
	@Column(name = "UUID", nullable = false, length = 36, unique = true)
	public String getUuid() {
		// lazy init of UUID
		if (uuid == null) {
			uuid = UUID.randomUUID().toString();
		}
		return uuid;
	}

	@SuppressWarnings("unused")
	private void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "CITY", nullable = false)
	@ForeignKey(name = "FK_DESTINATION_CITY")
	@NotNull
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "USERACCOUNT")
	@ForeignKey(name = "FK_DESTINATION_USERACCOUNT")
	public UserAccount getUseraccount() {
		return useraccount;
	}

	public void setUseraccount(UserAccount useraccount) {
		this.useraccount = useraccount;
	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "USERGROUP")
	@ForeignKey(name = "FK_DESTINATION_USERGROUP")
	public UserGroup getUsergroup() {
		return usergroup;
	}

	public void setUsergroup(UserGroup usergroup) {
		this.usergroup = usergroup;
	}

	/**
	 * This method is used by equals and hashCode.
	 * 
	 * @return {{@link #getUuid}
	 */
	@Transient
	public Object getKey() {
		return getUuid();
	}

}
