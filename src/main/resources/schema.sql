create table if not exists orders (
    id identity,
    delivery_name varchar(50) not null,
    delivery_street varchar(50) not null,
    delivery_city varchar(50) not null,
    delivery_state varchar(2) not null,
    delivery_zip varchar(10) not null,
    cc_number varchar(16) not null,
    cc_expiration varchar(5) not null,
    cc_cvv varchar(3) not null
);

create table if not exists ingredients (
    id identity,
    name varchar(25) not null,
    type varchar(10) not null
);

create table if not exists tacos (
    id identity,
    name varchar(50) not null,
    taco_order bigint not null,
    taco_order_key bigint not null
);

create table if not exists ingredient_taco (
    ingredient bigint not null,
    taco bigint not null,
    taco_key bigint not null
);

alter table tacos add foreign key (taco_order) references orders(id);
alter table ingredient_taco add foreign key (ingredient) references ingredients(id);