package com.vti.entity.Polymorphism;

public class Student1 implements IStudent {
	
	private int id;
	private String name;
	private int group;
	
	public Student1() {};
	

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


	public int getGroup() {
		return group;
	}


	public void setGroup(int group) {
		this.group = group;
	}


	public Student1(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}


	@Override
	public void diemDanh() {
		System.out.println();
		
	}

	@Override
	public void hocBai() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void donVeSinh() {
		// TODO Auto-generated method stub
		
	}

}
