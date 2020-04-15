USE inputtesting;
-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó 
-- Cách 1: 1 đầu vào IN -------------------------------
DROP PROCEDURE IF EXISTS GetAccountInDepartment;
DELIMITER $$
CREATE PROCEDURE GetAccountInDepartment (IN Department TINYINT)
   BEGIN 
          SELECT FullName
          FROM `Account`
          WHERE DepartmentID = Department;
   END $$GetAccountInDepartment
DELIMITER ;
CALL GetAccountInDepartment(6);
SELECT * FROM GetAccountInDepartment ;

-- Cách 2: 1 đầu vào, 1 đầu ra IN OUT--------------------------------------------------------------

DROP PROCEDURE IF EXISTS GetAccountInDepartment;
DELIMITER $$
CREATE PROCEDURE GetAccountInDepartment (IN Department TINYINT,
										 OUT Account_Name VARCHAR(50))
   BEGIN 
          SELECT FullName
          INTO Account_Name
          FROM `Account`
          WHERE DepartmentID = Department;
   END $$GetAccountInDepartment
DELIMITER ;
CALL GetAccountInDepartment(6,@Account_Name);
SELECT @Account_Name;
-- -----------------------------------------------------------------------------------------------------
-- Question 2: Tạo store để in ra số lượng account trong mỗi group  
-- Cách 1: 1 đầu vào IN
 DROP PROCEDURE IF EXISTS NumberOfDepartment;
DELIMITER $$
CREATE PROCEDURE NumberOfDepartment (IN Department_Name VARCHAR(50))
   BEGIN 
          SELECT  COUNT(a.AccountID)
          FROM Department d
          JOIN `Account` a ON d.DepartmentID = a.DepartmentID
          WHERE d.DepartmentName = Department_Name
          GROUP BY(d.DepartmentID);
   END $$GetAccountInDepartment
DELIMITER ;
CALL NumberOfDepartment('Accounting Dep’t');
SELECT * FROM NumberOfDepartment ;
-- Cách 2: 1 dầu vào, 1 đầu ra----------------------------------------------
 DROP PROCEDURE IF EXISTS NumberOfDepartment;
DELIMITER $$
CREATE PROCEDURE NumberOfDepartment (IN Department_Name VARCHAR(50), OUT NumberAccount TINYINT)
   BEGIN 
          SELECT  COUNT(a.AccountID)
          INTO NumberAccount
          FROM Department d
          JOIN `Account` a ON d.DepartmentID = a.DepartmentID
          WHERE d.DepartmentName = Department_Name
          GROUP BY(d.DepartmentID);
   END $$GetAccountInDepartment
DELIMITER ;
CALL NumberOfDepartment('Accounting Dep’t',@NumberAccount);
SELECT @NumberAccount ;
-- ----------------------------------------------------------------------------------------------
-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại 

DROP PROCEDURE IF EXISTS NumberOfQuestion;
DELIMITER $$
CREATE PROCEDURE NumberOfQuestion (IN Type_Question ENUM('Essay', 'Multiple-Choice'),IN Month_Create TINYINT ,OUT Number_Question TINYINT)
   BEGIN 
          SELECT  COUNT(q.QuestionID)
          INTO Number_Question
          FROM Question q
          JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
          WHERE  tq.TypeName = Type_Question AND
				 MONTH(q.CreateDate) = Month_Create
		  GROUP BY(q.TypeID);
   END $$NumberOfQuestion
DELIMITER ;
CALL NumberOfQuestion('Essay',4,@Number_Question);
SELECT @Number_Question ;

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất -----------------------------------
DROP PROCEDURE IF EXISTS QuestionOfType;
DELIMITER $$
CREATE PROCEDURE QuestionOfType() 
   BEGIN 
WITH Count_Question AS(
  SELECT q.TypeID, COUNT(q.QuestionID) AS x
  FROM Question q
  GROUP BY q.TypeID
)
SELECT TypeID, MAX(x) FROM Count_Question;
          
   END $$QuestionOfType
DELIMITER ;
CALL QuestionOfType();

-- --------------------------------------------------------------------------------------------------------------------
-- Question 6:
-- Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào 
DROP PROCEDURE IF EXISTS Find_User_Name;
DELIMITER $$
CREATE PROCEDURE Find_User_Name (IN String_Name VARCHAR(50),
										 OUT Account_Name VARCHAR(50),
                                         OUT User_Name VARCHAR(50))
   BEGIN 
          SELECT FullName , UserName
          INTO Account_Name, User_Name
          FROM `Account` a
          WHERE a.FullName LIKE CONCAT('%',String_Name,'%') 
          OR a.UserName LIKE CONCAT('%',String_Name,'%');
   END $$Find_User_Name
DELIMITER ;
CALL Find_User_Name('h',@Account_Name, @User_Name);
SELECT @Account_Name , @User_Name;

-- ------------------------------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Find_User_Name;
DELIMITER $$
CREATE PROCEDURE Find_User_Name (IN String_Name VARCHAR(50),
							     OUT tam1 VARCHAR(50), OUT tam2 VARCHAR(50))
   BEGIN 
          SELECT FullName,UserName
          INTO tam1,tam2
          FROM `Account` a
          WHERE a.FullName = String_Name OR
           a.UserName = String_Name;
          SET @result = tam1 OR tam2;
   END $$Find_User_Name
DELIMITER ;
CALL Find_User_Name('BuiThang',@tam1,@tam2);
SELECT @result;
-- -----------------------------------------------------------
DROP PROCEDURE IF EXISTS Find_User_Name;
DELIMITER $$
CREATE PROCEDURE Find_User_Name (IN String_Name VARCHAR(50))
   BEGIN 
          SELECT FullName , UserName
          FROM `Account` a
          WHERE a.FullName LIKE CONCAT('%',String_Name,'%') 
          OR a.UserName LIKE CONCAT('%',String_Name,'%');
   END $$Find_User_Name
DELIMITER ;
CALL Find_User_Name('h');
-- -----------------------------------------------------------------------------------------------------
-- Câu 6:

DROP PROCEDURE IF EXISTS Auto_Update;
DELIMITER $$
CREATE PROCEDURE Auto_Update (IN String_Email VARCHAR(50))
   BEGIN 
          SELECT  REPLACE (`Account`.Email,'@gmail.com','')
          FROM `Account` 
          WHERE `Account`.Email = String_Email;
   END $$Auto_Update
DELIMITER ;
CALL Auto_Update('Buithang220398@gmail.com');

