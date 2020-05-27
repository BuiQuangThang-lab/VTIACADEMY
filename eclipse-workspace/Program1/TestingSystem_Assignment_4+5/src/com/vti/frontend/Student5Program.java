package com.vti.frontend;

import com.vti.entity.Inheritance.HighSchoolStudent;

public class Student5Program {
    public static void main(String[] args) {
		HighSchoolStudent hs = new HighSchoolStudent("Nam", 1, "12A1", "Đại học công nghệ");
		System.out.println(hs.getName() + " " + hs.getDesiredUniversity());
	}
}
