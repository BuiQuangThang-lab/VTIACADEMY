package Assignment4.vti.Polymorphis;

public class Program {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student(1,"Nguyễn Văn A",1 );
		students[1] = new Student(2,"Nguyễn Văn B",2 );
		students[2] = new Student(3,"Nguyễn Văn C",3 );
		students[3] = new Student(4,"Nguyễn Văn D",1 );
		students[4] = new Student(5,"Nguyễn Văn E",2 );	
		students[5] = new Student(6,"Nguyễn Văn F",3 );
		students[6] = new Student(7,"Nguyễn Văn G",1 );
		students[7] = new Student(8,"Nguyễn Văn H",2 );
		students[8] = new Student(9,"Nguyễn Văn I",3 );
		students[9] = new Student(10,"Nguyễn Văn K",1 );

		
		for(Student student : students) {
			if(student.group == 1 ) {
				student.Hoc_Bai();			
			}
			if(student.group == 3) {
				student.Don_Ve_Sinh();
			}
		
		}
	}

}
