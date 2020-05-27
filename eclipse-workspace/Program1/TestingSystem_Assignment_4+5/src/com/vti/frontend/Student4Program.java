package com.vti.frontend;

import com.vti.entity.encapsulation.Student4;

public class Student4Program {
 public static void main(String[] args) {
	    Student4 student1 = new Student4("Thắng");
	    
		Student4 student2 = new Student4("Hoa");
		
		Student4 student3 = new Student4("Duy");
		student3.setAvgScore(4.0);
		
		
		System.out.print(student1.getName() + " học lực: ");
		student1.setAvgScore(6.9);
		System.out.print(student2.getName() + " học lực: ");
		student2.setAvgScore(8.0);
	}
}
