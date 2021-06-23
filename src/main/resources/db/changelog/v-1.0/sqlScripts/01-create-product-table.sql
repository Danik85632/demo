create table products (
       id int8 not null,
        cost float8 not null,
        product varchar(255) not null,
        quality int8 not null,
        storage_id int8,
        primary key (id)
    )

