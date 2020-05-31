package com.vti.entity;

public class Account {
	private int AccountID;
	private String Email;
	private String UserName;
	private String FullName;
	
	public Account() {
		
	}

	public Account(int accountID, String email, String userName, String fullName) {
		AccountID = accountID;
		Email = email;
		UserName = userName;
		FullName = fullName;
	}

	public int getAccountID() {
		return AccountID;
	}

	public String getEmail() {
		return Email;
	}

	public String getUserName() {
		return UserName;
	}

	public String getFullName() {
		return FullName;
	}
	
	@Override
	public String toString() {
		
		return "Account{" + "AccountID=" + AccountID + ", Email='" + Email + '\'' + ", Username='" + UserName + '\''
				+ ", FullName='" + FullName + '\'' + '}';	}

}
