package com.vti.entity.Inheritance;

import java.util.Scanner;

public class CongNhan extends CanBo {

	private int bac;

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào bậc của công nhân: ");
		setBac(sc.nextInt());
	}
	
	public void hien() {
		super.hien();
		System.out.println("Bậc của nv: " + getBac());
	}

}
