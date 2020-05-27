import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		ListAccount listAccount = new ListAccount();
		ListDepartment listDepartment = new ListDepartment();
		ListGroup listGroup = new ListGroup();
		int chon;
		Scanner sc = new Scanner(System.in);
		do {
			menu();
			chon = sc.nextInt();
			switch(chon) {
			case 1: 
				System.out.println("Tạo Account");
				listAccount.nhapAccounts();
				listAccount.hienAccounts();
				break;
			case 2:
				System.out.println("Tạo Department");
				listDepartment.Nhap();
				listDepartment.HienThi();
				break;
			case 3:
				System.out.println("Tạo Group");
				listGroup.Nhap();
				listGroup.HienThi();
				break;
			case 4:
				listAccount.timNV();
				break;
			}
		}while(chon!=0);
		
		
		

	}
	
	
	 public static void menu(){
	        System.out.println("=================MENU====================");
	        System.out.println("|| 1. Tạo Accounts                      ||");
	        System.out.println("|| 2. Tạo Departments                   ||");
	        System.out.println("|| 3. Tạo Groups                        ||");
	        System.out.println("|| 4. Thêm Group vào Account            ||");
	        System.out.println("|| 5. Tìm account theo tên ||");
	        System.out.println("|| 0. Thoát                             ||");
	        System.out.println("=========================================");
	        System.out.println("Bạn chọn: ");
	    }
}
