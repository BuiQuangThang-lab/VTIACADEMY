package com.vti.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class is method jdbc work.  
 * 
 * @Description: .
 * @author: Thang
 * @create_date: May 31, 2020
 * @version: 1.0
 * @modifer: thang
 * @modifer_date: May 31, 2020
 */
public class JdbcUtils {
	private Connection connection;
	private com.vti.utils.properties.DatabaseProperties databaseProperties;
	
    public JdbcUtils() throws FileNotFoundException, IOException {
    	databaseProperties = new com.vti.utils.properties.DatabaseProperties();
    }
    
    /**
     * This class is method check connection.  
     * 
     * @Description: .
     * @author: Thang
     * @create_date: May 31, 2020
     * @version: 1.0
     * @modifer: thang
     * @modifer_date: May 31, 2020
     */
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
    /**
     * This class is method connection.  
     * 
     * @Description: .
     * @author: Thang
     * @create_date: May 31, 2020
     * @version: 1.0
     * @modifer: thang
     * @modifer_date: May 31, 2020
     */
    public Connection connect() throws ClassNotFoundException, SQLException {
    	String url = databaseProperties.getProperty("url2");
		String username = databaseProperties.getProperty("username");
		String password = databaseProperties.getProperty("password");

		// Step 1: register the driver class with DriverManager
		Class.forName(databaseProperties.getProperty("driver"));

		// Step 2: get a Database Connection
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect success");
		return connection;
    }
    
    public void disconnect() throws SQLException {
    	connection.close();
    }
}
