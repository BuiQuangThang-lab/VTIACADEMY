package com.vti.entity.construction;

public class Department {
	private int id;
	private String name;
	
	//--------------------Question1---------------------------//

	public Department() {
	}

	public Department(int id, String name) {
		this.id = 0;
		this.name = name;
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
	};	

	
}
