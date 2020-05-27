package Static;

import java.util.ArrayList;

public class Program {
public static void main(String[] args) {
	ArrayList<Student> arrST = new ArrayList();
	Student st1 = new Student(1, "Nguyễn Văn A");
	Student st2 = new Student(2, "Nguyễn Văn B");
	Student st3 = new Student(3, "Nguyễn Văn C");	
	arrST.add(st1);
	arrST.add(st2);
	arrST.add(st3);
	for(Student students : arrST) {
		System.out.println(students.getCollege());
	}
	for(Student student : arrST) {
		student.setCollege("Đại học Thủy Lợi");
		System.out.println(student.getCollege());
	}
	
	

}
    
   
}
