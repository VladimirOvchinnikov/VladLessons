create table if not exists companies (
id serial primary key,
name varchar,
created_at timestamp default now()
);


create table if not exists products (
id serial primary key,
name varchar,
created_at timestamp default now(),
company_id integer not null references companies (id)
);