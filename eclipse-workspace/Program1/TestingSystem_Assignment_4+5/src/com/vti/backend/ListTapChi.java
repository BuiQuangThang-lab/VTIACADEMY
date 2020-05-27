package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;


import com.vti.entity.Inheritance.TapChi;

public class ListTapChi {
	Scanner sc = new Scanner(System.in);
	ArrayList<TapChi> listTapChi = new ArrayList<>();

	public void nhapSach() {
		System.out.println("Nhập vào số lượng tạp chí cần nhập: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin tạp chí thứ " + (i + 1));
			TapChi tapChi = new TapChi();
			tapChi.nhap();
			listTapChi.add(tapChi);
		}
	}

	public void hienThiSach() {
		System.out.println("Thông tin tạp chí: ");
		for (TapChi tapChi : listTapChi) {
			System.out.println("Thông tin tạp chí thứ " + listTapChi.indexOf(tapChi));
			tapChi.hien();
		}
	}

	public void xoaSach() {
		System.out.println("Nhập vào id tài liệu cần xóa: ");
		int n = sc.nextInt();
		for (int i = 0; i < listTapChi.size(); i++) {
			if (listTapChi.get(i).getId() == n) {
				listTapChi.set(i, null);
			} else {
				System.out.println("Không có đối tượng cần xóa");
			}
		}
	}

	public void timSach() {
		System.out.println("Nhập vào tạp chí cần tìm: ");
		int n = sc.nextInt();
		for (int i = 0; i < listTapChi.size(); i++) {
			if (listTapChi.get(i).getId() == n) {
				System.out.println("Có sách: " + listTapChi.get(i));
			} else {
				System.out.println("Không có tạp chí đấy");
			}
		}
	}
}
