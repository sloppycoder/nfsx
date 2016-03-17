-- https://gist.github.com/msarhan/10021473

create table users(
    username varchar2(50) not null primary key,
    password varchar2(50) not null,
    enabled number(1) not null
);

create table authorities (
    username varchar2(50) not null,
    authority varchar2(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);

create table groups (
    id number(5) primary key,
    group_name varchar2(50) not null
);

create table group_authorities (
    group_id number(5) not null,
    authority varchar2(50) not null,
    constraint fk_group_authorities_group foreign key(group_id) references groups(id)
);

create table group_members (
    id number(5) primary key,
    username varchar2(50) not null,
    group_id number(5) not null,
    constraint fk_group_members_group foreign key(group_id) references groups(id)
);

create sequence groups_seq
minvalue 0
maxvalue 99999
start with 0
increment by 1
cache 20;

create sequence group_members_seq
minvalue 0
maxvalue 99999
start with 0
increment by 1
cache 20;

create or replace trigger groups_trg
  before insert on groups
  for each row
declare
begin
  select groups_seq.nextval into :NEW.id from dual;
end groups_trg;

create or replace trigger group_members_trg
  before insert on group_members
  for each row
declare
begin
  select group_members_seq.nextval into :NEW.id from dual;
end group_members_trg;
