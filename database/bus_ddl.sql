show databases;
DROP DATABASE IF EXISTS brms;
CREATE database brms;
use brms;
CREATE TABLE bus(Bus_Reg_No varchar(10),Source varchar(20), Destination varchar(20), Bus_Type varchar(10),Berth varchar(10),No_of_Seats numeric);
ALTER TABLE bus ADD PRIMARY KEY (Bus_Reg_No);
ALTER TABLE bus MODIFY COLUMN Berth char(5);
DESC bus;

