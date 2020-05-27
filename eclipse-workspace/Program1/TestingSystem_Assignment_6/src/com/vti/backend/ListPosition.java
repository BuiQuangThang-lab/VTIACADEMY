package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Exception.Position;
import com.vti.entity.Exception.ScannerUtils;

public class ListPosition {
    ArrayList<Position>listPosstion = new ArrayList<Position>();
    
    public void insertPosition() {
    	System.out.println("Mời bạn nhập vào số position cần thêm: ");
    	int n = ScannerUtils.inputInt("bạn cần nhập vào 1 số, mời nhập lại: ");
    	for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào thông tin thứ " + (i+1));
			Position p = new Position();
		}
    }
}
