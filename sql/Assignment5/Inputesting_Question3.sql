USE inputtesting;
-- Exercise 1: Tiếp tục với Database Testing System (sử dụng subquery hoặc CTE) 
-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale 

CREATE OR REPLACE VIEW v_nhan_vien_sale AS
SELECT AccountID, Email, FullName 
FROM `Account` 
JOIN Department ON `Account`.DepartmentID = Department.DepartmentID
WHERE DepartmentName = 'Sales Dep’t';
SELECT * FROM v_nhan_vien_sale;

--  Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
CREATE OR REPLACE VIEW v_maxGroup AS
SELECT  FullName, Email, COUNT(1) AS so_luong
FROM `Account`
INNER JOIN GroupAccount ON `Account`.AccountID = GroupAccount.AccountID
GROUP BY(`Account`.AccountID)
ORDER BY so_luong DESC
LIMIT 1;
SELECT * FROM v_maxGroup;

-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi 
CREATE OR REPLACE VIEW v_Content_dài AS
SELECT * 
FROM Question
WHERE length(Content)>=50;
SELECT * FROM v_Content_dài;
DROP VIEW v_Content_dài;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE OR REPLACE VIEW v_Phong_nhieu_nv AS
SELECT DepartmentName, COUNT(1)
FROM Department 
JOIN `Account` ON  Department.DepartmentID=`Account`.DepartmentID
GROUP BY (Department.DepartmentID)
ORDER BY COUNT(1) DESC 
LIMIT 3;
SELECT * FROM v_Phong_nhieu_nv;




