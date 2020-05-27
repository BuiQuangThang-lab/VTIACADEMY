package com.vti.entity.Exception;

import java.util.Scanner;

public class Question6 {
   public static void inputAge() {
	   Scanner input = new Scanner(System.in);
	   Integer intNumber = null;
	  while(true) {          
	   try {
	       System.out.println("Hãy nhập vào một số nguyên: ");
	       String strNumber = input.nextLine();
	       intNumber = new Integer(strNumber);
	   } catch (NumberFormatException e) {
	       System.out.println("wrong inputing! Please input a number as int!");
	   }
	   
	   System.out.println(intNumber);
   }  
   }
   public static void main(String[] args) {
	   inputAge();
}
}
