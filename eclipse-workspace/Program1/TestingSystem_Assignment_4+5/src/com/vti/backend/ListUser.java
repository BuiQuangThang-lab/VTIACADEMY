package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Abstraction.Employee;
import com.vti.entity.Abstraction.User;

public class ListUser {
	Scanner sc = new Scanner(System.in);
	ArrayList<User> listUser = new ArrayList<>();
	
	public void insertUser() {
		System.out.println("Nhập vào số lượng user cần thêm: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào thông tin user thứ: " + (i+1));
			User user = new Employee();
			user.nhap();
			listUser.add(user);
		}
	}
	
	public void displayInfo() {
		for (User user : listUser) {
			System.out.println("Thông tin user thứ: " + listUser.indexOf(user));
			user.hien();
		}
	}
    
}
