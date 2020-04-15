DROP DATABASE IF EXISTS WorksManagement ;
CREATE DATABASE IF NOT EXISTS WorksManagement;
USE WorksManagement;
-- -------------------------------------------------------------------------------------------------------------------------
DROP TABLE IF EXISTS Employee; 
CREATE TABLE Employee(
  EmployeeID                SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  EmployeeLastName          VARCHAR(10),
  EmployeeFirstName         VARCHAR(10),
  EmployeeHireDate          DATE,
  EmployeeStatus            TEXT,
  SupervisorID              SMALLINT UNSIGNED ,
  SocialSecurityNumber      TINYINT UNIQUE,
  FOREIGN KEY (SupervisorID) REFERENCES Employee(EmployeeID)
  
);
DROP TABLE IF EXISTS Project; 
CREATE TABLE Project(
  ProjectID                SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  ManagerID                SMALLINT UNSIGNED UNIQUE NOT NULL,
  ProjectName 			   VARCHAR(50),
  ProjectStartDate         DATE DEFAULT (CURRENT_DATE),
  ProjectDescription       TEXT,
  ProjectDetails           TEXT,
  ProjectCompletedOn       DATE,
  FOREIGN KEY (ManagerID) REFERENCES Employee(EmployeeID)
);

DROP TABLE IF EXISTS Project_Modules; 
CREATE TABLE Project_Modules(
  ModuleID                  SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  ProjectID                 SMALLINT UNSIGNED NOT NULL,
  EmployeeID                SMALLINT UNSIGNED NOT NULL,
  ProjectModulesDate		DATE ,
  ProjectModulesCompletedOn DATE,
  ProjectModulesDescription TEXT,
  FOREIGN KEY (ProjectID)  REFERENCES Project(ProjectID),
  FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID)
  
);

DROP TABLE IF EXISTS Work_Done; 
CREATE TABLE Work_Done(
  WorkDoneID                SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  EmployeeID                SMALLINT UNSIGNED NOT NULL,
  ModuleID                  SMALLINT UNSIGNED NOT NULL,
  WorkDoneDate              DATE,
  WorkDoneDecription        TEXT,
  WorkDoneStatus            TEXT,
  FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
  foreign key (ModuleID)   references Project_Modules(ModuleID)
  
);
