package Assigment4.vti.bookManager;

import java.util.ArrayList;
import java.util.Scanner;

import Assignment4.vti.inheritance.Person;

public class Document {
	private static String maTaiLieu;
	private static String tenBan;
	private static int soXuatBan;
	public static ArrayList<Document> arrDocument;

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenBan() {
		return tenBan;
	}

	public void setTenBan(String tenBan) {
		this.tenBan = tenBan;
	}

	public int getSoXuatBan() {
		return soXuatBan;
	}

	public void setSoXuatBan(int soBanXuat) {
		this.soXuatBan = soBanXuat;
	}

	public Document() {

	}

	public Document(String maTaiLieu, String tenBan, int soXuatBan) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenBan = tenBan;
		this.soXuatBan = soXuatBan;
	}

	public void NhapThongTin() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào mã tài liệu: ");
		maTaiLieu = sc.nextLine();
		System.out.println("Nhập vào tên tài liệu: ");
		tenBan = sc.nextLine();
		System.out.println("Nhập vào số xuất bản: ");
		soXuatBan = sc.nextInt();
		arrDocument = new ArrayList<Document>();
		Document d = new Document(maTaiLieu, tenBan, soXuatBan);
		arrDocument.add(d);

	}

	public void HienThiThongTin() {
		System.out.println("Xem thông tin nhân viên");
		for (int i = 0; i < arrDocument.size(); i++) {
			System.out.println(arrDocument.get(i));

		}
	}

	public void timTaiLieu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào loai sách cần tìm: ");
		String Ten = sc.nextLine();
		String[] thongTinDocument = tenBan.split("\t");
		for (int i = 0; i < arrDocument.size(); i++) {
			if (thongTinDocument[0].equals(Ten)) {
				System.out.println("Có sách " + Ten);
			} else {
				System.out.println("Không có nhân viên tên " + Ten);
			}
		}
	}

	public void xoaTaiLieu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào loai sách cần xóa: ");
		String xoa = sc.nextLine();
		Document d = null;
		for (int i = 0; i < arrDocument.size(); i++) {
			if (arrDocument.get(i).getTenBan() == xoa) {
				arrDocument.remove(i);
			} else {
				System.out.printf("id = %d not existed.\n", xoa);
			}
		}
	}
}