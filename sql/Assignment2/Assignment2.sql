DROP DATABASE InputTesting;
CREATE DATABASE InputTesting;
USE InputTesing;
CREATE TABLE Departments(
   DepartmentID      INT AUTO_INCREMENT PRIMARY KEY,
   DepartmentName    VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE Positions (
   PositionID       INT AUTO_INCREMENT PRIMARY KEY,
   PositionName     VARCHAR(50) UNIQUE NOT NULL
);

create table Accounts(
   AccountID        INT AUTO_INCREMENT PRIMARY KEY,
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
  GroupID            INT AUTO_INCREMENT PRIMARY KEY,
  GroupName          VARCHAR(50) UNIQUE NOT NULL,
  CreatorID          INT UNIQUE NOT NULL,
  CreateDate         DATE
);
CREATE TABLE GroupAccount(
  GroupID             INT AUTO_INCREMENT UNIQUE NOT NULL,
  AccountID           INT AUTO_INCREMENT UNIQUE NOT NULL,
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
 CategoryNAme            VARCHAR(50) UNIQUE NOT NULL
);
CREATE TABLE Question(
 QuestionID               INT AUTO_INCREMENT PRIMARY KEY,
 Content                  TEXT NOt NULL,
 CategoryID               INT AUTO_INCREMENT UNIQUE NOT NULL,
 TypeID                   INT AUTO_INCREMENT UNIQUE NOT NULL,
 CreatorID                INT AUTO_INCREMENT UNIQUE NOT NULL,
 CreateDate               DATE,
 FOREIGN KEY Question(CategoryID) REFERENCES Category(CategoryID),
 FOREIGN KEY Question(TypeID) REFERENCES TypeQuestion(TypeID),
 FOREIGN KEY Question(CreatorID) REFERENCES Groupx(CreatorID)
);
CREATE TABLE Answer(
 AnswerID                INT AUTO_INCREMENT PRIMARY KEY,
 content                 TEXT NOT NULL,
 QuestionID              INT UNIQUE AUTO_INCREMENT NOT NULL,
 isCorrect               VARCHAR(50),
 FOREIGN KEY Answer(QuestionID) REFERENCES Quesition(QuestionID)
);
CREATE TABLE Exam(
 ExamID         INT AUTO_INCREMENT PRIMARY KEY,
 Codes          INT AUTO_INCREMENT UNIQUE NOT NULL,
 Title          TEXT NOT NULL,
 CategoryID     INT AUTO_INCREMENT UNIQUE NOT NULL,
 Duration       DATETIME NOT NULL,
 CreatorID      INT AUTO_INCREMENT UNIQUE NOT NULL,
 CreateDate     DATE,
 FOREIGN KEY Exam(CategoryID) REFERENCES Category(CategoryID),
 FOREIGN KEY Exam(CreatorID) REFERENCES Groupx(CreatorID)
);
CREATE TABLE ExamQuestion(
 ExamID          INT AUTO_INCREMENT UNIQUE NOT NULL,
 QuestionID      INT AUTO_INCREMENT UNIQUE NOT NULL,
 FOREIGN KEY Exam(ExamID) REFERENCES ExamQuestion(ExamID),
 FOREIGN KEY Exam(Question) REFERENCES Question(QuestionID)
);
