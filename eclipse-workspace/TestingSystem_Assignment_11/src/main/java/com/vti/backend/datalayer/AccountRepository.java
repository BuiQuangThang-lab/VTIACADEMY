package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.vti.entity.Account;
import com.vti.ultis.JdbcUtils;

public class AccountRepository {
	private JdbcUtils jdbcUtils;

	public AccountRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JdbcUtils();
	}

	public ArrayList<Account> getListAccounts() throws ClassNotFoundException, SQLException {
		
		//create listAccount
		ArrayList<Account>accounts = new ArrayList<Account>();
		
		// get connect
		Connection connection = jdbcUtils.connect();

		// create a statement object
		String sql = "SELECT AccountID,UserName,FullName,Email FROM inputtesting.account";
		Statement statement = connection.createStatement();

		// execute query
		ResultSet resultSet = statement.executeQuery(sql);

		// handing result set
		while (resultSet.next()) {
			Account account = new Account(resultSet.getInt("AccountID"), resultSet.getString("Email"),
					resultSet.getString("UserName"), resultSet.getString("FullName"));
            
			accounts.add(account);
		}
		
		jdbcUtils.disconnect();
		return accounts;
	}

}
