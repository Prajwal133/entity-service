create table review
(
    id            BIGINT AUTO_INCREMENT not null,
    created_at    datetime(6)           not null,
    updated_at    datetime(6)           not null,
    content       varchar(255)          null,
    rating        double                null,
    reviewer_type  ENUM( 'DRIVER_TO_PASSENGER' ,'PASSENGER_TO_DRIVER') null,
    booking_id    BIGINT                null,
    reviewer_id   BIGINT                null,
    reviewee_id   BIGINT                null,
    constraint pk_review primary key (id)
);

alter table driver
    add active_city varchar(255) null;

alter table driver
    add driver_approval_status ENUM ( 'APPROVED','DENIED','PENDING') null;

alter table driver
    add home_location_id BIGINT null;

alter table driver
    add last_known_location_id BIGINT null;

alter table driver
    add rating double null;

alter table driver
    add constraint FK_DRIVER_ON_HOMELOCATION foreign key (home_location_id) references exact_location (id);

alter table driver
    add constraint FK_DRIVER_ON_LASTKNOWNLOCATION foreign key (last_known_location_id) references exact_location (id);

alter table driver
    add constraint  check_rating CHECK (driver.rating >= 0 AND driver.rating <=5);