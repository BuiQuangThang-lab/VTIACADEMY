package com.vti.entity.Inheritance;

import java.util.Scanner;

import com.vti.entity.construction.GioiTinh;

public class CanBo {
	private String hoTen;
	private int tuoi;
	private GioiTinh gioiTinh;
	private String diaChi;
	
	public CanBo() {};
	public CanBo(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		if(gioiTinh == 0) {
			this.gioiTinh = GioiTinh.NAM;
		}else if(gioiTinh == 1) {
			this.gioiTinh = GioiTinh.NU;
		}else {
			this.gioiTinh = GioiTinh.KHONG_BIET;
		}
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào họ và tên: ");
		setHoTen(sc.nextLine());
		System.out.println("Nhập vào vào tuổi: ");
		setTuoi(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập vào giới tính  (0: Nam, 1: Nữ, khác: Không biết)");
		setGioiTinh(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập vào địa chỉ: ");
		setDiaChi(sc.nextLine());
	}
	
	public void hien() {
		System.out.println("Họ và tên: " + getHoTen());
		System.out.println("Tuổi: " + getTuoi());
		System.out.println("Giới tính: " + getGioiTinh());
		System.out.println("Địa chỉ: " + getDiaChi());
	}

}
