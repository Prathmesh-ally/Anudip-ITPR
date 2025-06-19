-- Create a new database named Student1
create database Student1;

-- Delete the existing database named 'world' (if it exists)
drop database world;

-- Switch to using the Student1 database
use Student1;

-- Create a new table named 'info' with three columns: id, Name, and CITYS
create table info(
    id int PRIMARY KEY,         -- 'id' is of type integer and is the primary key (unique for each row)
    Name varchar(50),           -- 'Name' is a variable-length string (max 50 characters)
    CITYS varchar(15)           -- 'CITYS' is a variable-length string (max 15 characters)
);
-- Insert a row into 'info' with id = 1
insert into info(id , Name , Citys) values(1, 'Prathmesh', 'Panvel');
-- Insert a row into 'info' with id = 2
insert into info(id , Name , Citys) values(2, 'Tanishq', 'Yavatmal');
-- Insert a row into 'info' with id = 3
insert into info(id , Name , Citys) values(3, 'Aditya', 'Talegaon');

-- Update the row where id = 1 to change Name and Citys values
UPDATE info 
SET Name = 'Om', Citys = 'Mahabaleshwar' 
WHERE id = 1;

-- Retrieve and display all rows from the 'info' table
select * from info;

-- Create a new database named 'Student2' only if it doesn’t already exist
create database if not EXISTS Student2;
