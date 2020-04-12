
USE inputtesting;

-- Question 2: Lấy ra tất cả các phòng ban
SELECT * FROM  Department;

-- Question 3: Lấy ra id của phòng ban 'sale'
SELECT DepartmentID FROM Department
WHERE DepartmentName = 'Audit Dep’t' ;

-- Question 4: lấy ra thông tin account có full name dài nhất và sắp xếp chúng theo thứ tự giảm dần
-- Cách 1: Sử dụng EXT
WITH do_dai_ten AS(
    SELECT FullName,LENGTH(FullName)
    FROM `Account`
)
SELECT * , MAX(FullName)
FROM do_dai_ten;

-- Cách 2: Sử dụng Sub_Querry
SELECT FullName, LENGTH(FullName)  
FROM `Account`
WHERE LENGTH(FullName)  = (SELECT MAX(x) FROM (SELECT LENGTH(FullName) AS x FROM `Account`) AS T);

-- Question 5: lấy ra thông tin Account có fullName dài nhất và thuộc phòng ban có id = 1
-- Cách 1: Sử dụng EXT
WITH do_dai_ten AS(
    SELECT FullName,LENGTH(FullName)
    FROM `Account`
    WHERE `Account`.DepartmentID = 1
)
SELECT * ,MAX(FullName)
FROM do_dai_ten;


-- Cách 2: Sử dụng Sub_Querry
SELECT * , LENGTH(FullName)
FROM `Account`
WHERE LENGTH(FullName)  = (SELECT MAX(x) FROM (SELECT LENGTH(FullName) AS x FROM `Account`) AS T)
      AND  DepartmentID = 1;

-- Question 6:  lấy ra tên group đã tham gia trước ngày 20/12/2020
SELECT GroupName 
FROM `Group`
WHERE CreateDate < '2020-12-01';

-- Question 7:  Lấy ra ID của question có >= 2 câu trả lời 
SELECT QuestionID, COUNT(1)
FROM Answer 
GROUP BY (QuestionId)
HAVING COUNT(1) >=3;

-- Question 8:  Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019
SELECT ExamID 
FROM Exam
WHERE Duration >=60 
AND   CreateDate < '2020-12-12';

-- Question 9: Lấy ra 5 group được tạo gần đây nhất 
SELECT * FROM `Group`
ORDER BY(CreateDate) DESC
LIMIT 3;

-- Question 10: Đếm số nhân viên thuộc department có id = 2 
SELECT DepartmentID, COUNT(1)
FROM `Account`
WHERE DepartmentID = 2;

-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "B" và kết thúc bằng chữ "g" 
SELECT * FROM `Account`
WHERE FullName LIKE('B%g');

-- Question 12: xóa tất cả các exam được tạo trước ngày 20/12/2019  
DELETE 
FROM Exam
WHERE CreateDate < 2019-12-20;

-- Question 13: xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"
DELETE 
FROM Question
WHERE Content LIKE ('câu hỏi%');

-- Question 14: update thông tin của account có id = 7 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn 
UPDATE `Account`
SET Email = 'loc.nguyenba@vti.com',
	UserName = 'BaLoc',
    FullName = 'Nguyễn Thành Lộc'
WHERE AccountID = 7;

-- Question 15: update account có id = 5 sẽ thuộc group có id = 4 
UPDATE GroupAccount 
SET GroupID = 4
WHERE AccountID = 5;

-- 


