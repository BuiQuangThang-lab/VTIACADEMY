package com.java.thuchanh;

import java.util.Scanner;

public class Mang {
  public static void main(String[] args) {
	
	  int[] mang = new int[5];
	  
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Mời bạn nhập vào giá trị của mảng: ");
	  
	  for(int i = 0; i < mang.length; i ++) {
		  mang[i] = scan.nextInt();
	  }
	  
	  System.out.println("Mảng được tạo là: ");
	  
	  for(int x : mang) {
		  System.out.print(x+" ");		  
	  }
	  
	  // Tìm kiếm phần tử mảng:
	  int k = scan.nextInt();
	  for(int j = 0; j < mang.length-1; j++) {
		  if(k == mang[j]) {
			  System.out.println("Phần tử được tìm kiếm là: "+ k);
			  System.out.println("Ở vị trí: "+ j);
		}
	 }
	  // Sắp xếp phần tử trong mảng:
	  for(int i = 0; i < mang.length - 1; i++) {
		  int temp = mang[i];
		  for(int j = i + 1; j < mang.length; j ++) {
			  if(temp > mang[j]) {
				  mang[i] = mang[j];
				  mang[j] = temp;
				  temp = mang[j];
			  }
		  }
	
	  }
	  System.out.println("Mảng được sắp xếp theo thứ tự tăng dần: ");
	  for(int x : mang) {
		  System.out.println(x);
	  }
	  
}
   
}
