package com.vti.entity.construction;

import java.sql.Date;
import java.time.LocalDate;

public class Group {
	private int id;
	private String name;
	private Account creator;
	private Account[] accounts;
	private LocalDate createDate;
	public Group(String name, Account creator, Account[] accounts, LocalDate createDate) {
		super();
		this.name = name;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}
	
	public Group(String name, Account creator, String[] userNames, LocalDate createDate) {
		super();
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		
		this.accounts = new Account[userNames.length];
		for(int i = 0; i < userNames.length; i++) {
			Account account = new Account(userNames[i]);
			account = accounts[i];
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
}
