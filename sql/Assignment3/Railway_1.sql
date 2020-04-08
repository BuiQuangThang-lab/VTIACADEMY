DROP DATABASE IF EXISTS traineeManagement;
CREATE DATABASE IF NOT EXISTS traineeManagement;
USE traineeManagement;
DROP TABLE IF EXISTS Khoa; 
CREATE TABLE Khoa(
   makhoa            CHAR(10)  PRIMARY KEY,
   tenkhoa           VARCHAR(30) UNIQUE NOT NULL,
   dienthoai         CHAR(10) UNIQUE NOT NULL
);
DROP TABLE IF EXISTS GiangVien; 
CREATE TABLE GiangVien(
   magv              TINYINT AUTO_INCREMENT PRIMARY KEY,
   hotengv           VARCHAR(30) NOT NULL,
   luong             DECIMAL(5,2),
   makhoa            CHAR(10) NOT NULL,
   FOREIGN KEY (makhoa) REFERENCES Khoa(makhoa)
);
DROP TABLE IF EXISTS SinhVien; 
CREATE TABLE SinhVien(
   masv              TINYINT AUTO_INCREMENT PRIMARY KEY,
   hotensv           VARCHAR(30) NOT NULL,
   makhoa            CHAR(10) NOT NULL,
   namsinh           SMALLINT NOT NULL,
   quequan           VARCHAR(30) NOT NULL,
   FOREIGN KEY (makhoa) REFERENCES Khoa(makhoa)
);
DROP TABLE IF EXISTS DeTai; 
CREATE TABLE DeTai(
  madt               CHAR(10)  PRIMARY KEY,
  tende              VARCHAR(30) UNIQUE NOT NULL,
  kinhphi            INT NOT NULL,
  NoiThucTap         VARCHAR(30) NOT NULL
);
DROP TABLE IF EXISTS HuongDan; 
CREATE TABLE HuongDan(
  masv               TINYINT AUTO_INCREMENT,
  madt               CHAR(10),
  magv               TINYINT,
  ketqua             DECIMAL(5,2),
  PRIMARY KEY(masv,madt,magv),
  FOREIGN KEY (masv) REFERENCES SinhVien(masv),
  FOREIGN KEY (madt) REFERENCES DeTai(madt),
  FOREIGN KEY (magv) REFERENCES GiangVien(magv)
  
);
