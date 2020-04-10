DROP DATABASE IF EXISTS FresherManage;
CREATE DATABASE FresherManage;
USE FresherManage;

-- Exercise1
/* Question1 */
DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee(
 TraineeID             TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 Full_Name             VARCHAR(50) NOT NULL,
 Birth_Day             DATE NOT NULL,
 Gender                ENUM('Male','Female','Unknown') NOT NULL,
 ET_IQ                 TINYINT UNSIGNED CHECK (ET_IQ <= 20) ,
 ET_Gmath              TINYINT UNSIGNED CHECK (ET_Gmath <=20),
 ET_English            TINYINT UNSIGNED CHECK (ET_English <=50),
 Training_Class        TINYINT UNSIGNED NOT NULL,
 Evalution_Notes       TEXT 
);


/* Question2 */
ALTER TABLE Trainee 
ADD COLUMN VTI_Account VARCHAR(50) UNIQUE NOT NULL AFTER Gender;

-- Exercise2
DROP TABLE IF EXISTS USERS;
CREATE TABLE USERS(
  ID                 INT AUTO_INCREMENT PRIMARY KEY,
  User_Name          VARCHAR(50) NOT NULL ,
  Codes              CHAR(5),
  ModifiedDate       DATETIME
);

-- Exercise3
DROP TABLE IF EXISTS Users;
CREATE TABLE Users(
  ID                 INT AUTO_INCREMENT PRIMARY KEY,
  `Name`             VARCHAR(50) NOT NULL,
  BirthDate          DATE,
  Gender             ENUM('Male','Female','Null','Unknown'),
  IsDeleteFlag       BIT
)
;