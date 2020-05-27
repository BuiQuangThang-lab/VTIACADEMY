package com.vti.backend;

import java.util.Scanner;

public class Contact {
	private String name;
	private String number;

	public Contact() {
	};

	public Contact(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên: ");
		setName(sc.nextLine());
		System.out.println("Nhập vào number: ");
		setNumber(sc.nextLine());
	}
	
	public void hien() {
		System.out.println("Tên: " + getName());
		System.out.println("Number: " + getNumber());
	}

}
