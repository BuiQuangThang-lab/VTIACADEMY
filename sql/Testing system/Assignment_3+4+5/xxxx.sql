DROP PROCEDURE IF EXISTS Find_User_Name;
DELIMITER $$
CREATE PROCEDURE Find_User_Name (IN String_Name VARCHAR(50),
										 OUT Account_Name VARCHAR(50),
                                         OUT User_Name VARCHAR(50))
   BEGIN 
          SELECT FullName , UserName
          INTO Account_Name, User_Name
          FROM `Account` a
          WHERE a.FullName = String_Name 
          OR a.UserName = String_Name;
   END $$Find_User_Name
DELIMITER ;
CALL Find_User_Name('BuiThang',@Account_Name, @User_Name);
SELECT @Account_Name , @User_Name;

-- ------------------------------------------------------------------------------------------------
USE inputtesting;
DROP PROCEDURE IF EXISTS Find_User_Name;
DELIMITER $$
CREATE PROCEDURE Find_User_Name (IN String_Name VARCHAR(50),
							     OUT tam1 VARCHAR(50), OUT tam2 VARCHAR(50))
   BEGIN 
          SELECT FullName,UserName
          INTO tam1,tam2
          FROM `Account` a
          WHERE a.FullName = String_Name OR
           a.UserName = String_Name;
          SET @result = tam1 OR tam2;
   END $$Find_User_Name
DELIMITER ;
CALL Find_User_Name('BuiThang',@tam1,@tam2);
SELECT @result;
