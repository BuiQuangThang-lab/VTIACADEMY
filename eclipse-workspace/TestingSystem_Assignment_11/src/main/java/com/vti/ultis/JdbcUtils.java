package com.vti.ultis;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vti.ultis.properties.DatabaseProperties;

public class JdbcUtils {
	private Connection connection;
	private DatabaseProperties databaseProperties;
	
    public JdbcUtils() throws FileNotFoundException, IOException {
    	databaseProperties = new DatabaseProperties();
    }
    
    public void ConnectForTesting() throws ClassNotFoundException, SQLException {
    	String url = databaseProperties.getProperty("url2");
    	String username = databaseProperties.getProperty("username");
    	String password = databaseProperties.getProperty("password");
    	
    	// Step 1: register the driver class with DriverManager
    	Class.forName(databaseProperties.getProperty("driver"));
    	
    	// Step 2: get a Database Connection
    	connection = DriverManager.getConnection(url,username,password);
    	System.out.println("Connect success");
    }
    
    public Connection connect() throws ClassNotFoundException, SQLException {
    	String url = databaseProperties.getProperty("url2");
		String username = databaseProperties.getProperty("username");
		String password = databaseProperties.getProperty("password");

		// Step 1: register the driver class with DriverManager
		Class.forName(databaseProperties.getProperty("driver"));

		// Step 2: get a Database Connection
		connection = DriverManager.getConnection(url, username, password);
		return connection;
    }
    
    public void disconnect() throws SQLException {
    	connection.close();
    }
}
