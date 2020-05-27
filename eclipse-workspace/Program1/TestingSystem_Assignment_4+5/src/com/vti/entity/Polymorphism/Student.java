package com.vti.entity.Polymorphism;

import java.util.Scanner;

import com.vti.entity.Abstraction.Gender;

public class Student extends Person {
	private int id;
	private String email;
	private double avg;

	public Student() {
	}

	public Student(String name, Gender gender, String birthday, String address, int id, String email, double avg) {
		super(name, gender, birthday, address);
		this.id = id;
		this.email = email;
		this.avg = avg;
	};
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập vào mã sinh viên: ");
		setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập vào email: ");
		setEmail(sc.nextLine());
		System.out.println("Nhập vào điểm trung bình: ");
		setAvg(sc.nextDouble());
	}
	
	@Override
	public void hien() {
		super.hien();
		System.out.println("mã sinh viên: " + getId());
		System.out.println("email: " + getEmail());
		System.out.println("Điểm trung bình: " + getAvg());
	}
}
