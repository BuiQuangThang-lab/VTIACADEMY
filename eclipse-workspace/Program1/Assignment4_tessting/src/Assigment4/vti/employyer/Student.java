package Assigment4.vti.employyer;

public class Student {
   private int id;
   private String name;
   private String hometown;
   private double gPA;
   
   
public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getHometown() {
	return hometown;
}


public void setHometown(String hometown) {
	this.hometown = hometown;
}


public double getgPA() {
	return gPA;
}


public void setgPA(double gPA) {
	if(gPA < 4.0) {
		System.out.println("Yếu");
	}
	else if(gPA < 6.0) {
		System.out.println("Trung bình");
	}else if(gPA < 8.0) {
		System.out.println("Khá");
	}else {
		System.out.println("Giỏi");
	}
}


public Student(String name, String hometown) {
	super();
	this.name = name;
	this.hometown = hometown;
	
}
   

}
