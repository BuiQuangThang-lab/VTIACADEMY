package Assignment4.vti.abstraction;

import java.util.ArrayList;
import java.util.Scanner;

import Assigment4.vti.bookManager.Document;

public abstract class Phone {
	private String number;
	private String name;
	
	public static ArrayList<Phone> numberPhone;

	public Phone() {

	}

	public Phone(String number, String name) {
		this.number = number;
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//-----------------------------------------------------------------//
	public void insertPhone() {
		System.out.println("Thêm số điện thoại");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào họ và tên: ");
		name = sc.nextLine();
		System.out.println("Nhập vào số điện thoại: ");
		number = sc.nextLine();
		
	}
//-----------------------------------------------------------------//
	public void removePhone() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên: ");
		String xoa = sc.nextLine();
		
		for (int i = 0; i < numberPhone.size(); i++) {
			if (numberPhone.get(i).getName().equals(xoa)) {
				numberPhone.remove(i);
			} else {
				System.out.printf("id = %d not existed.\n", xoa);
			}
		}

	}
	//-----------------------------------------------------------------//
	public void updatePhone() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên cần update sđt: ");
		String capNhat = sc.nextLine();
		for(int i = 0; i < numberPhone.size(); i++) {
			if (numberPhone.get(i).getName() == capNhat) {
				System.out.println("Số điện thoại cũ: ");
				System.out.println("Nhập số điện thoại mới: ");
				String newNumber = sc.nextLine();
				numberPhone.get(i).setNumber(newNumber);;
				System.out.println(numberPhone.get(i).getNumber());
			} else {
				System.out.printf("Không thấy số điện thoại");
			}
		}
	}
	//-----------------------------------------------------------------//
	public void searchPhone() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên cần tìm sđt: ");
		String name = sc.nextLine();
		for(int i = 0; i < numberPhone.size(); i++) {
			if (numberPhone.get(i).getName().equals(name)) {
				System.out.println(numberPhone.get(i).getNumber());
			} else {
				System.out.printf("Không tìm thấy tên", name);
			}
		}
		
	}
	
	//-------------------------------------------------------------------//
	public abstract void dauSo();
	public abstract void tenDichVu();
	
}