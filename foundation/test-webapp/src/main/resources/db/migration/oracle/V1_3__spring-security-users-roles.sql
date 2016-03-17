
insert into users (username, password, enabled) values ('joe', 'password', 1);
insert into users (username, password, enabled) values ('mary', 'password', 1);

insert into authorities (username, authority) values ('joe', 'ROLE_USER');
insert into authorities (username, authority) values ('mary', 'ROLE_USER');
