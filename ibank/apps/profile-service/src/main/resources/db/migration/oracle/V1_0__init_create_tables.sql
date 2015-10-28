declare
    t_count INTEGER;
    v_sql varchar2(2000) := '
    create table CSL_CUSTOMERS (
       id number(19,0) not null,
       country_code varchar(3) not null,
       customer_id varchar(10) not null,
       login varchar(32) not null,
       customer_name varchar(100) not null,
       last_upate timestamp default sysdate not null,
       primary key (id)
    )';
begin

  select count(*) into t_count from user_sequences where sequence_name = 'HIBERNATE_SEQUENCE';
  if t_count = 0 then
    execute immediate 'create sequence HIBERNATE_SEQUENCE minvalue 1000';
  end if;

  select count(*) into t_count from user_tables where table_name = 'CSL_CUSTOMERS';
  if t_count = 0 then
    execute immediate v_sql;
  end if;

end;
