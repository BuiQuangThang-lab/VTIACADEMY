package Assignment4.vti.Polymorphism.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	private String ten;
	private String gioiTinh;
	private String ngaySinh;
	private String diaChi;

	public Person() {
	}

	public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
		super();
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	};

	public void Nhap() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Tên: ");
		setTen(sc.nextLine());
		System.out.println("Giới tính: ");
		setGioiTinh(sc.nextLine());
		System.out.println("Địa chỉ: ");
		setDiaChi(sc.nextLine());
		System.out.println("Ngày sinh: ");
		setNgaySinh(sc.nextLine());
		String pattern = "dd-MM-yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		java.time.LocalDate localDate = LocalDate.parse(ngaySinh, formatter);

	}

	public void hien() {
		System.out.println("Tên: " + getTen());
		System.out.println("Giới tính: " + getGioiTinh());
		System.out.println("Ngày Sinh: " + getNgaySinh());
		System.out.println("Địa chỉ: " + getDiaChi());
	}

	Scanner sc = new Scanner(System.in);
	ArrayList<Person> listPerson = new ArrayList<>();

	public void inputInfo() {
		System.out.println("Nhập số Person muốn nhập: ");
		int n = sc.nextInt();
		Person p = new Person();
		for (int i = 0; i < n; i++) {			
			p.Nhap();
			listPerson.add(p);
		}
	}
	public void showInfo() {
		for(Person persons : listPerson) {
			persons.hien();
		}
	}

}
