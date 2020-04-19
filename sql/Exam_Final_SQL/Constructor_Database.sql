DROP DATABASE IF EXISTS Score_Student_Manager ;
CREATE DATABASE IF NOT EXISTS Score_Student_Manager;
USE Score_Student_Manager;

DROP TABLE IF EXISTS Student; 
CREATE TABLE Student(
     RN  							SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
     `Name`							VARCHAR(50) NOT NULL,
     Gender                         ENUM('Male','Female','Unknow')
);

DROP TABLE IF EXISTS `Subject`; 
CREATE TABLE `Subject`(
    sID 							TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    sName							VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS StudentSubject; 
CREATE TABLE StudentSubject(
	RN								SMALLINT UNSIGNED NOT NULL,
    sID								TINYINT UNSIGNED NOT NULL,
    Mark							DECIMAL(2,1),
    `Date`							DATE DEFAULT (CURRENT_DATE),
    UNIQUE(RN,sID),
    FOREIGN KEY (RN)     REFERENCES     Student(RN),
    FOREIGN KEY (sID)    REFERENCES     `Subject`(sID)
);
-- -----------------------------INSERT DATA---------------------------------------------------------------------------------------
INSERT INTO Student(  `Name`,                       Gender )
VALUE              ('Bùi Quang Thắng',				'Male' ),
				   ('Nguyễn Thị Nhung',				'Female'),
                   ('Lê Bảo Tuyến',					'Unknow');

INSERT INTO `Subject`(		sName			)
VALUE                (		'Math'			),
					 (		'Literature'	),
                     (		'English'		);

INSERT INTO StudentSubject(RN,	sID,	Mark	)
VALUE                 	  (1,	1,		8.5		),
						  (1,	2,		7.5		),
                          (2,	2,		3),
                          (2,	3,		2),
                          (3,	1,		5.5),
                          (3,	3,		1.5);