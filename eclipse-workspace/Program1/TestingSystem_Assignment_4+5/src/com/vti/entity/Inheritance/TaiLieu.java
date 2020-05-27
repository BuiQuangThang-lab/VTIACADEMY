package com.vti.entity.Inheritance;

import java.util.Scanner;

public abstract class TaiLieu {
	private int id;
	private String tenNhaXuatBan;
	private int soBanPhatHanh;
	
	public TaiLieu() {};

	public TaiLieu(int id, String tenNhaXuatBan, int soBanPhatHanh) {
		super();
		this.id = id;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}

	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào mã tài liệu: ");
		setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập vào tên nhà xuất bản: ");
		setTenNhaXuatBan(sc.nextLine());
		System.out.println("Nhập vào số bản phát hành: ");
		setSoBanPhatHanh(sc.nextInt());
	}

	public void hien() {
		System.out.println("Mã tài liệu: " + getId());
		System.out.println("Tên Nhà xuất bản: " + getTenNhaXuatBan());
		System.out.println("Số bản phát hành: " + getSoBanPhatHanh());
	}

}
