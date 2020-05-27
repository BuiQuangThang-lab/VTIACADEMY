package Static;

public class Student {
	private int id;
	private String name;
	private String college = "Đại học Bách Khoa Hà Nội";
	private int budget = 0;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
