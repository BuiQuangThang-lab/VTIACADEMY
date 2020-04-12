USE traineeManagement;
insert into Khoa         (makhoa,	 tenkhoa,					 dienthoai)
value                    ('FE',		'Electric', 				'0382451818'),
						 ('FI', 	'Industry', 				'0383228181'),
                         ('IT',		'Information Technologi',	'0986613692'),
                         ('CE',		'Chemical Engineering',		'0344799395'),
                         ('FB',		'Biological',			    '0854221899');

insert into GiangVien    (magv,		     hotengv,			 luong,	   makhoa)
value                    ('1',		'Trinh Thi Ngoc Mai',	'100.00',	'FI'),
						 ('2',		'Bui Quang Thang',		'200.00',	'FE'),
                         ('3',		'Bui Quang Lu',			'300.00',	'FB'),
                         ('4',		'Bui Thi Thanh',		'250.00',	'IT'),
                         ('5',		'Nguyen Thi Nhung',		'150.00',	'CE'),
                         ('6',		'Pham Van An',			'225.50',	'FE'),
                         ('7',		'Nguyen Ngoc Bao',		'300.00',	'CE'),
                         ('8',		'Jonsonbaby',			'500.00',	'FB');
                        
insert into SinhVien     (hotensv,  			makhoa,			namsinh,		quequan)
value                    ('Bui Tung Duong',		'FI',			'1998',			'Thai Binh'),
                         ('Nguyen Duc Diep',	'FE',			'1997',			'Ninh Binh'),
                         ('Vu Van Thanh',		'CE',			'1996',			'Thanh Hoa'),
                         ('Ngo Duc Hung',		'CE',			'1998',			'Lang Son'),
                         ('Nguyen Trung Anh',	'FB',			'1999',			'Cao Bang'),
                         ('Vu Nhat',			'CE',			'1998',			'Ha Noi'),
                         ('Nguyen The Nghia',	'IT',			'1998',			'Nghe An'),
                         ('Vu Tien Dung',		'FB',			'1999',			'Thai Binh'),
                         ('Trinh Thi Huong',	'FB',			'2000',			'Thanh Hoa'),
                         ('Hai Do',				'FI',			'2001',			'Ca Mau');
insert into DeTai        (madt,		tende,						NoiThucTap,				kinhphi)
value                    ('DT1A',	'máy khử khuẩn',	 	 'Nhà máy Điện',			10000000),
                         ('DA2C',	'hoa lan nhà kính',	 	 'Đại học Nông Nghiệp',		2000000),
						 ('CD1',	'web bán hàng oline',	 'Công Ty ATS',				1000000),
                         ('AQ1A',	'Nghiên cứu Vininxianua','Khoa Hóa-ĐHBKHN',			500000),
                         ('ADC',	'Thiết kế bộ điều áp',   'Tập đoàn FPT',			12000000);
insert into HuongDan     (masv,	madt,	magv,	ketqua)
value                    ('1',	'DT1A',	'1',	'080.00'),
						 ('2',	'CD1',	'3',	'070.50'),
                         ('4',	'DT1A',	'2',	'090.00'),
                         ('5',	'DT1A',	'1',	'070.50'),
                         ('7',	'ADC',	'4',	'090.00'),
                         ('8',	'CD1',	'3',	'070.00'),
                         ('9',	'CD1',	'3',	'080.00'),
                         ('10', 'DA2C',	'7',	 null)