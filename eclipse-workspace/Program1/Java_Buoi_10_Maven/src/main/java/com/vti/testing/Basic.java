package com.vti.testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Basic {
	public static void main(String[] args)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resource/database.properties"));

		String url = properties.getProperty("url2");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

//// register the driver class with DriverManager
//		Class.forName(properties.getProperty("driver"));
//
//// Step 2: get a Database Connection
//		Connection connection = DriverManager.getConnection(url, username, password);
//
//		System.out.println("Connect success!");
//
//		//--------------------Question2-----------------------------------//
//		
//// Step 3: Create a statement object
//		String sql = "SELECT * FROM inputtesting.position;";
//		Statement statement = connection.createStatement();
//
//// Step 4: execute query
//		ResultSet resultSet = statement.executeQuery(sql);
//
//// Step 5: handling result set
//		while (resultSet.next()) {
//			System.out.println(resultSet.getInt("PositionID"));
//			System.out.println(resultSet.getString("PositionName"));
//		}
		
		//----------------------Question3: fix cứng----------------------------------//
		
//// Step 3: Create a statement object
//	String sql = "	INSERT INTO `Position` (`PositionID` ,		`PositionName`)"
//			   + "  VALUE				(14,		'Waitting room'  )";
//	Statement statement = connection.createStatement();
//
//	// Step 4: execute query
//	int effectedRecordAmount = statement.executeUpdate(sql);
//
//	// Step 5: handling result set
//	System.out.println("Effected Record Amount: " + effectedRecordAmount);
		
		//-----------------------Question3: user insert--------------------------------//
		
		
		// Nhap vao thong tin tu Console
		
		
//		// Step 3: Create a statement object
//		String sql = "	INSERT INTO `Position` (`PositionID` ,	`PositionName`	)"
//				+ " VALUE                   (?      ,         ?     )";
//		PreparedStatement preparedStatement = connection.prepareStatement(sql);
//
//		// input scanner
//		
//		
//		String PositionName = "WaittingRoom";
//		int PositionID = 18;
//
//		preparedStatement.setString(2, PositionName); 
//		preparedStatement.setInt(1, PositionID);
//
//		// Step 4: execute query
//		int effectedRecordAmount = preparedStatement.executeUpdate();

		// Step 5: handling result set
//		System.out.println("Effected Record Amount: " + effectedRecordAmount);
		
		//----------------------Question4----------------------------------//
		
//		// Step 3: Create a statement object
//		
//		String sql = "UPDATE `Position` " + 
//		             "SET    `PositionName` = ? " +
//				     "WHERE  `PositionID`   = ? ";
//		
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        
//     // input scanner
//        int PositionID = 5;
//        String PositionName = "abv";
//        
//     // set parameter
//        preparedStatement.setString(2, PositionName);
//        preparedStatement.setInt(1, PositionID);
//        
//     // Step 4: Excute SQL query
//        int effectedRecordAmount = preparedStatement.executeUpdate();
//
//	 // Step 5: handling result set
//		System.out.println("Effected Record Amount: " + effectedRecordAmount);
//        
//     // Step 6: close connection
//		
//		connection.close();
		
		//------------------------Question 5------------------------------------//
//		// Step 3: Create a statement object
//		
//		String sql = "DELETE `Position` " + 
//				     "WHERE  `PositionID`   = ? ";
//		
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        
//     // input scanner
//        int PositionID = 5;
//        
//     // set parameter
//        preparedStatement.setInt(1, PositionID);
//        
//     // Step 4: Excute SQL query
//        int effectedRecordAmount = preparedStatement.executeUpdate();
//
//	 // Step 5: handling result set
//		System.out.println("Effected Record Amount: " + effectedRecordAmount);
//        
//     // Step 6: close connection
//		
//		connection.close();
		
	}

}
