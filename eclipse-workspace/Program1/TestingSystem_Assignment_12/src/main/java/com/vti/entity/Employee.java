package com.vti.entity;

public class Employee extends User {
	private String projectName;
	private String ProSkill;

	public Employee(String firstName, String lastName, int phone, String email, String password, String projectName, String proSkill) {
		super(firstName, lastName, phone, email, password);
		this.projectName = projectName;
		ProSkill = proSkill;
	}
	
	public Employee(String email, String password) {
		super(email, password);
	}

	public String getProjectName() {
		return projectName;
	}

	public String getProSkill() {
		return ProSkill;
	}

}
