import java.util.ArrayList;
import java.util.Scanner;

public class ListAccount {
	Scanner sc = new Scanner(System.in);
	ArrayList<Account> AccountList = new ArrayList<Account>();

	public void nhapAccounts() {
		int n;
		System.out.println("Nhập vào số lượng account cần nhập: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập account thứ: " + (i + 1));
			Account account = new Account();
			account.nhapAccount();
			AccountList.add(account);
		}

	}

	public void hienAccounts() {
		System.out.println("danh sách account");
		for (Account account : AccountList) {
			System.out.println("thông tin account thứ: " + (AccountList.indexOf(account) + 1));
			account.hienAccount();
		}
	}
	
	public void timNV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào nhân viên cần tìm: ");
		String name = sc.nextLine();
		for(int i = 0; i < AccountList.size(); i++) {
			if(AccountList.get(i).getFullName().equals(name)) {
				System.out.println("Có nhân viên:" + AccountList.get(i).getFullName());				
			}else {
				System.out.println("Không có nhân viên nào");
			}
		}
	}
}
