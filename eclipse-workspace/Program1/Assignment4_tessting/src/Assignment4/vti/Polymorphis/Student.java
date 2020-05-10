package Assignment4.vti.Polymorphis;

public class Student implements IStudent {
   int id;
   String name;
   int group;
   
   
public Student(int id, String name, int group) {
	super();
	this.id = id;
	this.name = name;
	this.group = group;
}
@Override
public void Diem_Danh() {
	System.out.println(name + " điểm danh");
	
}
@Override
public void Hoc_Bai() {
	System.out.println(name +" học bài....");
	
}
@Override
public void Don_Ve_Sinh() {
	System.out.println(name+" dọn vệ sinh...");
	
}
}
