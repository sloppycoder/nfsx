 DROP DATABASE IF EXISTS carddb;
 DROP USER IF EXISTS 'cardsvc'@'localhost';
 DROP USER IF EXISTS 'cardsvc'@'%';

 CREATE DATABASE carddb CHARACTER SET utf8 COLLATE utf8_general_ci;
 CREATE USER 'cardsvc'@'localhost' IDENTIFIED BY 'password';
 CREATE USER 'cardsvc'@'%' IDENTIFIED BY 'password';
 GRANT ALL PRIVILEGES ON carddb.* TO 'cardsvc'@'localhost';
 GRANT ALL PRIVILEGES ON carddb.* TO 'cardsvc'@'%';

 DROP DATABASE IF EXISTS profdb;
 DROP USER IF EXISTS 'profsvc'@'localhost';
 DROP USER IF EXISTS 'profsvc'@'%';

 CREATE DATABASE `profdb` CHARACTER SET utf8 COLLATE utf8_general_ci;
 CREATE USER 'profsvc'@'localhost' IDENTIFIED BY 'password';
 CREATE USER 'profsvc'@'%' IDENTIFIED BY 'password';
 GRANT ALL PRIVILEGES ON profdb.* TO 'profsvc'@'localhost';
 GRANT ALL PRIVILEGES ON profdb.* TO 'profsvc'@'%';
