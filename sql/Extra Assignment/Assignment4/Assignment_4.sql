-- Cho table sau: 
-- Department (Department_Number, Department_Name) 
-- Employee_Table (Employee_Number, Employee_Name, Department_Number) 
-- Employee_Skill_Table (Employee_Number, Skill_Code, Date Registered) 

DROP DATABASE IF EXISTS EmployeeDepartment ;
CREATE DATABASE IF NOT EXISTS EmployeeDepartment;
USE EmployeeDepartment;

DROP TABLE IF EXISTS Department; 
CREATE TABLE Department(
   Department_Number                        TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   Department_Name                          VARCHAR(50) UNIQUE NOT NULL
);
DROP TABLE IF EXISTS Employee_Table; 
CREATE TABLE Employee_Table (
   Employee_Number        					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
   Employee_Name          					VARCHAR(50) UNIQUE NOT NULL, 
   Department_Number      					TINYINT UNSIGNED NOT NULL
);
DROP TABLE IF EXISTS Employee_Skill_Table; 
CREATE TABLE Employee_Skill_Table(
   Employee_Number                          TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   Skill_Code                               VARCHAR(50), 
   Date_Registered                          DATE DEFAULT (CURRENT_DATE)
) ;
-- ----------------------------------------------------------------------------------------------------------
-- Question 2: Thêm ít nhất 10 bản ghi vào table ;
INSERT INTO Department (Department_Name)
VALUE                  ('Accounting Dep’t'),
					   ('Administration Dep’t'),
                       ('Audit Dep’t'),
                       ('Customer Service Dep’t');
                       

INSERT INTO Employee_Table (Employee_Name,     Department_Number)
VALUE                      ('Bùi Quang Thắng',         2),
						   ('Trịnh Thị Ngọc Mai',      4),
                           ('Ngô Thu Hương',           2),
                           ('Trinh Mai Hương',         1),
                           ('Bùi Tùng Dương',          2),
                           ('Nguyễn Ngọc Bích',        3),
                           ('Nguyễn Thị Nhung',        3),
                           ('Lý Thu Nga',              1),
                           ('Nguyễn Hoài Thu',         2),
                           ('Lê Trịnh Quang',          3);
                           
INSERT INTO Employee_Skill_Table (Skill_Code)
VALUE                            ('JAVA'),
								 ('cơ sở dữ liệu'),
                                 ('Vi điều khiển'),
                                 ('Lập trình nhúng'),
                                 ('Java'),
                                 ('Autocard'),
                                 ('JAVA'),
                                 ('Vi điều khiển'),
                                 (null),
                                 ('JAVA');
-- ---------------------------------------------------------------------------------------------------------------------------
-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java 
SELECT *
FROM Employee_Table et
JOIN Employee_Skill_Table est ON et.Employee_Number = est.Employee_Number 
WHERE Skill_Code = 'JAVA';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >=3 nhân viên ;
SELECT d.Department_Name , COUNT(1)
FROM Department d
JOIN Employee_Table et ON d.Department_Number = et.Department_Number
GROUP BY (d.Department_Number)
HAVING COUNT(1) >= 3;

-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban. ;  
SELECT d.Department_Name,Employee_Name
FROM Department d
JOIN Employee_Table et ON d.Department_Number = et.Department_Number;

-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills. 

SELECT *, COUNT(1)
FROM Employee_Table et
JOIN Employee_Skill_Table est ON et.Employee_Number = est.Employee_Number 
GROUP BY(Skill_Code)
HAVING COUNT(1) > 1