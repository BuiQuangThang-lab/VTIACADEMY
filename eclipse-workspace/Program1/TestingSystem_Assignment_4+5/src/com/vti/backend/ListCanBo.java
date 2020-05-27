package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Inheritance.CanBo;

public class ListCanBo {
	Scanner sc = new Scanner(System.in);
	ArrayList<CanBo> listCanBo = new ArrayList<>();

	public void nhapCanBo() {
		
		System.out.println("Nhập vào số lượng cán bộ cần nhập: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào thông tin cán bộ thứ " + (i + 1));
			CanBo cb = new CanBo();
			cb.nhap();
			listCanBo.add(cb);
		}

	}

	public void hienThiCanBo() {
		System.out.println("Danh sách cán bộ: ");
		for (CanBo canBo : listCanBo) {
			System.out.println("Thông tin cán bộ thứ: " + (listCanBo.indexOf(canBo) + 1));
			canBo.hien();
		}
	}

	public void timKiemCanBo() {

		System.out.println("Mời bạn nhập vào cán bộ cần tìm: ");
		String tenCB = sc.nextLine();
		for (int i = 0; i < listCanBo.size(); i++) {
			if (listCanBo.get(i).getHoTen().equals(tenCB)) {
				System.out.println("Có cán bộ: " + tenCB);
			} else {
				System.out.println("Không có cán bộ nào tên " + tenCB);
			}
		}
	}
}
