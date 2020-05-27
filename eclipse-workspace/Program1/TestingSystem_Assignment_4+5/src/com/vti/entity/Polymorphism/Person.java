package com.vti.entity.Polymorphism;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.vti.entity.Abstraction.Gender;

public class Person {
	private String name;
	private Gender gender;
	private String birthday;
	private String address;

	public Person() {
	}

	public Person(String name, Gender gender, String birthday, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(int gender) {
		if(gender == 0) {
			this.gender = Gender.MALE;
		}else if(gender == 1) {
			this.gender = Gender.FEMALE;
		}else {
			this.gender = Gender.UNKNOW;
		}
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	};
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên: ");
		setName(sc.nextLine());
		System.out.println("Nhập vào giới tính: (0: Male; 1: Female; Khác: unknown)");
		setGender(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập vào ngày sinh: ");
		setBirthday(sc.nextLine());
		String pattern = "dd-MM-yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		java.time.LocalDate localDate = LocalDate.parse(birthday, formatter);
		System.out.println("Nhập vào địa chỉ: ");
		setAddress(sc.nextLine());
	}
	
	public void hien() {
		System.out.println("Tên: " + getName());
		System.out.println("Giới tính: " + getGender());
		System.out.println("Ngày sinh: " + getBirthday());
		System.out.println("Địa chỉ: " + getAddress());
	}


}
