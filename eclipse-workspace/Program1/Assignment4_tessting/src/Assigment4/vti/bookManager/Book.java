package Assigment4.vti.bookManager;

import java.util.Scanner;

public class Book extends Document {
	private String tenTacGia;
	private int soTrang;

	public Book() {

	}

	public Book(String tenTacGia, int soTrang) {
		super();
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	public void NhapThongTin() {
		super.NhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên tác giả: ");
		tenTacGia = sc.nextLine();
		System.out.println("Nhập vào số trang: ");
		soTrang = sc.nextInt();
	}

	public void HienThiThongTin() {
		super.HienThiThongTin();

	}

	public void xoaTaiLieu() {
		super.xoaTaiLieu();
	}

	public void Sach() {
		super.timTaiLieu();
	}
}
