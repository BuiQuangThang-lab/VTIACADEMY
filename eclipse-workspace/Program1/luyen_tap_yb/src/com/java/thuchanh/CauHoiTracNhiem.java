package com.java.thuchanh;

import java.util.Scanner;

public class CauHoiTracNhiem {
     public static void main(String[] args) {
		
    	 Scanner scan = new Scanner(System.in);
    	 
    	 while(true) {
    		 System.out.println("Lệnh tiếp tục vòng lặp trong Java là gì: ");
    		 System.out.println("1.  Continue");
    		 System.out.println("2.  Break");
    		 System.out.println("Chọn q để thoát");
    		 String luaChon = scan.nextLine();
    		 
    		 if(luaChon.equals("1")) {
    			 System.out.println("Bạn trả lời đúng");
    			 break;
    		 }else if(luaChon.equals("2")) {
    			 System.out.println("Bạn trả lời sai");
    			 break;
    		 }else if(luaChon.equals("q")) {
    			 break;
    		 }else {
    			 System.out.println("vui lòng chọn đáp án !");
    		 }
    	 }
	}
}
