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
 TypeName              ENUM('Essay', 'Multiple-Choice')
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
-- insert data
INSERT INTO Departments (DepartmentID,    DepartmentName)
VALUE                   ('D1'        ,   'Accounting' ),
						('D2'        ,   'Audit'     ),
						('D3'        ,   'Maketing'),
                        ('D3'        ,   'Financial'),
                        ('D4'        ,   'ProductDevolopment'),
                        ('D5'        ,   'Relations'),
                        ('D6'        ,   'Sale'),
                        ('D7'        ,   'Training'),
                        ('D8'        ,   'Administration'),
                        ('D9'        ,   'CustomerService'),
                        ('D10'       ,   'HumanResource');
INSERT INTO Positions   (PositionID,    PositionName)
VALUE                   (  'P1'    ,    'Dỉactor'),
						('P2', 'Chief Executive Office'),
                        ('P2','Chief Information Office'),
                        ('P3','Chief Financaial Office'),
                        ('P3', 'President'),
                        ('P4', 'Chief Operating Office'),
                        ('P4', 'Board of Diractor'),
                        ('P5', 'CEO'),
                        ('P6','Founder'),
                        ('P7','Vice President'),
                        ('P8','Employer'),
                        ('P9','Boss'),
                        ('P10','Share Holder');
INSERT INTO Accounts   (AccountID, Email, UserName, FullName, DepartmentID, PositionID, CreateDate )
VALUE                  ('A1', 'thang.bq2203@gmail.com', 'BuiThang', 'Bui Quang Thang', 'D1', 'P1', 22/03/2021),
                       ('A2','huong.tt1504@gmail.com','Huong','Truong Thi Huong', 'D2', 'P2', 15/04/2021),
                       ('A3', 'Nhan.nt1101@gmail.com','Nhan','Nguyen Thi Thanh Nhan', 'D3','P3', 11/01/2020),
                       ('A4','Tam.dt1111@gmail.com','Tam','Dinh Thi Tam', 'D3','P3',11/11/2020),
                       ('A5','Canh.nv2210@gmail.com','Canh','Nguyen Viet Canh','D4','P4',22/11/2020),
					   ('A6', 'thang.bq2203@gmail.com', 'BuiThang', 'Bui Quang Thang', 'D5', 'P5', 22/03/2021),
                       ('A7','huong.tt1504@gmail.com','Huong','Truong Thi Huong', 'D7', 'P6', 15/04/2021),
                       ('A8', 'Nhan.nt1101@gmail.com','Nhan','Nguyen Thi Thanh Nhan', 'D8','P8', 11/01/2020),
                       ('A9','Tam.dt1111@gmail.com','Tam','Dinh Thi Tam', 'D9','P9',11/11/2020),
                       ('A10','Canh.nv2210@gmail.com','Canh','Nguyen Viet Canh','D10','P10',22/11/2020);
INSERT INTO Groupx   (GroupID,    GroupName, CreatorID, CreateDate)
VALUE                 ('G1', 'The Perfecttor','C1',11/01/2012),
					  ('G2','Shooting Starts','C2','20/03/2118'),
                      ('G3','Commodores','C3',30/01/2019),
                      ('G4','Lions','C4',04/02/2012),
                      ('G5','LeoPards','C5',21/01/2019),
                      ('G6', 'The Perfecttor','C6',11/01/2012),
					  ('G7','Shooting Starts','C7','20/03/2118'),
                      ('G8','Commodores','C8',30/01/2019),
                      ('G9','Lions','C9',04/02/2012),
                      ('G10','LeoPards','C10',21/01/2019);
INSERT INTO GroupAccount  (GroupID, AccountID, JoinDate)
VALUE                     ('G1','A1',11/11/2012),
                          ('G2','A2',04/03/2011),
                          ('G3','A3',21/02/2019),
                          ('G4','A4',04/05/2016),
                          ('G5','A5',19/09/2017),
						  ('G6','A6',11/11/2012),
                          ('G7','A7',04/03/2011),
                          ('G8','A8',21/02/2019),
                          ('G9','A9',04/05/2016),
                          ('G10','A10',19/09/2017);
 INSERT INTO TypeQuestion  (TypeID, TypeName)
VALUE                      ('T1', 'Essay'),
						   ('T2','Multiple-Choice'),
                           ('T3','Multiple-Choice'),
                           ('T4','Essay'),
                           ('T5','Multiple-Choice'),
                           ('T6', 'Essay'),
						   ('T7','Multiple-Choice'),
                           ('T8','Multiple-Choice'),
                           ('T9','Essay'),
                           ('T10','Multiple-Choice');
 INSERT INTO CategoryQuestion  (CategoryID, CategoryName)
VALUE                          ('Cg1','Java'),
                               ('Cg2','Net'),
                               ('Cg3','SQL'),
                               ('Cg4','Posman'),
                               ('Cg5','Ruby'),
                                ('Cg6','Java'),
                               ('Cg7','Net'),
                               ('Cg8','SQL'),
                               ('C9','Posman'),
                               ('Cg10','Ruby');
INSERT INTO Question  (QuestionID, Content,CategoryID,TypeID,CreatorID,CreateDate)
VALUE                 ('Q1','Tell me about yourself,Can you introduce yourself?','Cg1','T1','C1',21/01/2012),
					  ('Q2','What is your biggest Streghth?','Cg2','T1','C1',21/01/2012),
					  ('Q3','Why do you want this job?','Cg3','T1','C1',21/01/2012),
                      ('Q4','What do you know about Company?','T1','C1',21/01/2012),
                      ('Q5','What are your salary Expectations?','Cg5','T1','C1',21/01/2012),
                      ('Q6','Why did you leave your job?','Cg6','T1','C1',21/01/2012),
                      ('Q7','What is your biggest Streghth?','Cg7','T1','C1',21/01/2012),
                      ('Q8','Why do you want this job?','Cg8','T1','C1',21/01/2012),
                      ('Q9','What is your biggest Streghth?','Cg9','T1','C1',21/01/2012),
                      ('Q10','Do you have any Question?','Cg10','T1','C1',21/01/2012);
					  
INSERT INTO ExamQuestion  (ExamID, QuestionID)
VALUE                     ('E1','Q1'),
						  ('E2','Q2'),
                          ('E3','Q3'),
                          ('E4','Q4'),
                          ('E5','Q5'),
                          ('E6','Q6'),
                          ('E7','Q7'),
                          ('E8','Q8'),
                          ('E9','Q9'),
                          ('E10','Q10');
