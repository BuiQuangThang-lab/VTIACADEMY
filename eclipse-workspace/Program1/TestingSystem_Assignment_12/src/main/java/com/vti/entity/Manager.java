package com.vti.entity;

public class Manager extends User {
	private int ExpInYear;

	public Manager(String firstName, String lastName, int phone, String email, String password, int expInYear) {
		super(firstName, lastName, phone, email, password);
		ExpInYear = expInYear;
	}
	
	public Manager(String email, String password) {
		super(email, password);
	}

	public int getExpInYear() {
		return ExpInYear;
	}

}
