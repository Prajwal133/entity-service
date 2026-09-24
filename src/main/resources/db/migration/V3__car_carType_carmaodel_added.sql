create table car
(
    id           BIGINT AUTO_INCREMENT not null,
    created_at   datetime(6)           not null,
    updated_at   datetime(6)           not null,
    plate_number varchar(255)          null,
    brand        varchar(255)          null,
    model        varchar(255)          null,
    car_type     varchar(255)          null,
    color_id     BIGINT                null,
    driver_id    BIGINT                null,
    constraint pk_car primary key (id)
);

create table color
(
    id         BIGINT AUTO_INCREMENT not null,
    created_at datetime(6)           not null,
    updated_at datetime(6)           not null,
    color_name varchar(255)          not null,
    constraint pk_color primary key (id)
);

alter table color
    add constraint uc_color_colorname unique (color_name);

alter table car
    add constraint FK_CAR_ON_COLOR foreign key (color_id) references color (id);

alter table car
    add constraint FK_CAR_ON_DRIVER foreign key (driver_id) references driver (id);