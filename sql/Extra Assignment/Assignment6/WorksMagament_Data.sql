USE WorksManagement;
INSERT INTO Project (  ManagerID,  ProjectName,       ProjectDescription,               ProjectDetails,    ProjectCompletedOn )
VALUE               (    3,         'Web',       'Thiết kế trang web bán hàng online',  'Gồm 3 mảng chính',  '2020-07-16'     ),
					(    2,		    'Nhúng', 	 'Thiết kế bộ điều khiển ánh sáng',	    'Gồm 4 phần chính',	 '2020-07-14'     ),
                    (    4,  		'Autocard',	 'Thiết kế banr vẽ nhà 3D',				'Gồm 3 phần chính',	 '2020-07-01'	 );
INSERT INTO Project_Modules (ProjectID,   EmployeeID,	ProjectModulesDate,		ProjectModulesCompletedOn,		ProjectModulesDescription)
VALUE                       (1,				1,				'2020-05-20',		 '2020-05-10',					'Thiết kế cơ sở dữ liệu' ),
                            (2,				2,				'2020-06-20',		 '2020-06-01',					'Vẽ mạch in và đấu mạch' ),
                            (1, 			3,				'2020-05-11',		 '2020-05-20',					'Viết font-end cho web'  ); 
INSERT INTO Work_Done (EmployeeID,	ModuleID ,	WorkDoneDate,		WorkDoneDecription,						WorkDoneStatus				)
VALUE                (1	,			1,			'2020-05-10',		'Cơ sở dữ liệu gồm 25 bảng',			'Dã hoàn thành và tối ưu'	),
                     (2,			2,			'2020-06-20',		'Mạch gồm 25 linh liện và cảm biến',	'Mạch đã chạy và chính xác' ),
                     (3,			3,			'2020-05-11',		'Giao diện yêu cầu đăng nhập ngời dùng', 'Giao diện đẹp và đáp ứng nhu cầu khách hàng');
INSERT INTO Employee (EmployeeLastName,EmployeeFirstName,EmployeeHireDate,EmployeeStatus,SupervisorID,  SocialSecurityNumber)
VALUE                ('Thắng',			'Bùi',				'2017-03-22',    'Đang làm',     5,			'152179724'),
                     ('Trung',			'Nguyễn',			'2018-11-11',	 'Đang làm',	 6,			'111222333'),
                     ('Cừ',				'Đặng',				'2019-01-01',	 'Đang làm',	 7,			'120119989'),
                     ('Xoan',			'Đinh',				'2016-11-02',	 'Đang làm',	 8,			'394473758'),
                     ('An',				'Vũ',				'2016-01-11',	 'Giám sát',     null,		'435867933'),
                     ('Bình',			'Trịnh',			'2012-11-20',	 'Giám sát',	 null,		'124345465'),
                     ('Dương',			'Bùi',				'2013-11-03',	 'Giám sát',	 null,		'485474030')