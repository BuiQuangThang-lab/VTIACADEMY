-- =============================================
-- Create Structure database
-- =============================================

-- Drop the database if it already exists
DROP DATABASE IF EXISTS User;
-- Create database
CREATE DATABASE IF NOT EXISTS `User`;
USE `User`;

-- Create table user
DROP TABLE IF EXISTS manager;
CREATE TABLE IF NOT EXISTS manager ( 	
	`FirstName`	 	CHAR(50),
	`LastName` 		CHAR(50),
	`Phone` 		VARCHAR(800) NOT NULL,
	`Email` 	NVARCHAR(50) NOT NULL,
	`password` 		NVARCHAR(50) NOT NULL,
	`ExpInYear` 		SMALLINT
);
CREATE TABLE IF NOT EXISTS employee ( 	
	`FirstName`	 	CHAR(50),
	`LastName` 		CHAR(50),
	`Phone` 		VARCHAR(800) NOT NULL,
	`Email` 	NVARCHAR(50) NOT NULL,
	`projectName` 		NVARCHAR(50) NOT NULL,
	`ProSkill` 		NVARCHAR(50) NOT NULL
);