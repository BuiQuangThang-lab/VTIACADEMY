package com.vti.entity.Exception;

public class Position {
	private int id;
	private String name;

	public Position() {
	}

	public Position(int id, String name) {
		System.out.println("Mời bạn bạn nhập vào position id: ");
		this.id = ScannerUtils.inputInt("id phải là 1 số, mời nhập lại: ");
		this.name = ScannerUtils.inputString("Tên không được để trống, mời nhập lại: ");
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
	};

}
