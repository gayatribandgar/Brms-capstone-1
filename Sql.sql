DROP DATABASE If EXISTS BRMS;
CREATE DATABASE BRMS;
USE BRMS;
DROP TABLE IF EXISTS Registration;
CREATE TABLE Registration(
	login_id VARCHAR(20) PRIMARY KEY,
	password VARCHAR(20),
    role VARCHAR(20)

);

Insert Into Registration values ('M003','pass','normal'),('M002','pass','admin');
create table route( Route_Id varchar(10) primary key,S_source  varchar(20),Destination varchar (20));
insert into route values
("101","Solapur","Pune"),
("102","Pune" ,"Hyderabad"),
("103","Kolhapur","Sangli"),
("104","Belgaum","Goa"),
("105","Mumbai","Pune"),
("106","Mysore","Benglore"),
("107","Delhi","Gurgaon");
