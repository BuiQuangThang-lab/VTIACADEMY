package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.ListCanBo;

public class CanBoProgram {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ListCanBo listCanBo = new ListCanBo();
	int chon;
	
	do {
		menu();
		System.out.println("Mời bạn chọn chức năng: ");
		chon = sc.nextInt();
		switch(chon) {
		case 1:
			System.out.println("Tạo cán bộ");
			listCanBo.nhapCanBo();
			break;
		case 2:
			System.out.println("Hiển thị cán bộ: ");
			listCanBo.hienThiCanBo();
			break;
		case 3:
			System.out.println("Tìm cán bộ theo tên: ");
			listCanBo.timKiemCanBo();
			break;
		
		}
	}while(chon!=0);
}
	public static void menu() {
		System.out.println("===========MENU============");
		System.out.println("||     1. Tạo Cán Bộ       ||");
		System.out.println("||     2. Hiển thị Cán Bộ  ||");
		System.out.println("||     3. Tìm kiếm Cán Bộ  ||");
		System.out.println("||     4. Thoát            ||");
	}
	
}

