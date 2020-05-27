package Final;

public class Student {
	private final int id;
	String name;

	public Student() {
		id = 1;
	}

	public static void main(String[] args) {
		Student st = new Student();
		st.id = 2;
		st.name = "Thang";
		st.name = "Huy";
		System.out.println(st.name);
	}
}