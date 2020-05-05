package Assignment4.vti.inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	private String hoTen;
	private int tuoi;
	private String gioiTinh;
	private String diaChi;

	public static ArrayList<Person> arrPerson;

	public Person() {

	}

	public Person(String hoTen, int tuoi, String gioiTinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	protected String getHoTen() {
		return hoTen;
	}

	protected void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	protected int getTuoi() {
		return tuoi;
	}

	protected void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	protected String getGioiTinh() {
		return gioiTinh;
	}

	protected void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	protected String getDiaChi() {
		return diaChi;
	}

	protected void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void NhapThongTin() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên nhân viên: ");
		hoTen = sc.next();
		System.out.println("Nhập vào tuổi: ");
		tuoi = sc.nextInt();
		System.out.println("Nhập vào địa chỉ: ");
		diaChi = sc.nextLine();
		System.out.println("Nhập vào giới tính: ");
		gioiTinh = sc.nextLine();
		arrPerson = new ArrayList<Person>();
		Person s = new Person(hoTen, tuoi, diaChi, gioiTinh);
		arrPerson.add(s);

	}

	public void timNhanVienTheoTen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào nhân viên vần tìm: ");
		String Ten = sc.nextLine();
		String[] thongTinNV = hoTen.split("\t");
		if (thongTinNV[0].equals(Ten)) {
			System.out.println("Có nhân viên tên " + Ten);
		} else {
			System.out.println("Không có nhân viên tên " + Ten);
		}
	}

	public void HienThiThongTin() {
		System.out.println("Xem thông tin nhân viên");
		for (int i = 0; i < arrPerson.size(); i++) {
			System.out.println(arrPerson.get(i));
		}
	}

}
