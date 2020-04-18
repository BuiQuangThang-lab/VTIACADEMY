---------Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước ---------------------
INSERT INTO `Group` (GroupName,CreatorID,CreateDate)
VALUE               ('Anterroom', 7, '2018-10-10' );
DROP TRIGGER IF EXISTS Trigger_Insert_Group;
DELIMITER $$
CREATE TRIGGER Trigger_Insert_Group
BEFORE INSERT ON `Group`
FOR EACH ROW
BEGIN
  
      IF NEW.CreateDate <  DATE_SUB(NOW(),INTERVAL -1 YEAR) THEN
         SIGNAL SQLSTATE '12345'
         SET MESSAGE_TEXT = 'Khong duoc INSERT';
	  END IF ;

END $$
DELIMITER ;

------Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào department "Sale" nữa----------------
--                            khi thêm thì hiện ra thông báo "Department "Sale" cannot add more user--------------------------

INSERT INTO `Account` (AccountID, Email, UserName, FullName,DepartmentID,PositionID,CreateDate)
VALUE                 (19, 'Thuy1201.nt@gamil.com', 'ThuyNguyen','Nguyễn Thị THủy', 7, 3 ,'2018-10-10' );
DROP TRIGGER IF EXISTS Insert_Account_In_Department;
DELIMITER $$
CREATE TRIGGER Insert_Account_In_Department
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN
  
      IF NEW.DepartmentID = (SELECT DepartmentID FROM Department WHERE DepartmentName ='Sales Dep’t') THEN
         SIGNAL SQLSTATE '12345'
         SET MESSAGE_TEXT = 'Khong duoc INSERT';
	  END IF ;

END $$
DELIMITER ;

----------------Question 3: Cấu hình 1 Department có nhiều nhất là 5 user. --------------------------------------------------

DROP TRIGGER IF EXISTS Max_Group
DELIMITER $$
CREATE TRIGGER Max_Group
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN
	  IF (SELECT COUNT(1) FROM `Account` GROUP BY DeartmentID) > 5 THEN
      SIGNAL SQLSTATE '12345'
      SET MESSAGE_TEXT = 'Mỗi Department tối đa được 5 Account ';
         
	  END IF ;

END $$
DELIMITER ;

---------------------------------Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question --------------------------------------
DROP TRIGGER IF EXISTS Max_Question_In_Exam;
DELIMITER $$
CREATE TRIGGER Max_Question_In_Exam
BEFORE INSERT ON `ExamQuestion`
FOR EACH ROW
BEGIN
	  IF (SELECT COUNT(1) FROM `ExamQuestion` GROUP BY ExamID) > 5 THEN
      SIGNAL SQLSTATE '12345'
      SET MESSAGE_TEXT = 'Mỗi bài thi nhiều nhất 10 câu hỏi';
         
	  END IF ;

END $$
DELIMITER ;

--Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là admin@gmail.com 
              (đây là tài khoản admin, không cho phép user xóa), 
              còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông tin liên quan tới user đó 
 
DROP TRIGGER IF EXISTS Delete_Account
DELIMITER $$
CREATE TRIGGER Delete_Account
BEFORE DELETE ON `Account`
FOR EACH ROW
BEGIN 
      DECLARE A_Admin SMALLINT ;
      SELECT AccountID INTO A_Admin
      FROM `Account`
      WHERE Email = 'Buithang220398@gmail.com';
			IF AccountID = A_Admin THEN
			SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT = 'Không thể xóa tài khoản của quản trị viên';
            IF AccountID = A_Admin THEN
            DELETE GroupAccount ;
	END IF;
END $$
DELIMITER ;

Question 6: Không sử dụng cấu hình default cho field DepartmentID của table Account, 
			hãy tạo trigger cho phép người dùng khi tạo account không điền vào departmentID thì sẽ được phân vào phòng ban "waiting Department"   

DROP TRIGGER IF EXISTS Is_Null_DepartmentID
DELIMITER $$
CREATE TRIGGER Is_Null_DepartmentID
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN 
      DECLARE A_DepartmentID TINYINT ;
      SELECT DepartmentID INTO A_DepartmentID
      FROM `Account` a 
      JOIN Department d ON a.DepartmentID = d.DepartmentID 
      WHERE DepartmentName = 'Accounting Dep’t';
	
			IF NEW.DepartmentID IS NULL THEN
			SET NEW.DepartmentID =  A_DepartmentID;
            END IF;
END $$
DELIMITER ;

-----Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi question, trong đó có tối đa 2 đáp án đúng. -----

DROP TRIGGER IF EXISTS Question_Answer;
DELIMITER $$
CREATE TRIGGER Question_Answer
BEFORE INSERT ON ExamQuestion
FOR EACH ROW
BEGIN
      DECLARE Answer_Number,Correct_True INT;
      SELECT COUNT(a.AnswerID), COUNT(IsCorrect) INTO Answer_Number, Correct_True
      FROM Answer a
      JOIN ExamQuestion eq ON a.QuestionID = eq.QuestionID
      GROUP BY eq.ExamID,eq.QuestionID
      HAVING IsCorrect = 'Right';
          IF Answer_Number >=4
            OR Correct_True >=2
		  THEN 
		    SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT = 'Không thể INSERT';
	END IF ;
END $$
DELIMITER ;
--------Question 8: Viết trigger sửa lại dữ liệu cho đúng: nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
								thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database 

DROP TRIGGER IF EXISTS Auto_Update;
DELIMITER $$
CREATE TRIGGER Auto_Update
AFTER INSERT ON `Account`
FOR EACH ROW
BEGIN
  
      IF NEW.Gender = 'Nam' THEN
         SET NEW.Gender = 'M';
	  ELSEIF NEW.Gender = 'Nu' THEN
         SET NEW.Gender = 'F';
	  ELSEIF NEW.Gender = 'Chưa xác định' THEN
         SET NEW.Gender = 'U';
	  END IF ;
END $$
DELIMITER ;
--------------Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày ----------

DROP TRIGGER IF EXISTS Delete_Exam;
DELIMITER $$
CREATE TRIGGER Delete_Exam
BEFORE DELETE ON Exam
FOR EACH ROW
BEGIN
  
      IF NEW.CreateDate =  DATE_SUB(NOW(),INTERVAL -1 DAY) THEN
         SIGNAL SQLSTATE '12345'
         SET MESSAGE_TEXT = 'Khong duoc Xóa';
	  END IF ;

END $$
DELIMITER ;

---Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các question khi question đó chưa nằm trong exam nào -----

DROP TRIGGER IF EXISTS Delete_Update;
DELIMITER $$
CREATE TRIGGER Delete_Update
BEFORE UPDATE  ON Question
FOR EACH ROW
BEGIN
DECLARE Not_On_Exam TINYINT;   
SELECT q.QuestionID INTO Not_On_Exam
FROM Question q
LEFT JOIN ExamQuestion eq ON q.QuestionID = eq.QuestionID
WHERE eq.ExamID IS NULL;
    IF NEW.QuestionID != Not_On_Exam THEN
       SIGNAL SQLSTATE '12345'
	   SET MESSAGE_TEXT = 'Không thể INSERT'; 
	END IF ;
END $$
DELIMITER ;

-- -------------------Question 12: Lấy ra thông tin exam trong đó  -----------------------------------------------------------
	-- -				    Duration <= 30 thì sẽ đổi thành giá trị "Short time" 
	-- -					30 < duration <= 60 thì sẽ đổi thành giá trị "Medium time" 
	-- -					duration >60 thì sẽ đổi thành giá trị "Long time
	
SELECT * ,
          (CASE 
               WHEN Duration <= 30 THEN 'Short Time'
               WHEN Duration <= 60 THEN 'Medium Time'
               ELSE 'Long Time'
		  END) AS Duration_Type
FROM Exam;

----Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên là the_number_user_amount và mang giá trị được quy định như sau:
  Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few 
  Nếu số lượng user trong group <= 20 và > 5  thì sẽ có giá trị là normal 
  Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher 
  
SELECT g.GroupName, COUNT(ga.AccountID),
       (CASE
            WHEN COUNT(ga.AccountID) <=5 THEN 'Few'
            WHEN COUNT(ga.AccountID) <=20 THEN 'Normal'
            ELSE 'Higher'
            END) AS the_number_user_amount
FROM `Group` g 
JOIN GroupAccount ga ON g.GroupID = ga.GroupID 
GROUP BY AccountID;


----Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, 
nếu phòng ban nào không có user thì sẽ thay đổi giá trị 0 thành "Không có User" 

SELECT DepartmentName,
       (CASE 
            WHEN COUNT(a.AccountID) = 0 THEN 'Không có USER'
            ELSE COUNT(a.AccountID)
		END) AS User_Number_IN_Department
FROM Department d
LEFT JOIN `Account` a ON d.DepartmentID = a.DepartmentID
GROUP BY a.DepartmentID

 
            
