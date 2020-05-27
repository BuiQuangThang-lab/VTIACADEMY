package com.vti.entity.Final;

public class MyMath {
	final static double PI = 3.14;

	public static double sum(int a) {
		return PI + a;
	}

	public static void main(String[] args) {
		System.out.println(sum(1));
	}
}
