import java.util.Scanner;

public class Department {
	private int departmentID;
	private String departmentName;

	public Department(int departmentID, String departmentName) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}

	public Department() {
	};

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void nhapDepartment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin Department");
		System.out.println("Nhập id department: ");
		setDepartmentID(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập tên department: ");
		setDepartmentName(sc.nextLine());

	}

	public void hienDepartment() {
		System.out.println("Department ID: " + getDepartmentID());
		System.out.println("Department name: " + getDepartmentName());
	}

}
