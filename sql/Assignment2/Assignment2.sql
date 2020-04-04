DROP DATABASE InputTesting;
CREATE DATABASE InputTesting;
USE InputTesing;
CREATE TABLE Departments(
   DepartmentID      INT AUTO_INCREMENT PRIMARY KEY,
   DepartmentName    VARCHAR(50) UNIQUE
);

CREATE TABLE Positions (
   PositionID       INT AUTO_INCREMENT PRIMARY KEY,
   PositionName     VARCHAR(50) UNIQUE
);

create table Accounts(
   AccountID        INT AUTO_INCREMENT PRIMARY KEY,
   Email            VARCHAR(50) UNIQUE,
   UserName         VARCHAR(50),
   FullName         VARCHAR(50),
   DepartmentID     INT UNIQUE AUTO_INCREMENT,
   PositionID       INT UNIQUE AUTO_INCREMENT,
   CreateDate       DATE,
   FOREIGN KEY Accounts(DepartmentID) REFERENCES Departments(DepartmentID),
   FOREIGN KEY Accounts(PositionID) REFERENCES Positions(PositionID)
);
CREATE TABLE Groupx(
  GroupID            INT AUTO_INCREMENT PRIMARY KEY,
  GroupName          VARCHAR(50) UNIQUE,
  CreatorID          INT UNIQUE,
  CreateDate         DATE
);
CREATE TABLE GroupAccount(
  GroupID             INT AUTO_INCREMENT,
  AccountID           INT AUTO_INCREMENT,
  joinDate            DATE,
  FOREIGN KEY GroupAccount(GroupID) REFERENCES Groupx(GroupID),
  FOREIGN KEY GroupAccout(AccountID) REFERENCES Accounts(AccountID)
);
CREATE TABLE TypeQuestion(
 TypeID                INT AUTO_INCREMENT PRIMARY KEY,
 TypeName              VARCHAR(50) UNIQUE
);
CREATE TABLE CategoryQuestion(
 CategoryID              INT AUTO_INCREMENT PRIMARY KEY,
 CategoryNAme            VARCHAR(50) UNIQUE
);
CREATE TABLE Question(
 QuestionID               INT AUTO_INCREMENT PRIMARY KEY,
 Content                  TEXT,
 CategoryID               INT AUTO_INCREMENT UNIQUE,
 TypeID                   INT AUTO_INCREMENT UNIQUE,
 CreatorID                INT AUTO_INCREMENT UNIQUE,
 CreateDate               DATE,
 FOREIGN KEY Question(CategoryID) REFERENCES Category(CategoryID),
 FOREIGN KEY Question(TypeID) REFERENCES TypeQuestion(TypeID),
 FOREIGN KEY Question(CreatorID) REFERENCES Groupx(CreatorID)
);
CREATE TABLE Answer(
 AnswerID                INT AUTO_INCREMENT PRIMARY KEY,
 content                 TEXT,
 QuestionID              INT UNIQUE AUTO_INCREMENT,
 isCorrect               VARCHAR(50),
 FOREIGN KEY Answer(QuestionID) REFERENCES Quesition(QuestionID)
);
CREATE TABLE Exam(
 ExamID         INT AUTO_INCREMENT PRIMARY KEY,
 Codes          INT AUTO_INCREMENT PRIMARY KEY,
 Title          TEXT,
 CategoryID     INT AUTO_INCREMENT UNIQUE,
 Duration       DATETIME,
 CreatorID      INT AUTO_INCREMENT UNIQUE,
 CreateDate     DATE,
 FOREIGN KEY Exam(CategoryID) REFERENCES Category(CategoryID),
 FOREIGN KEY Exam(CreatorID) REFERENCES Groupx(CreatorID)
);
CREATE TABLE ExamQuestion(
 ExamID          INT AUTO_INCREMENT,
 QuestionID      INT AUTO_INCREMENT,
 FOREIGN KEY Exam(ExamID) REFERENCES ExamQuestion(ExamID),
 FOREIGN KEY Exam(Question) REFERENCES Question(QuestionID)
);
