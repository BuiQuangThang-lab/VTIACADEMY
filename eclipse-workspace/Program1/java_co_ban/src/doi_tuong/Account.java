package doi_tuong;

public class Account {
	private int id;
	private String name;
	private int age;
	// Goi doi tuong Group trong Acount
	private Group group;

	// Constructor
	public Account() {
		
	}
	


	public Account(int id, String name, int age, Group group) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.group = group;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public Group getGroup() {
		return group;
	}



	public void setGroup(Group group) {
		this.group = group;
	}



}
