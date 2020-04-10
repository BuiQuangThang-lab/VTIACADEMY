USE FresherManage;

INSERT INTO Trainee(     Full_Name,      Birth_Day,    Gender,    ET_IQ,   ET_Gmath,    ET_English,   Training_Class,         Evalution_Notes)
VALUE              ('Bùi Quang Thắng',   '1998-03-22',  'Male',   	15,     16,         40,                 2,          'Trên trung bình'),
                   ('Trịnh Thị Ngọc Mai','1998-01-13',  'Female', 	19,     18,			50,					2,			'Rất giỏi và thông minh'),
                   ('Nguyễn Thế Nghĩa',  '1997-01-05',  'Male',   	15,		14,			30,					1,			'Dưới trung binhg, cần cố gắng'),
                   ('Trần Hùng Mạnh',    '1995-12-11',  'Male',   	17,		18,			45,					3,			'Tốt,rất tốt'),
                   ('Ngô Thu Hường',     '1998-10-04',  'Female', 	15,		18,			46,					2,			'Khá tốt'),
                   ('Trần Văn Quang',    '1997-05-06',  'Male',   	19,		14,			47,					3,			'Cần cố gắng môn Toán'),
                   ('Bùi Tùng Dương',    '2000-10-10',  'Male',   	11,		11,			25,					1,			'Cần rất lỗ lực'),
                   ('Nguyễn Thanh Tùng', '1997-07-08',  'Male',   	17,		18,			40,					1,			'Khá tốt, cố gắng phát huy'),
                   ('Ngô Xuân Tuyến',    '1998-10-10',  'Male',   	15,		16,			40,					2,		    'Khá tốt'),
                   ('Nguyễn Vân Anh',    '1992-11-11',  'Female', 	11,     11,			44,					3,			'Giỏi mỗi tiếng anh');

-- Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào, nhóm chúng thành các tháng sinh khác nhau 
SELECT *
FROM Trainee
WHERE ET_IQ >= 15 AND ET_Gmath >= 15 AND ET_English >=30
GROUP BY MONTH(Trainee.Birth_Day);


-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau: tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table) 
SELECT *, length(Full_Name) AS do_dai
FROM trainee
order by do_dai DESC
LIMIT 1;

-- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 
-- 1 ET thực tập sinh là những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau: 
--  ET_IQ + ET_Gmath>=20 
--  ET_IQ>=8  ET_Gmath>=8 
--  ET_English>=18
CREATE OR REPLACE VIEW v_ET_student AS
SELECT *, SUM(ET_IQ + ET_Gmath)
FROM Trainee
GROUP BY Full_Name
HAVING SUM(ET_IQ + ET_Gmath) >=20
AND ET_IQ >= 8
AND ET_Gmath >= 8;
SELECT * FROM v_ET_student;

-- Question 5: xóa thực tập sinh có TraineeID = 3 
DELETE 
FROM Trainee
WHERE TraineeID = 2;

-- Question 6: Thực tập sinh có TraineeID = 1 được chuyển sang lớp "1". Hãy cập nhật thông tin vào database 
UPDATE  Trainee
SET Trainee_Class = 1
WHERE TraineeID = 1


