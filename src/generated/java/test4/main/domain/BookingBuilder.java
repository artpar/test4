package test4.main.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Type;
import test4.main.domain.Booking;
import test4.main.domain.Hotel;
import test4.main.domain.UserAccount;
import test4.main.domain.UserGroup;

/**
 * Builder for Booking class.
 */
public class BookingBuilder {

	private Date startDate;
	private Date endDate;
	private Integer roomCount;
	private String state_;
	private Integer permission;
	private Date createdDate;
	private String createdBy;
	private Date lastUpdated;
	private String lastUpdatedBy;

	private Hotel hotel;
	private UserAccount useraccount;
	private UserGroup usergroup;

	/**
	 * Static factory method for BookingBuilder
	 */
	public static BookingBuilder booking() {
		return new BookingBuilder();
	}

	public BookingBuilder() {
	}

	public BookingBuilder startDate(Date val) {
		this.startDate = val;
		return this;
	}

	public BookingBuilder endDate(Date val) {
		this.endDate = val;
		return this;
	}

	public BookingBuilder roomCount(Integer val) {
		this.roomCount = val;
		return this;
	}

	public BookingBuilder state_(String val) {
		this.state_ = val;
		return this;
	}

	public BookingBuilder permission(Integer val) {
		this.permission = val;
		return this;
	}

	public BookingBuilder createdDate(Date val) {
		this.createdDate = val;
		return this;
	}

	public BookingBuilder createdBy(String val) {
		this.createdBy = val;
		return this;
	}

	public BookingBuilder lastUpdated(Date val) {
		this.lastUpdated = val;
		return this;
	}

	public BookingBuilder lastUpdatedBy(String val) {
		this.lastUpdatedBy = val;
		return this;
	}

	public BookingBuilder hotel(Hotel hotel) {
		this.hotel = hotel;
		return this;
	}

	public BookingBuilder useraccount(UserAccount useraccount) {
		this.useraccount = useraccount;
		return this;
	}

	public BookingBuilder usergroup(UserGroup usergroup) {
		this.usergroup = usergroup;
		return this;
	}

	@Column(name = "STARTDATE", nullable = false)
	@Type(type = "date")
	@NotNull
	public Date getStartDate() {
		return startDate;
	}

	@Column(name = "ENDDATE", nullable = false)
	@Type(type = "date")
	@NotNull
	public Date getEndDate() {
		return endDate;
	}

	@Column(name = "ROOMCOUNT", nullable = false)
	@NotNull
	public Integer getRoomCount() {
		return roomCount;
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

	public Hotel getHotel() {
		return hotel;
	}

	public UserAccount getUseraccount() {
		return useraccount;
	}

	public UserGroup getUsergroup() {
		return usergroup;
	}

	/**
	 * @return new Booking instance constructed based on the values that have been set into this builder
	 */
	public Booking build() {
		Booking obj = new Booking();
		obj.setStartDate(startDate);
		obj.setEndDate(endDate);
		obj.setRoomCount(roomCount);
		obj.setState_(state_);
		obj.setPermission(permission);
		obj.setCreatedDate(createdDate);
		obj.setCreatedBy(createdBy);
		obj.setLastUpdated(lastUpdated);
		obj.setLastUpdatedBy(lastUpdatedBy);
		obj.setHotel(hotel);
		obj.setUseraccount(useraccount);
		obj.setUsergroup(usergroup);

		return obj;
	}
}
