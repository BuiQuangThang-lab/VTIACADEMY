package com.vti.entity;

public class Account {
	private int accountId;
	private String email;
	private String username;
	private String fullName;

	public Account() {
	}

	public Account(int accountId, String email, String username, String fullName) {
		this.accountId = accountId;
		this.email = email;
		this.username = username;
		this.fullName = fullName;
	}

	public int getAccountId() {
		return accountId;
	}

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getFullName() {
		return fullName;
	};

}
