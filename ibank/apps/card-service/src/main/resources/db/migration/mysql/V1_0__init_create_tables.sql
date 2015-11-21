
drop table if exists ibank_cards ;

create table ibank_cards (
  id bigint not null auto_increment,
  country_code varchar(3) not null,
  product_name varchar(100) not null,
  avail_limit double precision not null,
  balance double precision not null,
  customer_id varchar(10) not null,
  expiry_date date not null,
  last_update timestamp default current_timestamp not null,
  primary key (id)
);
