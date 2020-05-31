package com.vti.entity;

public class User {
	private String firstName;
	private String lastName;
	private int phone;
	private String email;
	private String password;

	public User(String firstName, String lastName, int phone, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}

}
