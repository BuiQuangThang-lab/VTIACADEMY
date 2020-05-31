package com.vti.fontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.backend.presentationlayer.AccountController;
import com.vti.entity.Account;

public class Program {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
	AccountController accountController = new AccountController();
	List<Account>getListAccounts = accountController.getListAccounts();
	
	for (Account account : getListAccounts) {
		System.out.println(account);
	}
}
}
