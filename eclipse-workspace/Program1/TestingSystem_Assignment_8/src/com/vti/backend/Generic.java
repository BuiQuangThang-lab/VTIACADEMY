package com.vti.backend;

import com.vti.entity.Student;

public class Generic {
	public void Question1_2_3() {
		Student<Integer> student1 = new Student<Integer>(1, "Nguyễn Văn A");
		Student<Float> student2 = new Student<Float>(1f, "Nguyễn Văn A");
//		System.out.println(student1.getId());
//		System.out.println(student2.getId());
		Print(student2.getId());
	}
	
	private <T> void Print(T a) {
		System.out.println(a);
	}
	
	private <T> void PrintArray(T[] arr) {
		for (T t : arr) {
			System.out.println(t);
		}
	}

}
