USE inputtesting;
INSERT INTO Department (DepartmentName)
VALUE                  ('Accounting Dep’t'),
					   ('Administration Dep’t'),
                       ('Audit Dep’t'),
                       ('Customer Service Dep’t'),
                       ('Human Resource'),
                       ('Financial Dep’t'),
                       ('Marketing Dep’t'),
                       ('Sales Dep’t'),
                       ('Purchasing Dep’t'),
                       ('Training Dep’t ');

INSERT INTO `Position` (PositionName)
VALUE                  ('Chairman'),
					   ('The board of directors'),
                       ('Chief Executives Officer'),
                       ('Director'),
                       ('Deputy'),
                       ('Assistant manager'),
                       ('Shareholder'),
                       ('Head of department'),
                       ('Deputy of department'),
                       ('Manager');
INSERT INTO `Account`  (Email,                       UserName,     FullName,            DepartmentID,              PositionID)
VALUE                  ('Buithang220398@gmail.com',  'BuiThang',   'Bùi Quang Thắng',       6,                      5),
                       ('Trinhmai1301@gmail.com',    'TrinhMai',   'Trịnh Thị Ngọc Mai',    1,						3),
                       ('Huong.nt@gmail.com',        'NgoHuong',   'Ngô Thu Hương',         2,						4),
                       ('maihuong.12@gmail.com',     'MaiHuong',   'Trinh Mai Hương',		3,						8),
                       ('duong.bt@gmail.com',        'TungDuong',  'Bùi Tùng Dương',		3,						3),
                       ('anh.bq@gmail.com',          'TrungAnh',   'Bùi Trung Anh',			7,						4),
                       ('ngocbich.tt@gmail.com',     'NgocBich',   'Nguyễn Ngọc Bích',		2,						3),
                       ('Lu.bq@gmail.com',           'BuiQuangLu', 'Bùi Quang Lự',			4,						5),
                       ('Nhung.nt@gmail.com',        'NguyenNhung','Nguyễn Thị Nhung',		5,						6),
                       ('Thanh.bt@gmail.com',        'BuiThanh',   'Bùi Thị Thanh',			1,						3),
                       ('Nga.mc@gmail.com',          'MacNga',     'Lý Thu Nga',			7,						8),
                       ('Thu.ngt@gmail.com',         'NguyenThu'   'Nguyễn Hoài Thu',		4,						5),
                       ('Quang.td@gmail.com',        'TrinhQuang', 'Lê Trịnh Quang',		8,						1),
                       ('Duy.nq@gmail.com',          'QuangDuy',   'Nguyễn Quang Duy',		9,						1),
                       ('Canh.nd@gmail.com',         'DucCanh',    'Nguyễn Đức Cảnh',		10,						2),
                       ('Jon.Mx@gmail.com',          'JonSon',     'Mic Jonson',			9,						7),
                       ('Maria.12@gmail.com',        'Maria',      'Oz Maria',				4,						10);
INSERT INTO  `Group`   (GroupName,			CreatorID)
VALUE                  ('Avengers',				1),
                       ('Black Panthers',		2),
                       ('Brewmaster Crew',		3),
                       ('Butchers',				4),
                       ('Desert Storm',			5);
INSERT INTO GroupAccount(GroupID)
VALUE                   (1),(3),(2),(4),(5),(2),(3),(1),(3),(4),(5),(2),(1),(2),(3),(3),(1);
INSERT INTO TypeQuestion(TypeName) 						
VALUE                   ('Essay'),
						('Multiple-Choice');
INSERT INTO CategoryQuestion (CategoryName)
VALUE                        ('Java'),
						     ('NET'),
                             ('Postman'),
                             ('Ruby'),
                             ('Autocard');
INSERT INTO Question (Content,												CategoryID,		TypeID,		CreatorID)
VALUE                ('Thiết kế font-end cho web bán hàng online',				2,				1,			12),
                     ('Chọn đáp án đúng cho những phát biểu về VLAN sau',		2,				2,			13),
                     ('Cho biết phát biểu sau đúng hay sai?',					4,				2,			14),
                     ('Thiết kế ảnh 3D cho ngôi biệt thự sau',					5,				1,			15),
                     ('Phát biểu sau là đúng về Postman',						3,				2,			16);
INSERT INTO Answer   (Content,		QuestionID,		isCorrect)
VALUE                ('abc Đúng',		2,			'Sai'),
					 ('(1 trang wep)',	1,			'Tốt'),
                     ('(1 ảnh 3D)',		4,			'Chưa đạt'),
                     ('1:Sai,2:Đúng',	3,			'Đúng'),
                     ('1,2,5 Đúng', 	5, 			'Sai'),
                     ('abd Đúng',		2,			'Đúng'),
                     ('acd Đúng',		2,			'Sai'),
                     ('(1 trang web)',	1,			'Khá'),
                     ('1,2,6 Đúng',		5,			'Sai'),
                     ('(1 ảnh 3D)',		4,			'Khá'),
                     ('1:Đúng,2:Sai',	3,			'Sai'),
                     ('(1 trang web)',	1,			'Khá');
INSERT INTO Exam     (Codes ,		Title,	 			CategoryID,		 Duration, 		CreatorID)
VALUE                (124,		'Lập Trình Web',			1,				60,				7),
                     (100,		'Thiết kế 3D',				5,				120,			8),
                     (111,		'Trắc nhiệm Ruby',			4,				45,				9),
					 (113,		'Trắc nhiệm Postman',		3,				45,				10),
                     (222,		'Trắc nhiệm VLAN',			2,				90,				11);
INSERT INTO ExamQuestion (ExamID)                     
VALUE                    (1),
						 (5),
                         (3),
                         (2),
                         (4);
                         
           
