import java.util.ArrayList;
import java.util.Scanner;

public class ListGroup {
	Scanner sc = new Scanner(System.in);
	public Group[] groups = new Group[1000];
	int n;

	public void Nhap() {

		System.out.println("Nhập số lượng group muốn nhập: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập group thứ: " + (i + 1));
			Group group = new Group();
			group.nhapGroup();
			groups[i] = group;
		}
	}

	public void HienThi() {
		System.out.println("Danh sách group");
		for (int i = 0; i < n; i++) {
			System.out.println("Group thu " + i);
			groups[i].hienGroup();
		}
	}
}
