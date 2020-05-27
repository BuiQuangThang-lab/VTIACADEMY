package com.vti.entity.Static;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private static String college = "Đại học Bách Khoa Hà Nội";
	private static int money = 0;

	// Question4:
	static void change() {
		Scanner sc = new Scanner(System.in);
		String newCollege = sc.nextLine();
		System.out.println("college cũ: " + getCollege());
		setCollege(newCollege);
		System.out.println("college mới: " + getCollege());
	}

	

	public Student() {
	}
	
    //Qestion5:
	static int count = 0;

	public Student(int id, String name) throws Exception {
		super();
		this.id = id;
		this.name = name;
		count++;
		System.out.println(count);
		if(count > 7) {
			throw new Exception("Chỉ được nhập vào tối đa 7 Student!");
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

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	public static int getMoney() {
		return money;
	}

	public static void setMoney(int money) {
		Student.money = money;
	}

}
