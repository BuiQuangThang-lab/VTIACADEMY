package com.vti.entity.Inheritance;

import java.util.Scanner;

public class Bao extends TaiLieu {
	String ngayPhatHanh;
	
	public Bao() {};

	public Bao(int id, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
		super(id, tenNhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public String getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(String ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào ngày phát hành: ");
		setNgayPhatHanh(sc.nextLine());

	}

	public void hien() {
		super.hien();
		System.out.println("Ngày phát hành: " + getNgayPhatHanh());
	}

}
