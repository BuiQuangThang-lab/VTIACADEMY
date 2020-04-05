CREATE DATABASE FresherManage;
USE FresherManage;

-- Exercise1
/* Question1 */
CREATE TABLE Trainee(
 TraineeID             TINYINT AUTO_INCREMENT PRIMARY KEY,
 Full_NAme             VARCHAR(50) NOT NULL,
 Birth_Day             DATE NOT NULL,
 Gender                ENUM('Male','Femail','Unknown') NOT NULL,
 ET_IQ                 TINYINT NOT NULL,
 ET_Gmath              TINYINT NOT NULL,
 ET_English            TINYINT NOT NULL,
 Training_Class        TINYINT NOT NULL,
 Evalution_Notes       TEXT 
);


/* Question2 */
ALTER TABLE Trainee 
ADD COLUMN VTI_Account VARCHAR(50) UNIQUE NOT NULL AFTER Gender;

-- Exercise2
CREATE TABLE USERS(
  ID                 TINYINT AUTO_INCREMENT PRIMARY KEY,
  User_Name          NCHAR(50) NOT NULL ,
  Codes              VARCHAR(5),
  ModifiedDate       DATETIME
);

-- Exercise3
CREATE TABLE Users(
  ID                 tinyint AUTO_INCREMENT PRIMARY KEY,
  User_Name          NCHAR(50) NOT NULL,
  BirthDate          DATE,
  Gender             ENUM('Male','Female','Null','Unknown'),
  IsDeleteFlag       BOOLEAN 
)
;