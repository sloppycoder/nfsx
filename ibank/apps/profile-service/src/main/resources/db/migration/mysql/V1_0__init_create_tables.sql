
drop table if exists nfsx_customers;

create table nfsx_customers (
 id bigint not null auto_increment,
 country_code varchar(3) not null,
 customer_id varchar(10) not null,
 login varchar(32) not null,
 customer_name varchar(100) not null,
 last_upate timestamp default current_timestamp,
 primary key (id)
 );

