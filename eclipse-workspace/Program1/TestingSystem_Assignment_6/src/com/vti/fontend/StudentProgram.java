package com.vti.fontend;

import java.io.ObjectInputStream.GetField;

import com.vti.entity.Static.PrimaryStudent;
import com.vti.entity.Static.SecondaryStudent;
import com.vti.entity.Static.Student;

public class StudentProgram {
	public static void main(String[] args) throws Exception {

////Question1:
//		Student[] students = new Student[3];
//		students[0] = new Student(1, "Nguyễn Văn A");
//		students[1] = new Student(2, "Nguyễn Văn B");
//		students[2] = new Student(3, "Nguyễn Văn C");

//	    for (int i = 0; i < 3; i++) {
//			System.out.println(students[i].getName() +" " + Student.getCollege());
//		}
//	    System.out.println("");
//	    System.out.println("Thay đại học Bách Khoa thành đại học Thăng Long");
//	    System.out.println("");
//	    
//	    for (int i = 0; i < students.length; i++) {
//			Student.setCollege("Đại học Thăng Long");
//			System.out.println(students[i].getName() +" " + Student.getCollege());
//		}

//Question2:

//		System.out.println("Mỗi học sinh đóng 100K");
//		int sum = 0;
//		for (int i = 0; i < students.length; i++) {
//			sum += 100;
//			Student.setMoney(sum);
//		}
//		System.out.println("Quỹ hiện tại " + Student.getMoney());
//
//		System.out.println("Học sinh thứ nhất lấy 50K đi mua bim bim");
//		sum -= 50;
//		Student.setMoney(sum);
//		System.out.println("Quỹ cònlại: " + Student.getMoney());
		
		
		
//		Student student1 = new Student(1, "Thắng");
//		Student student2 = new Student(1, "Huy");
//		Student student3 = new Student(1, "Loan");
		
//Question6:
		Student st1 = new SecondaryStudent(1,"Thắng");
		Student st2 = new SecondaryStudent(2,"Loan");
		
		Student st3 = new PrimaryStudent(3, "Huy");
		Student st4 = new PrimaryStudent(4, "Thái");
		Student st5 = new PrimaryStudent(5, "Phương");
		Student st6 = new PrimaryStudent(6, "Hà");
		Student st7 = new PrimaryStudent(6, "Hà");
		Student st8 = new PrimaryStudent(6, "Hà");
	}  
}