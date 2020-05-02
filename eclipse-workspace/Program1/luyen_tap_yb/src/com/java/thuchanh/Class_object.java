package com.java.thuchanh;

public class Class_object {
     String ten;
     String diaChi;
     byte tuoi;
     
     public void diLai(String ten) {
    	 System.out.println(ten + "đi chơi");
     }
     
     public static void main(String[] args) {
		new Class_object();
		Class_object anhA = new Class_object();
		
		anhA.diLai("tôi ");
		
	}
}
