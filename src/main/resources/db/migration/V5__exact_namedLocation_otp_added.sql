create table exact_location
(
    id         BIGINT AUTO_INCREMENT not null,
    created_at datetime(6)           not null,
    updated_at datetime(6)           not null,
    latitude   double                null,
    longitude  double                null,
    constraint pk_exactlocation primary key (id)
);

create table named_location
(
    id                BIGINT AUTO_INCREMENT not null,
    created_at        datetime(6)           not null,
    updated_at        datetime(6)           not null,
    name              varchar(255)          null,
    zip_code          varchar(255)          null,
    city              varchar(255)          null,
    state             varchar(255)          null,
    country           varchar(255)          null,
    exact_location_id BIGINT                null,
    constraint pk_namedlocation primary key (id)
);

create table otp
(
    id             BIGINT AUTO_INCREMENT not null,
    created_at     datetime(6)           not null,
    updated_at     datetime(6)           not null,
    code           varchar(255)          null,
    sent_to_number varchar(255)          null,
    constraint pk_otp primary key (id)
);

alter table car
    add constraint uc_car_platenumber unique (plate_number);

alter table named_location
    add constraint FK_NAMEDLOCATION_ON_EXACTLOCATION foreign key (exact_location_id) references exact_location (id);

alter table car
    modify plate_number varchar(255) not null;