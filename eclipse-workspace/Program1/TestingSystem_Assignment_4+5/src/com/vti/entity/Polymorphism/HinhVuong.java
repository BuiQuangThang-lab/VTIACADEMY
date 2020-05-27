package com.vti.entity.Polymorphism;

public class HinhVuong extends HinhChuNhat {
	
	
    @Override
    public int chuVi(int chieuDai, int chieuRong) {
    	System.out.println("Chu vi hình vuông: ");
    	return super.chuVi(chieuDai, chieuRong);
    }
    
    @Override
    public int dienTich(int chieuDai, int chieuRong) {
    	System.out.println("Diện tích hình vuông: ");
    	return super.dienTich(chieuDai, chieuRong);
    }
}
