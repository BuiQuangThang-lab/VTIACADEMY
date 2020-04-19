-- 2
-- a. Lấy tất cả các môn học không có bất kì điểm nào 

SELECT sName
FROM `Subject` s
LEFT JOIN StudentSubject ss ON s.sID = ss.sID
WHERE ss.sID IS NULL;

-- b. Lấy danh sách các môn học có ít nhất 2 điểm 
SELECT sName, COUNT(Mark)
FROM `Subject` s
JOIN StudentSubject ss ON s.sID = ss.sID
GROUP BY ss.sID
HAVING COUNT(Mark) >=2;

-- 3) Tạo "StudentInfo" view có các thông tin về học sinh bao gồm: 
-- RN,sID,Name, Age, Gender, sName, Mark, Date. 
-- Với cột Gender show Male để thay thế cho 0, Female thay thế cho 1 và Unknow thay thế cho null. 

CREATE OR REPLACE VIEW StudentInfo AS
SELECT *
FROM Student 
JOIN StudentSubject ON Student.RN = StudentSubject.RN
JOIN `Subject` ON `Subject`.sID = StudentSubject.sID;

SELECT * ,
          (CASE 
               WHEN Gender = 0 THEN 'Male'
               WHEN Gender = 1 THEN 'Female'
               ELSE 'Unknow'
		  END) AS Gender
FROM StudentInfo;

 -- 4. Tạo trigger cho table Subject:
 -- a. Trigger CasUpdate: khi thay đổi data của cột sID, thì giá trị của cột sID của table StudentSubject cũng thay đổi theo 
 -- b. Trigger casDel: Khi xóa 1 student, các dữ liệu của table StudentSubject cũng sẽ bị xóa theo 
 -- a)
DROP TRIGGER IF EXISTS Auto_Update
DELIMITER $$
CREATE TRIGGER Auto_Update
BEFORE UPDATE ON Student
FOR EACH ROW
BEGIN 
      DECLARE A_sID TINYINT;
      SELECT sID INTO A_sID
      FROM `Subject`;
      UPDATE StudentSubject
	  SET StudentSubject.ID = NEW.A_sID;	
END $$
DELIMITER ;
-- b)-------------------------------------------
DROP TRIGGER IF EXISTS Delete_Auto
DELIMITER $$
CREATE TRIGGER Delete_Auto
BEFORE DELETE ON Student
FOR EACH ROW
BEGIN 
      DECLARE A_RN SMALLINT;
      SELECT RN INTO A_RN
      FROM Student;
	  DELETE FROM StudentSubject 
      WHERE StudentSubject.RN = NEW.A_RN;	 
END $$
DELIMITER ;

Viết 1 thủ tục (có 2 parameters: student name, mark). 
Thủ tục sẽ xóa tất cả các thông tin liên quan tới học sinh có cùng tên như parameter và tất cả các điểm nhỏ hơn của các học sinh đó. 
Trong trường hợp nhập vào "*" thì thủ tục sẽ xóa tất cả các học sinh 
 
DROP PROCEDURE IF EXISTS Delete_Auto;
DELIMITER $$
CREATE PROCEDURE Delete_Auto (IN In_Name VARCHAR(50),IN In_Mark DECIMAL(2,1))
   BEGIN 
          SELECT  `Name`,Mark
          INTO In_Name,In_Mark
          FROM Student s
          JOIN StudentSubject ss ON s.RN = ss.RN;
          DELETE FROM StudentSubject 
          WHERE `Name` = In_Name
          AND Mark < In_Mark;
          DELETE FROM Student
          WHERE  `Name` = In_Name;
          DELETE FROM Student
          WHERE `Name` = '*';
   END $$Delete_Auto
DELIMITER ;
