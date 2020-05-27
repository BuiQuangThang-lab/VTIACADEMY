package com.vti.fontend;

import java.util.Date;

import com.vti.backend.Annotations;

public class AnnotationsProgram {
	public static void main(String[] args) {
		Annotations annotations = new Annotations();

		quesiton1();
		annotations.question2();
	}

	// Question 1:
	@SuppressWarnings("deprecation")
	public static void quesiton1() {
		Date date = new Date(2020, 4, 29);
		System.out.println(date);
	}
}
