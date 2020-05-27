package com.vti.entity.Inheritance;

public abstract class Student5 extends Person {

	private int id;

	public Student5(String name, int id) {
		super(name);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
    
}
