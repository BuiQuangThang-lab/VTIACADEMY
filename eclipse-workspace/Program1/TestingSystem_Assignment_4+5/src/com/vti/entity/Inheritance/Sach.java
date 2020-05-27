package com.vti.entity.Inheritance;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tacGia;
	private int soTrang;
	
	public Sach() {};

	public Sach(int id, String tenNhaXuatBan, int soBanPhatHanh, String tacGia, int soTrang) {
		super(id, tenNhaXuatBan, soBanPhatHanh);
		this.tacGia = tacGia;
		this.soTrang = soTrang;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên tác giả: ");
		setTacGia(sc.nextLine());
		System.out.println("Nhập vào số trang: ");
		setSoTrang(sc.nextInt());
	}
	
	public void hien() {
		super.hien();
		System.out.println("Tên tác giả: " + getTacGia());
		System.out.println("Số trang: " + getSoTrang());
	}

}
