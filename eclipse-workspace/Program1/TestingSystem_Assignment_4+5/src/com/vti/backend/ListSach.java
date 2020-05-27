package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Inheritance.Sach;

public class ListSach {
    Scanner sc = new Scanner(System.in);
    ArrayList<Sach>listSach = new ArrayList<>();
    
    public void nhapSach() {
    	System.out.println("Nhập vào số lượng sách cần nhập: ");
    	int n = sc.nextInt();
    	for(int i = 0; i < n; i++) {
    		System.out.println("Nhập thông tin sách thứ " + (i+1));
    		Sach sach = new Sach();
    		sach.nhap();
    		listSach.add(sach);
    	}
    }
    
    public void hienThiSach() {
    	System.out.println("Thông tin sách: ");
    	for (Sach sach : listSach) {
			System.out.println("Thông tin sách thứ " + listSach.indexOf(sach));
			sach.hien();
		}
    }
    
    public void xoaSach() {
    	System.out.println("Nhập vào id tài liệu cần xóa: ");
    	int n = sc.nextInt();
    	for(int i = 0; i < listSach.size(); i++) {
    		if(listSach.get(i).getId() == n ) {
    			 listSach.set(i, null);
    		}else {
    			System.out.println("Không có đối tượng cần xóa");
    		}
    	}
    }
    
    public void timSach() {
    	System.out.println("Nhập vào sách cần tìm: ");
    	int n = sc.nextInt();
    	for(int i = 0; i < listSach.size(); i++) {
    		if(listSach.get(i).getId() == n) {
    			System.out.println("Có sách: " + listSach.get(i));
    		}else {
    			System.out.println("Không có sách đấy");
    		}
    	}
    }
}
