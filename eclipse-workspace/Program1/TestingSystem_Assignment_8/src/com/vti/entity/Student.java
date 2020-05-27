package com.vti.entity;

public class Student<T> {
	private T id;
	private String name;

	public Student(T id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	<T> void print(T id, T name) {
		System.out.println(id + " " + name);
	}

}
