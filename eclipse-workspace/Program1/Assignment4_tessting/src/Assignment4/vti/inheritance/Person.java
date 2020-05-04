package Assignment4.vti.inheritance;

import java.util.ArrayList;
import java.util.Scanner;


public class Person {
	 private String hoTen;
	 private int tuoi;
	 private String gioiTinh;
	 private String diaChi;
	 
	 static ArrayList<String> arrPerson = new ArrayList<>(5);
	 
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
		for(int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập tên nhân viên: ");
			hoTen = sc.next();
			System.out.println("Nhập vào tuổi: ");
			tuoi = sc.nextInt();
			System.out.println("Nhập vào địa chỉ: ");
			diaChi = sc.nextLine();
			System.out.println("Nhập vào giới tính: ");
			gioiTinh = sc.nextLine();
			arrPerson.add(hoTen);
		}
	}
	
	public void nhapNhanVienCanTim() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào nhân viên vần tìm: ");
		hoTen = sc.nextLine();
	}
	
	public void timNhanVienTheoTen() {
        String[] thongTinNV = hoTen.split("\t");
        if (thongTinNV[0].equals(hoTen)) {
           System.out.println("Có nhân viên tên " + hoTen);
        } else {
            System.out.println("Không có nhân viên tên " + hoTen);
        }       
    }
	 
	public void HienThiThongTin() {
		System.out.println("\n Thông tin cán bộ này là: \n");
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("\n Tuổi: " + tuoi);
		System.out.println("\n Địa chỉ: " + diaChi);
	    System.out.println("\n Giới tính" + gioiTinh);
	}
	
	 
}

