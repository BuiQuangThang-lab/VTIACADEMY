package com.vti.entity.Exception;

import java.util.Scanner;

public class Question_5 {
	public static void main(String[] args) {
		while(true) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 1 số: ");
		int a = sc.nextInt();
		System.out.println(a);
	}catch(Exception e) {
		System.out.println("wrong inputing! Please input a number as int");
	}
	}
}
}