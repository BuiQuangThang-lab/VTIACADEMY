package com.vti.entity.Exception;

import com.vti.backend.ListPosition;

public class Department {

	private ScannerUtils su;
	private int id;
	private String name;

	public Department() {
		su = new ScannerUtils();

		System.out.println("Moi ban nhap id:");
		this.id = ScannerUtils.inputInt("id phai la 1 so, moi nhap lai: ");
		System.out.println("Moi ban nhap name:");
		this.name = ScannerUtils.inputString("Bạn cần điền vào tên: ");

		if (isInputPosition()) {
			inputPosition();
		}

		//
	}

	public void inputPosition() {
		ListPosition lp = new ListPosition();
		lp.insertPosition();

	}

	public boolean isInputPosition() {
		System.out.println("ban co muon nhap position ko?");
		while (true) {
			int choose = ScannerUtils.inputInt("Ban phai nhap 0 hoac 1, moi ban nhap lai: ");
			if (choose == 1) {
				return true;
			} else if (choose == 0) {
				return false;
			} else {
				System.out.println("Ban phai nhap 1 hoac 2, moi ban nhap lai: ");
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
