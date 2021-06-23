create table storages (
       id int8 not null,
        primary key (id)
    );

     alter table products
       add constraint product_storage_fk
       foreign key (storage_id)
       references storages