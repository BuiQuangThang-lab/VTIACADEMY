CREATE DATABASE InputTesing;
USE InputTesing;
CREATE TABLE Department(
   DepartmentID int auto_increment primary key,
   DepartmentName varchar(50) unique
);

CREATE TABLE Positions (
   PositionID int auto_increment primary key,
   PositionName varchar(50) unique
);

create table Account(
   AccountID int auto_increment primary key,
   Email varchar(50) unique,
   UserName varchar(50),
   FullName varchar(50),
   DepartmentID int,
   foreign key Department(DepartmentID),
   Position_ID int,
   
   CreateDate date,
   
);

