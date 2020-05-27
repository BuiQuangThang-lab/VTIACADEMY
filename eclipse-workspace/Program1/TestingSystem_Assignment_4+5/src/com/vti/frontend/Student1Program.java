package com.vti.frontend;

import com.vti.entity.Polymorphism.Student1;

public class Student1Program {
public static void main(String[] args) {
	Student1[] students = new Student1[10];
	 students[0] = new Student1(1, "Thắng", 1);
	 students[1]= new Student1(2, "Huy", 2);
	 students[2]= new Student1(3, "Lan", 3);
	 students[3]= new Student1(4, "Loan", 1);
	 students[4]= new Student1(5, "Hường", 2);
	 students[5]= new Student1(6, "Thanh", 3);
	 students[6]= new Student1(7, "Mai", 1);
	 students[7]= new Student1(8, "Tùng Anh", 2);
	 students[8]= new Student1(9, "Quang Duy", 3);
	 students[9]= new Student1(10, "Liên", 1);
	
	for (Student1 student : students) {
		student.diemDanh();
	}
	
	for (Student1 student : students) {
		if(student.getGroup() == 1) {
			student.donVeSinh();
		}if(student.getGroup() == 2) {
			student.hocBai();
		}
	}
}
}
