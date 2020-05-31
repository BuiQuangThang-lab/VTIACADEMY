package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.utils.JdbcUtils;
import com.vti.utils.properties.MessageProperties;

public class ManagerRepository implements IManagerRepository {
	private JdbcUtils jdbcUtils;
	private MessageProperties messageProperties;
	/**
	 * This class is create manager. 
	 * 
	 * @Description: .
	 * @author: Thang
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: thang
	 * @modifer_date: May 31, 2020
	 */
	// register
	public void createManager(String firstname, String lastname, int phone, String email, String password, int expInYear)
			throws ClassNotFoundException, SQLException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement object
		String sql = "INSERT INTO Account (FirstName, LastName, Phone, Email, Password, ExpInYear)"
				+ "VALUE              (   ? ,     ?   	,   ?  ,  ?   ,    ?  ,   ?	)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// set parameter
		preparedStatement.setString(1, firstname);
		preparedStatement.setString(2, lastname);
		preparedStatement.setInt(3, phone);
		preparedStatement.setString(4, email);
		preparedStatement.setString(5, password);
		preparedStatement.setInt(6, expInYear);

		// execute query
		int check = preparedStatement.executeUpdate();

		// check create success or false
		System.out.println(check > 0 ? messageProperties.getProperty("manager.insert.complete")
				: messageProperties.getProperty("manager.insert.false"));

		// disconnect
		jdbcUtils.disconnect();
	}

	/**
	 * This class is method check is manager is exists. 
	 * 
	 * @Description: .
	 * @author: Thang
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: thang
	 * @modifer_date: May 31, 2020
	 */
	
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement object
		String sql = "SELECT 1 FROM `Manager` WHERE Email = ? AND Password = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(3, email);
		preparedStatement.setString(4,password);

		// execute query
		ResultSet resultSet = preparedStatement.executeQuery();

		// handing result set
		if (resultSet.next()) {
			// disconnect
			jdbcUtils.disconnect();
			return true;
		} else {
			jdbcUtils.disconnect();
			return false;
		}

	}
}
