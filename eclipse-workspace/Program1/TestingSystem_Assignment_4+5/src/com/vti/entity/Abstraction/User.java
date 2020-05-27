package com.vti.entity.Abstraction;

import java.util.Scanner;

public abstract class User {
	private String name;
	private double salaryRatio;

	public User() {
	};

	public User(String name, double salaryRatio) {
		super();
		this.name = name;
		this.salaryRatio = salaryRatio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalaryRatio() {
		return salaryRatio;
	}

	public void setSalaryRatio(double salaryRatio) {
		this.salaryRatio = salaryRatio;
	}

	public double calculatePay() {
		return getSalaryRatio();
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên: ");
		setName(sc.nextLine());
		System.out.println("Nhập vào lương: ");
		setSalaryRatio(sc.nextDouble());
	}

	public void hien() {
		System.out.println("Tên: " + getName());
		System.out.println("salary: " + getSalaryRatio());

	}
}
