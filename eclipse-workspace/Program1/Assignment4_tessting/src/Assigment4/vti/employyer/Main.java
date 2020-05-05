package Assigment4.vti.employyer;

public class Main {
	public static void main(String[] args) {
		
		Student student1 = new Student("Thắng", "Thái Bình");
		Student student2 = new Student("Hoa", "Nam Định");
		Student student3 = new Student("Duy", "Hà Nội");
		Student student4 = new Student("Loan", "Ninh Bình");
		Student student5 = new Student("Huy", "Thái Bình");
		
		System.out.print(student1.getName() + ", " + student1.getHometown() + ": " );
		student1.setgPA(3.5);
		System.out.print(student2.getName() + ", " + student2.getHometown() + ": " );
		student1.setgPA(4.5);
		System.out.print(student3.getName() + ", " + student3.getHometown() + ": " );
		student1.setgPA(6.5);
		System.out.print(student4.getName() + ", " + student4.getHometown() + ": " );
		student1.setgPA(8.5);
		System.out.print(student5.getName() + ", " + student5.getHometown() + ": " );
		student1.setgPA(7.5);
	}
}
