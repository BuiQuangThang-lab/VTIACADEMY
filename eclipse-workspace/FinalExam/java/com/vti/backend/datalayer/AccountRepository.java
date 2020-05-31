package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Account;
import com.vti.utils.JdbcUtils;
import com.vti.utils.properties.MessageProperties;

public class AccountRepository implements IAccountRepository {
	private JdbcUtils jdbcUtils;
	private MessageProperties messageProperties;

	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException {
		List<Account> accounts = new ArrayList<Account>();

		// get connect
		Connection connection = jdbcUtils.connect();

		// create statement object
		String sql = "SELECT AccountID,Email,UserName,FullName FROM inputtesting.account";
		Statement statement = connection.createStatement();

		// execute query
		ResultSet resultSet = statement.executeQuery(sql);

		// handing results set
		while (resultSet.next()) {
			Account account = new Account(resultSet.getInt("AccountID"), resultSet.getString("Email"),
					resultSet.getString("UserName"), resultSet.getString("FullName"));
			accounts.add(account);
		}

		// close connect
		jdbcUtils.disconnect();
		return accounts;
	}

	// get Account by ID

	public Account getAccountById(int id) throws Exception {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement object
		String sql = "SELECT * FROM Account WHERE AccountID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setInt(1, id);

		// execute query
		ResultSet resultSet = preparedStatement.executeQuery();

		// handing result set
		if (resultSet.next()) {
			Account account = new Account(resultSet.getInt("AccountID"), resultSet.getString("Email"),
					resultSet.getString("UserName"), resultSet.getString("FullName"));

			// disconnect
			jdbcUtils.disconnect();
			return account;
		} else {
			jdbcUtils.disconnect();
			throw new Exception(messageProperties.getProperty("account.getAccountByID.cannotFindAccountById") + id);
		}

	}

	// check is account name exists?
	public boolean isAccountExists(String username) throws ClassNotFoundException, SQLException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement object
		String sql = "SELECT 1 FROM `Account` WHERE UserName = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(3, username);

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

	// check is account id exists
	public boolean isAccountIdExists(int id) throws ClassNotFoundException, SQLException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement object
		String sql = "SELECT 1 FROM Account WHERE AccountID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setInt(1, id);

		// execute query
		ResultSet resultSet = preparedStatement.executeQuery();

		// handing result set
		if (resultSet.next()) {
			// disconnection
			jdbcUtils.disconnect();
			return true;
		} else {
			jdbcUtils.disconnect();
			return false;
		}

	}

	// create Account
	public void createAccount(String email, String username, String fullName)
			throws ClassNotFoundException, SQLException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement object
		String sql = "INSERT INTO Account (Email, UserName, FullName)"
				+ "VALUE              (   ? ,     ?   	,   ?	)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// set parameter
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, username);
		preparedStatement.setString(3, fullName);

		// execute query
		int check = preparedStatement.executeUpdate();

		// check create success or false
		System.out.println(check > 0 ? messageProperties.getProperty("account.insert.complete")
				: messageProperties.getProperty("account.insert.false"));

		// disconnect
		jdbcUtils.disconnect();
	}

	// Update account

	public void updateAccount(int id, String newFullname) throws ClassNotFoundException, SQLException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement object
		String sql = "UPDATE Account SET FullName = ? WHERE AccountID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, newFullname);

		// execute query
		int check = preparedStatement.executeUpdate();

		// check update success or false
		System.out.println(check > 0 ? messageProperties.getProperty("account.update.complete")
				: messageProperties.getProperty("account.update.false"));

		// disconnection
		jdbcUtils.disconnect();

	}
	
	public void deleteAccount(int id) throws ClassNotFoundException, SQLException {
		//get connection
		Connection connection = jdbcUtils.connect();
		
		//create statement object
		String sql = "DELETE FROM Account WHERE AccountID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		//set parameter
		preparedStatement.setInt(1, id);
		
		//execute query
		int check = preparedStatement.executeUpdate();
		
		//check delete success or false
		System.out.println(check > 0 ? messageProperties.getProperty("account.delete.complete")
				: messageProperties.getProperty("account.delete.false"));
		
		//disconnect
		jdbcUtils.disconnect();
		
	}

	public Account getAccountByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateAccountByID(int id, String username) {
		// TODO Auto-generated method stub
		
	}

	public boolean isAccountExists(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}
