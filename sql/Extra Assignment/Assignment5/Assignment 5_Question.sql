USE `adventureworks`;
-- Exercise1: Subquery
-- Question1:  Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name của ProductSubcategory là 'Saddles'
SELECT p.`Name`
FROM product p
JOIN productsubcategory psc ON p.ProductSubcategoryID = psc.ProductSubcategoryID
WHERE psc.`Name` = 'Saddles';

-- Question 2:  Thay đổi câu Query 1 để lấy được kết quả sau. In this exercise you can change the previous query to deliver the following result set.  
SELECT p.`Name`
FROM product p
JOIN productsubcategory psc ON p.ProductSubcategoryID = psc.ProductSubcategoryID
WHERE psc.`Name` LIKE ('Bo%');

-- Question 3: Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring Bike (nghĩa là ProductSubcategoryID = 3) ;
-- Cách 2: Sử dụng EXT
WITH List_Price AS(
  SELECT p.`Name`,p.ListPrice AS x, p.ProductSubcategoryID
  FROM product p
  JOIN productsubcategory psc ON p.ProductSubcategoryID = psc.ProductSubcategoryID
  WHERE psc.ProductSubcategoryID = 3
)
SELECT *, MIN(x) AS lowest_ListPrice
FROM List_Price;

-- Cách 1: Sử dụng Sub_Querry
SELECT p.`Name`
FROM product p
JOIN productsubcategory psc ON p.ProductSubcategoryID = psc.ProductSubcategoryID
WHERE psc.ProductSubcategoryID = 3 AND p.ListPrice = 
					   	(SELECT MIN(listPrice) FROM (SELECT p.`Name`, p.ListPrice, p.ProductSubcategoryID
						FROM product p
						JOIN productsubcategory psc ON p.ProductSubcategoryID = psc.ProductSubcategoryID
						WHERE psc.ProductSubcategoryID = 3) AS T);
-- Exercise2: join table
-- Question 1:  Viết query lấy danh sách tên country và province
SELECT cr.`Name`, sp.`Name`
FROM Countryregion cr
JOIN StateProvince sp ON cr.CountryRegionCode = sp.CountryRegionCode ;

-- Question 2:  Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country Germany và Canada 
SELECT cr.`Name`, sp.`Name`
FROM Countryregion cr
JOIN StateProvince sp ON cr.CountryRegionCode = sp.CountryRegionCode 
WHERE cr.`Name` IN('Germany','Canada');

 -- Question 3
 SELECT soh.SalesOrderID, soh.OrderDate,soh.SalesPersonID,spn.Bonus,spn.SalesYTD
 FROM salesorderheader soh
 JOIN salesperson spn ON soh.SalesPersonID = spn.SalesPersonID;
 -- Question 4
 SELECT soh.SalesOrderID, soh.OrderDate,e.Title,spn.Bonus,spn.SalesYTD
 FROM salesorderheader soh
 JOIN salesperson spn ON soh.SalesPersonID = spn.SalesPersonID
 JOIN employee e ON e.ContactID = soh.ContactID
