package com.vti.backend;

import com.vti.entity.Student;

public class Annotations {
//Question2:

	@SuppressWarnings("deprecation")
	public void question2() {
		Student student = new Student(1, "Nguyễn Văn A");
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getIdV2());

	}
}
