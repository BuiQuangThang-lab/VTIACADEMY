package com.vti.entity.Inheritance;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	private String soPhatHanh;
	private String thangPhatHanh;
	
	public TapChi() {};

	public TapChi(int id, String tenNhaXuatBan, int soBanPhatHanh, String soPhatHanh, String thangPhatHanh) {
		super(id, tenNhaXuatBan, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public String getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(String soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public String getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(String thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số phát hành: ");
		setSoPhatHanh(sc.nextLine());
		System.out.println("Nhập vào tháng phát hành: ");
		setThangPhatHanh(sc.nextLine());
	}

	public void hien() {
		super.hien();
		System.out.println("Số phát hành: " + getSoPhatHanh());
		System.out.println("Tháng phát hành: " + getThangPhatHanh());
	}

}
