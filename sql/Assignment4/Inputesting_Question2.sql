USE inputtesting;

-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ 
SELECT * 
FROM `Account`
JOIN Department ON `Account`.DepartmentID = Department.DepartmentID;  

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010 
SELECT * 
FROM `Account`
WHERE CreateDate < '2010-12-20';

-- Question 3: Viết lệnh để lấy ra tất cả các developer 
SELECT CreatorID FROM `Group`
UNION 
SELECT CreatorID FROM Question
UNION
SELECT CreatorID FROM Exam;

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên 
SELECT *, COUNT(1) 
FROM `Account` 
JOIN Department ON `Account`.DepartmentID = Department.DepartmentID
GROUP BY (`Account`.DepartmentID)
HAVING COUNT(1)>=2;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất 
SELECT COUNT(1) AS so_de_thi
FROM ExamQuestion 
GROUP BY (ExamID)
HAVING MAX(so_de_thi);

-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question 
SELECT CategoryName, COUNT(1) AS so_Question
FROM Question 
JOIN CategoryQuestion on Question.CategoryID = CategoryQuestion.CategoryID
GROUP BY(Question.CategoryID);

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam 
SELECT QuestionID, COUNT(1) AS so_Exam
FROM ExamQuestion
GROUP BY(QuestionID);

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất 
SELECT Answer.QuestionID,Question.Content, COUNT(1) AS so_Answer
FROM Answer 
JOIN Question ON Answer.QuestionID = Question.QuestionID
GROUP BY (Answer.QuestionID)
ORDER BY (so_Answer)
LIMIT 1;

-- Question 9: Thống kê số lượng account trong mỗi group 
SELECT GroupName, COUNT(AccountID) AS so_Account 
FROM GroupAccount
JOIN `Group` ON GroupAccount.GroupID = `Group`.GroupID 
GROUP BY(GroupAccount.GroupID);

-- Question 10: Tìm chức vụ có ít người nhất 
SELECT `Account`.PositionID, COUNT(1) AS so_nguoi
FROM `Account` 
GROUP BY(`Account`.PositionID)
HAVING so_nguoi = (SELECT MAX(x) FROM (SELECT COUNT(*) AS x FROM `Account` GROUP BY `Account`.PositionID) AS T);

-- Question 11: thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM 
SELECT Department.DepartmentName,`Position`.PositionName, COUNT(`Account`.AccountID)
FROM `Account` 
JOIN `Position` ON `Account`.PositionID = `Position`.PositionID
JOIN Department ON `Account`.DepartmentID = Department.DepartmentID
GROUP BY Department.DepartmentName,`Position`.PositionName;

-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, … 
SELECT TypeQuestion.TypeName, Question.CreatorID, Answer.Content
FROM Question
JOIN TypeQuestion ON Question.TypeID = TypeQuestion.TypeID
JOIN Answer ON Question.QuestionID = Answer.QuestionID

-- Question 13: lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm  
SELECT DISTINCT TypeQuestion.TypeName, COUNT(1) AS so_cau_hoi
FROM Question
JOIN TypeQuestion ON Question.TypeID = TypeQuestion.TypeID
GROUP BY TypeQuestion.TypeID

-- Question 14: lấy ra group không có account nào 
SELECT `Group`.GroupName, COUNT(1) AS so_luong
FROM `Group`
JOIN GroupAccount ON `Group`.GroupID = GroupAccount.GroupID
GROUP BY(`Group`.GroupID)
HAVING so_luong = 4;

-- Question 17:  
-- a) Lấy các account thuộc nhóm thứ 1 
SELECT `Account`.FullName
FROM `Account`
JOIN GroupAccount ON `Account`.AccountID = GroupAccount.AccountID
WHERE GroupAccount.GroupID = 1;
-- b) Lấy các account thuộc nhóm thứ 2 
SELECT `Account`.FullName
FROM `Account`
JOIN GroupAccount ON `Account`.AccountID = GroupAccount.AccountID
WHERE GroupAccount.GroupID = 2;
-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau 
SELECT `Account`.FullName
FROM `Account`
JOIN GroupAccount ON `Account`.AccountID = GroupAccount.AccountID
WHERE GroupAccount.GroupID = 2
UNION
SELECT `Account`.FullName
FROM `Account`
JOIN GroupAccount ON `Account`.AccountID = GroupAccount.AccountID
WHERE GroupAccount.GroupID = 1;

-- Question 18: 
-- a) Lấy các group có lớn hơn bằng 3 thành viên 
SELECT `Group`.GroupName, COUNT(1) AS so_luong
FROM `Group`
JOIN GroupAccount ON `Group`.GroupID = GroupAccount.GroupID
GROUP BY(GroupAccount.GroupID)
HAVING so_luong >= 3;
-- b) Lấy các group có nhỏ hơn 7 thành viên 
SELECT `Group`.GroupName, COUNT(1) AS so_luong
FROM `Group`
JOIN GroupAccount ON `Group`.GroupID = GroupAccount.GroupID
GROUP BY(GroupAccount.GroupID)
HAVING so_luong <= 4;
-- ) Ghép 2 kết quả từ câu a) và câu b) 
SELECT `Group`.GroupName, COUNT(1) AS so_luong
FROM `Group`
JOIN GroupAccount ON `Group`.GroupID = GroupAccount.GroupID
GROUP BY(GroupAccount.GroupID)
HAVING so_luong >= 3
UNION
SELECT `Group`.GroupName, COUNT(1) AS so_luong
FROM `Group`
JOIN GroupAccount ON `Group`.GroupID = GroupAccount.GroupID
GROUP BY(GroupAccount.GroupID)
HAVING so_luong <= 4;