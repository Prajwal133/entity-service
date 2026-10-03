alter table booking
    add end_location_id BIGINT null;

alter table booking
    add start_location_id BIGINT null;

alter table passenger
    add home_location_id BIGINT null;

alter table passenger
    add rating double null;

alter table driver
    add is_availabel BIT(1) null;

alter table driver
    modify is_availabel BIT(1) NOT NULL;

alter table booking
    add constraint FK_BOOKING_ON_ENDLOCATION foreign key (end_location_id) references exact_location (id);

alter table booking
    add constraint FK_BOOKING_ON_STARTLOCATION foreign key (start_location_id) references exact_location (id);

alter table passenger
    add constraint FK_PASSENGER_ON_HOMELOCATION foreign key (home_location_id) references exact_location (id);

alter table driver
    drop column driver_approval_status;

alter table driver
    add driver_approval_status varchar(255) null;

alter table review
    drop column reviewer_type;

alter table review
    add reviewer_type varchar(255) null;