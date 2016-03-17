create table nfsx_audit_log (
  id number(19,0) not null,
  action varchar2(64 char) not null,
  last_update timestamp default sysdate not null,
  param1 varchar2(1024 char) not null,
  param2 varchar2(1024 char) not null,
  user_name varchar2(16 char) not null,
  primary key (id)
);

create table cif (
  id number(19,0) not null,
  cif_id varchar2(10 char) not null,
  country_code varchar2(3 char) not null,
  secret_notes varchar2(10 char) not null,
  rm_id varchar2(8 char) not null,
  primary key (id)
);
