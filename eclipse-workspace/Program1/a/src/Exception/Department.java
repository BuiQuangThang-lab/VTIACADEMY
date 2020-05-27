package Exception;

public class Department {

	int id;
	String name;
	int employeeAccount;

	public Department(int id, String name, int employeeAccount) {
		super();
		this.id = id;
		this.name = name;
		this.employeeAccount = employeeAccount;
	}

	public static void getIndex(int index) {
		Department[] d = new Department[3];
		d[0] = new Department(1, "Sale", 3);
		d[1] = new Department(2, "Marketing", 4);
		d[2] = new Department(3, "Finacial", 5);
		System.out.println(d[index].employeeAccount);
	}

	public static void main(String[] args) {
		try {
			getIndex(5);
		} catch (Exception e) {
			System.out.println("Không thể tin ra");
		}

	}
}
