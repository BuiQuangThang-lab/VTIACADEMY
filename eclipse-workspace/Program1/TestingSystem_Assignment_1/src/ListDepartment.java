import java.util.ArrayList;
import java.util.Scanner;

public class ListDepartment {
	Scanner sc = new Scanner(System.in);
	public ArrayList<Department> ListDepartment = new ArrayList<Department>();

	public void Nhap() {
		int n;
		System.out.println("Nhập vào số department cần thêm: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào department thứ " + (i + 1));
			Department department = new Department();
			department.nhapDepartment();
			ListDepartment.add(department);
		}
	}

	public void HienThi() {
		System.out.println("Danh sách Department");
		for (Department department : ListDepartment) {
			System.out.println("Department thứ " + ListDepartment.indexOf(department));
			department.hienDepartment();
		}
	}
}
