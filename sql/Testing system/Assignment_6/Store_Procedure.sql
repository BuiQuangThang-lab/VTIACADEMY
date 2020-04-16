USE inputtesting;
-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó 

DROP PROCEDURE IF EXISTS GetAccountInDepartment;
DELIMITER $$
CREATE PROCEDURE GetAccountInDepartment (IN I_Department VARCHAR(50))
   BEGIN 
          SELECT *
          FROM `Account` a
          JOIN Department d ON a.DepartmentID = d.DepartmentID
          WHERE DepartmentName = I_Department;
   END $$GetAccountInDepartment
DELIMITER ;
CALL GetAccountInDepartment('Accounting Dep’t');
-- -----------------------------------------------------------------------------------------------------
---------------------------- Question 2: Tạo store để in ra số lượng account trong mỗi group  ----------------------------------
********************* 1 đầu vào IN************************************
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
**************************** 1 dầu vào, 1 đầu ra*****************************************************
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
SET @NumberAccount = 0;
CALL NumberOfDepartment('Accounting Dep’t',@NumberAccount);
SELECT @NumberAccount ;

***********************Số Lượng nhân viên tất cả các phòng****************************************************

DROP PROCEDURE IF EXISTS NumberOfDepartment;
DELIMITER $$
CREATE PROCEDURE NumberOfDepartment ()
   BEGIN 
          SELECT d.DepartmentName, COUNT(a.AccountID)
          FROM Department d
          JOIN `Account` a ON d.DepartmentID = a.DepartmentID
          GROUP BY(d.DepartmentID);
   END $$GetAccountInDepartment
DELIMITER ;

------------- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại----------------- 
------------------------------------------nhập tháng---------------------------------------------------------------------
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
-----------------------------------Tháng hiện tại-------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS NumberOfQuestion;
DELIMITER $$
CREATE PROCEDURE NumberOfQuestion (IN Type_Question ENUM('Essay', 'Multiple-Choice'),OUT Number_Question TINYINT)
   BEGIN 
          SELECT  COUNT(q.QuestionID)
          INTO Number_Question
          FROM Question q
          JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
          WHERE  tq.TypeName = Type_Question AND
				 MONTH(q.CreateDate) = MONTH(CURDATE())
		  GROUP BY(q.TypeID);
   END $$NumberOfQuestion
DELIMITER ;
SET @Number_Question = 0;
CALL NumberOfQuestion('Essay',@Number_Question);
SELECT @Number_Question ;


--------------------------- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất -----------------------------------
DROP PROCEDURE IF EXISTS QuestionOfType;
DELIMITER $$
CREATE PROCEDURE QuestionOfType(OUT O_Type_Max_Question TINYINT) 
   BEGIN 
WITH Count_Question AS(
  SELECT TypeID, COUNT(q.QuestionID) AS x
  FROM Question q
  GROUP BY q.TypeID
)
SELECT TypeID INTO O_Type_Max_Question
FROM Count_Question
WHERE x = (SELECT MAX(x) FROM Count_Question);
          
   END $$QuestionOfType
DELIMITER ;
SET @O_Type_Max_Question = 0;
CALL QuestionOfType(@O_Type_Max_Question);
SELECT @O_Type_Max_Question;
-- -----------------------Question 5: Sử dụng store ở question 4 để tìm ra tên của type question-------------------------------- 
  SELECT DISTINCT TypeName
  FROM TypeQuestion tq
  JOIN Question q ON tq.TypeID = q.TypeID
  WHERE tq.TypeID = @O_Type_Max_Question;

-----------------------------------------------Question 6-------------------------------------------------------------------

-- Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào 

-- -----------------------------------???????????????????????????????????????????-------------------------------------------------------------
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
          SET @result =  tam1 OR tam2;
   END $$Find_User_Name
DELIMITER ;
CALL Find_User_Name('BuiThang',@tam1,@tam2);
SELECT @result;
-- ----------------------Ok------------------------------------------------------
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
---------------------------------------Câu 7:------------------------------------------------------------------------

DROP PROCEDURE IF EXISTS Auto_Update;
DELIMITER $$
CREATE PROCEDURE Auto_Update (IN String_Email VARCHAR(50),IN Postion_ID TINYINT)
   BEGIN 
          SELECT  REPLACE (`Account`.Email,'@gmail.com','')
          FROM `Account` 
          WHERE `Account`.Email = String_Email;
   END $$Auto_Update
DELIMITER ;
CALL Auto_Update('Buithang220398@gmail.com');

-Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất  -----------------------------------------------------------
	
DROP PROCEDURE IF EXISTS Max_Content;
DELIMITER $$
CREATE PROCEDURE Max_Content(IN Type_Name ENUM('Essay', 'Multiple-Choice'))
    BEGIN
		WITH Leght_Content AS(
			SELECT q.Content, LENGTH(q.Content) AS x
				FROM Question q
				JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
				WHERE tq.TypeName = Type_Name )
		SELECT Content
		FROM Leght_Content
		WHERE x = (SELECT MAX(x) FROM Leght_Content);
	END $$Max_Content
DELIMITER ;
CALL Max_Content('Multiple-Choice')

-------------Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID ------------------------------------------
DROP PROCEDURE IF EXISTS Delete_Exam;
DELIMITER $$
CREATE PROCEDURE Delete_Exam(IN Exam_ID TINYINT)
    BEGIN
		DELETE 
        FROM Exam
        WHERE ExamID = Exam_ID;
	END $$Delete_Exam
DELIMITER ;
CALL Delete_Exam(10)

--Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa), sau đó in số lượng record đã remove từ các table liên quan trong khi removing 
DROP PROCEDURE IF EXISTS Exam_Works;
DELIMITER $$
CREATE PROCEDURE Exam_Works()
   BEGIN
		SELECT *
		FROM Exam
		WHERE YEAR(CreateDate) = (SELECT DISTINCT (YEAR(CreateDate) - 3) FROM Exam);
   END $$Exam_Works
DELIMITER 
CALL Exam_Works();
---------------------------------------------
DROP PROCEDURE IF EXISTS Delete_Exam;
DELIMITER $$
CREATE PROCEDURE Delete_Exam()
    BEGIN
		DELETE 
        FROM Exam
		WHERE YEAR(CreateDate) = (SELECT DISTINCT (YEAR(CreateDate) - 3) FROM Exam);
	END $$Delete_Exam
DELIMITER ;
CALL Delete_Exam()
---------------------------------------------
SELECT COUNT(ExamID)
		FROM Exam
		WHERE YEAR(CreateDate) = (SELECT DISTINCT (YEAR(CreateDate) - 3) FROM Exam);
-------Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc 
 
DROP PROCEDURE IF EXISTS Delete_Department;
DELIMITER $$
CREATE PROCEDURE Delete_Department(IN Department_Name VARCHAR(50))
   BEGIN
		DELETE 
        FROM Department
        WHERE DepartmentName = Department_Name;
        ALTER TABLE Department
			ALTER DepartmentName SET DEFAULT 'Anterroom';
   END $$Delete_Department
DELIMITER ;
CALL Delete_Department('Training Dep’t');
-- -------------------Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay --------------------------------------------------------------------------------------------------------

DROP PROCEDURE IF EXISTS Question_One_Month;
DELIMITER $$
CREATE PROCEDURE Question_One_Month()
   BEGIN
 SELECT MONTH(q.CreateDate), COUNT(1)
 FROM question q
 WHERE YEAR(CreateDate) = YEAR(NOW())
 GROUP BY (MONTH(q.CreateDate));
   END $$Question_One_Month
DELIMITER ; 
CALL Question_One_Month();

--Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất (nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng") 
 
 SELECT MONTH(q.CreateDate), COUNT(1)
 FROM question q
 WHERE q.CreateDate > (SELECT DISTINCT DATE_SUB(Question.CreateDate,INTERVAL -182 DAY) FROM Question)
 GROUP BY (MONTH(q.CreateDate));


