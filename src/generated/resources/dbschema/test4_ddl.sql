
-- ###########################################
-- # Create
-- ###########################################
-- Create pk sequence
CREATE SEQUENCE hibernate_sequence;

-- Create normal entities
CREATE TABLE USERACCOUNT (
	ID BIGINT NOT NULL,
	PASSWORD VARCHAR(100) NOT NULL,
	STATE VARCHAR(100) NOT NULL,
	PERMISSION INTEGER NOT NULL,
	UUID VARCHAR(36) NOT NULL,
	CREATEDDATE TIMESTAMP,
	CREATEDBY VARCHAR(50),
	LASTUPDATED TIMESTAMP,
	LASTUPDATEDBY VARCHAR(50),
	VERSION BIGINT NOT NULL
);

CREATE TABLE USERGROUP (
	ID BIGINT NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	STATE VARCHAR(100) NOT NULL,
	PERMISSION INTEGER NOT NULL,
	UUID VARCHAR(36) NOT NULL,
	USERACCOUNT BIGINT,
	USERGROUP BIGINT,
	CREATEDDATE TIMESTAMP,
	CREATEDBY VARCHAR(50),
	LASTUPDATED TIMESTAMP,
	LASTUPDATEDBY VARCHAR(50),
	VERSION BIGINT NOT NULL
);

CREATE TABLE TERR (
	ID BIGINT NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	STATE VARCHAR(100) NOT NULL,
	PERMISSION INTEGER NOT NULL,
	UUID VARCHAR(36) NOT NULL,
	USERACCOUNT BIGINT,
	USERGROUP BIGINT,
	CREATEDDATE TIMESTAMP,
	CREATEDBY VARCHAR(50),
	LASTUPDATED TIMESTAMP,
	LASTUPDATEDBY VARCHAR(50),
	VERSION BIGINT NOT NULL
);

CREATE TABLE CITY (
	ID BIGINT NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	STATE VARCHAR(100) NOT NULL,
	PERMISSION INTEGER NOT NULL,
	UUID VARCHAR(36) NOT NULL,
	TERR BIGINT NOT NULL,
	USERACCOUNT BIGINT,
	USERGROUP BIGINT,
	CREATEDDATE TIMESTAMP,
	CREATEDBY VARCHAR(50),
	LASTUPDATED TIMESTAMP,
	LASTUPDATEDBY VARCHAR(50),
	VERSION BIGINT NOT NULL
);

CREATE TABLE DESTINATION (
	ID BIGINT NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	STATE VARCHAR(100) NOT NULL,
	PERMISSION INTEGER NOT NULL,
	UUID VARCHAR(36) NOT NULL,
	CITY BIGINT NOT NULL,
	USERACCOUNT BIGINT,
	USERGROUP BIGINT,
	CREATEDDATE TIMESTAMP,
	CREATEDBY VARCHAR(50),
	LASTUPDATED TIMESTAMP,
	LASTUPDATEDBY VARCHAR(50),
	VERSION BIGINT NOT NULL
);

CREATE TABLE HOTEL (
	ID BIGINT NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	STATE VARCHAR(100) NOT NULL,
	PERMISSION INTEGER NOT NULL,
	UUID VARCHAR(36) NOT NULL,
	DESTINATION BIGINT NOT NULL,
	USERACCOUNT BIGINT,
	USERGROUP BIGINT,
	CREATEDDATE TIMESTAMP,
	CREATEDBY VARCHAR(50),
	LASTUPDATED TIMESTAMP,
	LASTUPDATEDBY VARCHAR(50),
	VERSION BIGINT NOT NULL
);

CREATE TABLE BOOKING (
	ID BIGINT NOT NULL,
	STARTDATE TIMESTAMP NOT NULL,
	ENDDATE TIMESTAMP NOT NULL,
	ROOMCOUNT INTEGER NOT NULL,
	STATE VARCHAR(100) NOT NULL,
	PERMISSION INTEGER NOT NULL,
	UUID VARCHAR(36) NOT NULL,
	HOTEL BIGINT NOT NULL,
	USERACCOUNT BIGINT,
	USERGROUP BIGINT,
	CREATEDDATE TIMESTAMP,
	CREATEDBY VARCHAR(50),
	LASTUPDATED TIMESTAMP,
	LASTUPDATEDBY VARCHAR(50),
	VERSION BIGINT NOT NULL
);

CREATE TABLE ROLE (
	ID BIGINT NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	STATE VARCHAR(100) NOT NULL,
	PERMISSION INTEGER NOT NULL,
	UUID VARCHAR(36) NOT NULL,
	USERACCOUNT BIGINT,
	USERGROUP BIGINT,
	CREATEDDATE TIMESTAMP,
	CREATEDBY VARCHAR(50),
	LASTUPDATED TIMESTAMP,
	LASTUPDATEDBY VARCHAR(50),
	VERSION BIGINT NOT NULL
);

CREATE TABLE WORLD (
	ID BIGINT NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	DEFAULTPERMISSION INTEGER NOT NULL,
	STATE VARCHAR(100) NOT NULL,
	PERMISSION INTEGER NOT NULL,
	UUID VARCHAR(36) NOT NULL,
	USERACCOUNT BIGINT,
	USERGROUP BIGINT,
	CREATEDDATE TIMESTAMP,
	CREATEDBY VARCHAR(50),
	LASTUPDATED TIMESTAMP,
	LASTUPDATEDBY VARCHAR(50),
	VERSION BIGINT NOT NULL
);


-- Create many to many relations

-- Primary keys
ALTER TABLE USERACCOUNT ADD CONSTRAINT PK_USERACCOUNT
	PRIMARY KEY (ID);
ALTER TABLE USERGROUP ADD CONSTRAINT PK_USERGROUP
	PRIMARY KEY (ID);
ALTER TABLE TERR ADD CONSTRAINT PK_TERR
	PRIMARY KEY (ID);
ALTER TABLE CITY ADD CONSTRAINT PK_CITY
	PRIMARY KEY (ID);
ALTER TABLE DESTINATION ADD CONSTRAINT PK_DESTINATION
	PRIMARY KEY (ID);
ALTER TABLE HOTEL ADD CONSTRAINT PK_HOTEL
	PRIMARY KEY (ID);
ALTER TABLE BOOKING ADD CONSTRAINT PK_BOOKING
	PRIMARY KEY (ID);
ALTER TABLE ROLE ADD CONSTRAINT PK_ROLE
	PRIMARY KEY (ID);
ALTER TABLE WORLD ADD CONSTRAINT PK_WORLD
	PRIMARY KEY (ID);

-- Unique constraints
ALTER TABLE USERACCOUNT
	ADD CONSTRAINT UQ_USERACCOUNT UNIQUE (UUID);
ALTER TABLE USERGROUP
	ADD CONSTRAINT UQ_USERGROUP UNIQUE (UUID);
ALTER TABLE TERR
	ADD CONSTRAINT UQ_TERR UNIQUE (UUID);
ALTER TABLE CITY
	ADD CONSTRAINT UQ_CITY UNIQUE (UUID);
ALTER TABLE DESTINATION
	ADD CONSTRAINT UQ_DESTINATION UNIQUE (UUID);
ALTER TABLE HOTEL
	ADD CONSTRAINT UQ_HOTEL UNIQUE (UUID);
ALTER TABLE BOOKING
	ADD CONSTRAINT UQ_BOOKING UNIQUE (UUID);
ALTER TABLE ROLE
	ADD CONSTRAINT UQ_ROLE UNIQUE (UUID);
ALTER TABLE WORLD
	ADD CONSTRAINT UQ_WORLD UNIQUE (UUID);

-- Foreign key constraints


-- Reference from UserGroup.useraccount to UserAccount
ALTER TABLE USERGROUP ADD CONSTRAINT FK_USERGROUP_USERACCOUNT
	FOREIGN KEY (USERACCOUNT) REFERENCES USERACCOUNT (ID);
CREATE INDEX IX_USERGROUP_USERACCOUNT ON USERGROUP (USERACCOUNT);

-- Reference from UserGroup.usergroup to UserGroup
ALTER TABLE USERGROUP ADD CONSTRAINT FK_USERGROUP_USERGROUP
	FOREIGN KEY (USERGROUP) REFERENCES USERGROUP (ID);
CREATE INDEX IX_USERGROUP_USERGROUP ON USERGROUP (USERGROUP);

-- Reference from Terr.useraccount to UserAccount
ALTER TABLE TERR ADD CONSTRAINT FK_TERR_USERACCOUNT
	FOREIGN KEY (USERACCOUNT) REFERENCES USERACCOUNT (ID);
CREATE INDEX IX_TERR_USERACCOUNT ON TERR (USERACCOUNT);

-- Reference from Terr.usergroup to UserGroup
ALTER TABLE TERR ADD CONSTRAINT FK_TERR_USERGROUP
	FOREIGN KEY (USERGROUP) REFERENCES USERGROUP (ID);
CREATE INDEX IX_TERR_USERGROUP ON TERR (USERGROUP);

-- Reference from City.terr to Terr
ALTER TABLE CITY ADD CONSTRAINT FK_CITY_TERR
	FOREIGN KEY (TERR) REFERENCES TERR (ID);
CREATE INDEX IX_CITY_TERR ON CITY (TERR);

-- Reference from City.useraccount to UserAccount
ALTER TABLE CITY ADD CONSTRAINT FK_CITY_USERACCOUNT
	FOREIGN KEY (USERACCOUNT) REFERENCES USERACCOUNT (ID);
CREATE INDEX IX_CITY_USERACCOUNT ON CITY (USERACCOUNT);

-- Reference from City.usergroup to UserGroup
ALTER TABLE CITY ADD CONSTRAINT FK_CITY_USERGROUP
	FOREIGN KEY (USERGROUP) REFERENCES USERGROUP (ID);
CREATE INDEX IX_CITY_USERGROUP ON CITY (USERGROUP);

-- Reference from Destination.city to City
ALTER TABLE DESTINATION ADD CONSTRAINT FK_DESTINATION_CITY
	FOREIGN KEY (CITY) REFERENCES CITY (ID);
CREATE INDEX IX_DESTINATION_CITY ON DESTINATION (CITY);

-- Reference from Destination.useraccount to UserAccount
ALTER TABLE DESTINATION ADD CONSTRAINT FK_DESTINATION_USERACCOUNT
	FOREIGN KEY (USERACCOUNT) REFERENCES USERACCOUNT (ID);
CREATE INDEX IX_DESTINATION_USERACCOUNT ON DESTINATION (USERACCOUNT);

-- Reference from Destination.usergroup to UserGroup
ALTER TABLE DESTINATION ADD CONSTRAINT FK_DESTINATION_USERGROUP
	FOREIGN KEY (USERGROUP) REFERENCES USERGROUP (ID);
CREATE INDEX IX_DESTINATION_USERGROUP ON DESTINATION (USERGROUP);

-- Reference from Hotel.destination to Destination
ALTER TABLE HOTEL ADD CONSTRAINT FK_HOTEL_DESTINATION
	FOREIGN KEY (DESTINATION) REFERENCES DESTINATION (ID);
CREATE INDEX IX_HOTEL_DESTINATION ON HOTEL (DESTINATION);

-- Reference from Hotel.useraccount to UserAccount
ALTER TABLE HOTEL ADD CONSTRAINT FK_HOTEL_USERACCOUNT
	FOREIGN KEY (USERACCOUNT) REFERENCES USERACCOUNT (ID);
CREATE INDEX IX_HOTEL_USERACCOUNT ON HOTEL (USERACCOUNT);

-- Reference from Hotel.usergroup to UserGroup
ALTER TABLE HOTEL ADD CONSTRAINT FK_HOTEL_USERGROUP
	FOREIGN KEY (USERGROUP) REFERENCES USERGROUP (ID);
CREATE INDEX IX_HOTEL_USERGROUP ON HOTEL (USERGROUP);

-- Reference from Booking.hotel to Hotel
ALTER TABLE BOOKING ADD CONSTRAINT FK_BOOKING_HOTEL
	FOREIGN KEY (HOTEL) REFERENCES HOTEL (ID);
CREATE INDEX IX_BOOKING_HOTEL ON BOOKING (HOTEL);

-- Reference from Booking.useraccount to UserAccount
ALTER TABLE BOOKING ADD CONSTRAINT FK_BOOKING_USERACCOUNT
	FOREIGN KEY (USERACCOUNT) REFERENCES USERACCOUNT (ID);
CREATE INDEX IX_BOOKING_USERACCOUNT ON BOOKING (USERACCOUNT);

-- Reference from Booking.usergroup to UserGroup
ALTER TABLE BOOKING ADD CONSTRAINT FK_BOOKING_USERGROUP
	FOREIGN KEY (USERGROUP) REFERENCES USERGROUP (ID);
CREATE INDEX IX_BOOKING_USERGROUP ON BOOKING (USERGROUP);

-- Reference from Role.useraccount to UserAccount
ALTER TABLE ROLE ADD CONSTRAINT FK_ROLE_USERACCOUNT
	FOREIGN KEY (USERACCOUNT) REFERENCES USERACCOUNT (ID);
CREATE INDEX IX_ROLE_USERACCOUNT ON ROLE (USERACCOUNT);

-- Reference from Role.usergroup to UserGroup
ALTER TABLE ROLE ADD CONSTRAINT FK_ROLE_USERGROUP
	FOREIGN KEY (USERGROUP) REFERENCES USERGROUP (ID);
CREATE INDEX IX_ROLE_USERGROUP ON ROLE (USERGROUP);

-- Reference from World.useraccount to UserAccount
ALTER TABLE WORLD ADD CONSTRAINT FK_WORLD_USERACCOUNT
	FOREIGN KEY (USERACCOUNT) REFERENCES USERACCOUNT (ID);
CREATE INDEX IX_WORLD_USERACCOUNT ON WORLD (USERACCOUNT);

-- Reference from World.usergroup to UserGroup
ALTER TABLE WORLD ADD CONSTRAINT FK_WORLD_USERGROUP
	FOREIGN KEY (USERGROUP) REFERENCES USERGROUP (ID);
CREATE INDEX IX_WORLD_USERGROUP ON WORLD (USERGROUP);

-- Index