create table dbconstants
(
    id         BIGINT AUTO_INCREMENT not null,
    created_at datetime(6)           not null,
    updated_at datetime(6)           not null,
    name       varchar(255)          not null,
    value      VARCHAR(255)          NULL,
    constraint pk_dbconstants primary key (id)
);

alter table dbconstants
    add constraint uc_dbconstants_name unique (name);