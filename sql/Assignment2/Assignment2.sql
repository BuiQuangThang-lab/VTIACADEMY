DROP DATABASE IF EXISTS InputTesting;
CREATE DATABASE IF NOT EXISTS InputTesting;
USE InputTesting;
-- TABLE 1
DROP TABLE IF EXISTS Department; 
CREATE TABLE Department(
   DepartmentID      INT AUTO_INCREMENT PRIMARY KEY,
   DepartmentName    VARCHAR(50) UNIQUE NOT NULL
);
-- TABLE 2
DROP TABLE IF EXISTS Positions;
CREATE TABLE Positions (
   PositionID       INT AUTO_INCREMENT PRIMARY KEY,
   PositionName     VARCHAR(50) UNIQUE NOT NULL
);
-- TABLE 3
DROP TABLE IF EXISTS Accounts;
CREATE TABLE Accounts(
   AccountID        INT AUTO_INCREMENT PRIMARY KEY,
   Email            VARCHAR(50) UNIQUE,
   UserName         VARCHAR(50) NOT NULL,
   FullName         VARCHAR(50) NOT NULL,
   DepartmentID     INT NOT NULL,
   PositionID       INT   NOT NULL,
   CreateDate       DATE,
   
   FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
   FOREIGN KEY (PositionID) REFERENCES Positions(PositionID)
);
-- TABLE 4
DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group`(
  GroupID            INT AUTO_INCREMENT PRIMARY KEY,
  GroupName          VARCHAR(50)  NOT NULL,
  CreatorID          INT  NOT NULL,
  CreateDate         DATE
);
-- TABLE 5
DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE GroupAccount(
  GroupID            INT AUTO_INCREMENT  NOT NULL,
  AccountID          INT  NOT NULL,
  joinDate            DATE,
  UNIQUE(GroupID,AccountID),
  FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID),
  FOREIGN KEY (AccountID) REFERENCES Accounts(AccountID)
);
-- TABLE 6
DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE TypeQuestion(
 TypeID                INT AUTO_INCREMENT PRIMARY KEY,
 TypeName              ENUM('Essay', 'Multiple-Choice')
);
-- TABLE 7
DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE CategoryQuestion(
 CategoryID             INT AUTO_INCREMENT PRIMARY KEY,
 CategoryNAme           VARCHAR(50) UNIQUE NOT NULL
);
-- TABLE 8
DROP TABLE IF EXISTS Question;
CREATE TABLE Question(
 QuestionID               INT AUTO_INCREMENT PRIMARY KEY,
 Content                  TEXT NOT NULL,
 CategoryID               INT  NOT NULL,
 TypeID                   INT   NOT NULL,
 CreatorID                INT NOT NULL,
 CreateDate               DATE,
 FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
 FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID)
 );
 -- TABLE 9
 DROP TABLE IF EXISTS Answer;
CREATE TABLE Answer(
 AnswerID                INT AUTO_INCREMENT PRIMARY KEY,
 Content                 TEXT NOT NULL,
 QuestionID              INT   NOT NULL,
 isCorrect               VARCHAR(50),
 FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);
-- TABLE 10
DROP TABLE IF EXISTS Exam;
CREATE TABLE Exam(
 ExamID         INT AUTO_INCREMENT PRIMARY KEY,
 Codes          INT  NOT NULL,
 Title          TEXT NOT NULL,
 CategoryID     INT  NOT NULL,
 Duration       DATETIME NOT NULL,
 CreatorID      INT  NOT NULL,
 CreateDate     DATE DEFAULT (CURRENT_DATE),
 FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID)

);
-- TABLE 11
DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE ExamQuestion(
 ExamID          INT AUTO_INCREMENT NOT NULL,
 QuestionID      INT  NOT NULL,
 FOREIGN KEY (ExamID) REFERENCES Exam(ExamID),
 FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)

);
