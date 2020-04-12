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
HAVING so_luong =(SELECT MAX(x) FROM (SELECT COUNT(1) AS x FROM `Account` GROUP BY `Account`.AccountID) AS T);
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
SELECT d.DepartmentName, COUNT(1) AS so_nv
FROM Department d
JOIN `Account` a ON  d.DepartmentID= a.DepartmentID
GROUP BY a.DepartmentID
HAVING so_nv =(SELECT MAX(x) FROM (SELECT COUNT(1) AS x FROM Department GROUP BY Department.DepartmentID) AS T);
SELECT * FROM v_Phong_nhieu_nv;




