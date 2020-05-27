package com.vti.entity.construction;

import java.util.Scanner;

import com.vti.entity.Inheritance.CanBo;

public class NhanVien extends CanBo {
	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào công việc của nv: ");
		setCongViec(sc.nextLine());
	}
	
	public void hien() {
		super.hien();
		System.out.println("Công việc của nv: " + getCongViec());
	}

}
