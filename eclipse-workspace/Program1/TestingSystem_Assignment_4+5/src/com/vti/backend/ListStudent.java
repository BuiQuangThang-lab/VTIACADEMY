package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Polymorphism.Student;



public class ListStudent {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student>listStudent = new ArrayList<>();
    
    public void inputInfo() {
    	System.out.println("Nhập vào số lượng học sinh cần thêm: ");
    	int n = sc.nextInt();
    	for (int i = 0; i < n; i++) {
			Student student = new Student();
			System.out.println("Nhập vào học sinh thứ: " + (i+1));
			student.nhap();
			listStudent.add(student);
		}
    }
    public void showInfo() {
    	for (Student student : listStudent) {
			System.out.println("Thông tin học sinh thứ: " + listStudent.indexOf(student));
			student.hien();
		}
    }
}
