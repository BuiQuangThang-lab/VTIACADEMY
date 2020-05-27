package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Exception.Department;
import com.vti.entity.Exception.ScannerUtils;

public class ListDepartment { 
	
	ArrayList<Department> listDepartment = new ArrayList<Department>();
	Scanner sc = new Scanner(System.in);
	public void nhapDepartment() {
		System.out.println("Nhập vào số lượng Department cần thêm: ");
		int n = ScannerUtils.inputInt("Bạn cần nhập vào 1 số");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào thông tin thứ " + (i+1));
			Department d = new Department();
		    new Department();
		    d.isInputPosition();
		    d.inputPosition();
		   
		}
	}
}
