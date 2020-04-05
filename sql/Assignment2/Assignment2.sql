DROP DATABASE InputTesting;
CREATE DATABASE InputTesting;
USE InputTesing;
CREATE TABLE Departments(
   DepartmentID      TINYINT AUTO_INCREMENT PRIMARY KEY,
   DepartmentName    VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE Positions (
   PositionID       TINYINT AUTO_INCREMENT PRIMARY KEY,
   PositionName     VARCHAR(50) UNIQUE NOT NULL
);

create table Accounts(
   AccountID        MEDIUMINT AUTO_INCREMENT PRIMARY KEY,
   Email            VARCHAR(50) UNIQUE,
   UserName         VARCHAR(50) NOT NULL,
   FullName         VARCHAR(50) NOT NULL,
   DepartmentID     INT UNIQUE AUTO_INCREMENT NOT NULL,
   PositionID       INT UNIQUE AUTO_INCREMENT NOT NULL,
   CreateDate       DATE,
   FOREIGN KEY Accounts(DepartmentID) REFERENCES Departments(DepartmentID),
   FOREIGN KEY Accounts(PositionID) REFERENCES Positions(PositionID)
);
CREATE TABLE Groupx(
  GroupID            SMALLINT AUTO_INCREMENT PRIMARY KEY,
  GroupName          VARCHAR(50) UNIQUE NOT NULL,
  CreatorID          SMALLINT UNIQUE NOT NULL,
  CreateDate         DATE
);
CREATE TABLE GroupAccount(
  GroupID             SMALLINT AUTO_INCREMENT UNIQUE NOT NULL,
  AccountID           MEDIUMINT AUTO_INCREMENT UNIQUE NOT NULL,
  joinDate            DATE,
  FOREIGN KEY GroupAccount(GroupID) REFERENCES Groupx(GroupID),
  FOREIGN KEY GroupAccout(AccountID) REFERENCES Accounts(AccountID)
);
CREATE TABLE TypeQuestion(
 TypeID                TINYINT AUTO_INCREMENT PRIMARY KEY,
 TypeName              VARCHAR(50) UNIQUE
);
CREATE TABLE CategoryQuestion(
 CategoryID              SMALLINT AUTO_INCREMENT PRIMARY KEY,
 CategoryNAme            VARCHAR(50) UNIQUE NOT NULL
);
CREATE TABLE Question(
 QuestionID               MEDIUMINT AUTO_INCREMENT PRIMARY KEY,
 Content                  TEXT NOt NULL,
 CategoryID               SMALLINT AUTO_INCREMENT UNIQUE NOT NULL,
 TypeID                   TINYINT AUTO_INCREMENT UNIQUE NOT NULL,
 CreatorID                SMALLINT AUTO_INCREMENT UNIQUE NOT NULL,
 CreateDate               DATE,
 FOREIGN KEY Question(CategoryID) REFERENCES Category(CategoryID),
 FOREIGN KEY Question(TypeID) REFERENCES TypeQuestion(TypeID),
 FOREIGN KEY Question(CreatorID) REFERENCES Groupx(CreatorID)
);
CREATE TABLE Answer(
 AnswerID                MEDIUMINT AUTO_INCREMENT PRIMARY KEY,
 content                 TEXT NOT NULL,
 QuestionID              MEDIUMINT UNIQUE AUTO_INCREMENT NOT NULL,
 isCorrect               VARCHAR(50),
 FOREIGN KEY Answer(QuestionID) REFERENCES Quesition(QuestionID)
);
CREATE TABLE Exam(
 ExamID         MEDIUMINT AUTO_INCREMENT PRIMARY KEY,
 Codes          SMALLINT AUTO_INCREMENT UNIQUE NOT NULL,
 Title          TEXT NOT NULL,
 CategoryID     SMALLINT AUTO_INCREMENT UNIQUE NOT NULL,
 Duration       DATETIME NOT NULL,
 CreatorID      SMALLINT AUTO_INCREMENT UNIQUE NOT NULL,
 CreateDate     DATE,
 FOREIGN KEY Exam(CategoryID) REFERENCES Category(CategoryID),
 FOREIGN KEY Exam(CreatorID) REFERENCES Groupx(CreatorID)
);
CREATE TABLE ExamQuestion(
 ExamID          MEDIUMINT AUTO_INCREMENT UNIQUE NOT NULL,
 QuestionID      MEDIUMINT AUTO_INCREMENT UNIQUE NOT NULL,
 FOREIGN KEY Exam(ExamID) REFERENCES ExamQuestion(ExamID),
 FOREIGN KEY Exam(Question) REFERENCES Question(QuestionID)
);
