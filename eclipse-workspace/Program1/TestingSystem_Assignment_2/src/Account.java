import java.util.Scanner;

public class Account {
    private int id;
    private String name;
    private String email;
    private Group[] groups;
    private Department department;
    
    public Account() {}

	public Account(int id, String name, String email, Group[] groups, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.groups = groups;
		this.department = department;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	};
	
    
}
