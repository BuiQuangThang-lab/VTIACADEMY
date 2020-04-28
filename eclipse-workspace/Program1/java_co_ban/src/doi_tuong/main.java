package doi_tuong;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

  //Question 8, 9;

public class main {
	
	
	public static void accountDesign() {
		List<Account> listAccount = new ArrayList<Account>();
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Vui lòng nhập vào thông tin: ");

		// nhap thong tin doi tuong
		Account account = new Account();
		System.out.println("Vui lòng nhập vào ID: ");
		account.setId(scan1.nextInt());
		System.out.println("Vui lòng nhập vào tuoi: ");
		account.setAge(scan1.nextInt());
		// Doi tuong Scan can phan biet kieu du lieu Int va String
		scan1.nextLine();
		System.out.println("Vui lòng nhập vào ten: ");
		account.setName(scan1.nextLine());

		Group group = new Group();
		System.out.println("Vui lòng nhập vào Group ID: ");
		group.setId(scan1.nextInt());
		scan1.nextLine(); // phan biet int va String trong bien scan1  
		System.out.println("Vui lòng nhập vào Group Name: ");
		group.setGroupName(scan1.nextLine());
		// add Group vao Account:
		
		account.setGroup(group);

		System.out.println("Thong tin nguoi dung: ");
		// Luu thong tin doi tuong vao ArrayList
		listAccount.add(account);
		for (Account acc : listAccount) {
			System.out.println(acc.getId() + " " + acc.getName() + " " + acc.getAge() + " " + acc.getGroup().getGroupName());
	    }
	}
	public static void groupDesign() {
		    List<Group> listGroup = new ArrayList<Group>();
		    Scanner scan2 = new Scanner(System.in);
			System.out.println("Vui lòng nhập vào thông tin: ");
			Group group = new Group();
			System.out.println("Vui lòng nhập vào id: ");
			group.setId(scan2.nextInt());
			System.out.println("Vui lòng nhập vào tên GroupName: ");
			group.setGroupName(scan2.nextLine());
						
			Account account1 = new Account();
			System.out.println("Vui lòng nhập vào ID: ");
			account1.setId(scan2.nextInt());
			System.out.println("Vui lòng nhập vào tuoi: ");
			account1.setAge(scan2.nextInt());
			scan2.nextLine();
			System.out.println("Vui lòng nhập vào ten: ");
			account1.setName(scan2.nextLine());
			
			group.setAccount(account1);
			System.out.println("Thông tin Group: ");
			listGroup.add(group);
			for(Group gr : listGroup ) {
				System.out.println(gr.getId() + " " + gr.getGroupName() + " " + gr.getAccount().getName());
			}
	}
    public static void addGroup() {
    	List<Account> listAccount = new ArrayList<Account>();
    	List<Group> listGroup = new ArrayList<Group>();
    	Scanner scan3 = new Scanner(System.in);
    	System.out.println("Mời nhập vào group cần thêm account: ");
    	System.out.println("Vui lòng nhập vào id: ");
    	int i = scan3.nextInt();
    	groupDesign();
		}
    // Question 11:
    
    private static Random random = new Random();
	public static void rundomAddAccountInGroup(List<Group>listGroup) {
		int randomGroup = (int) (Math.random() * listGroup.size());
		System.out.println("Random Group: " + listGroup.get(randomGroup));
		addGroup();
		
	}
	
	// Question 10:
	
	public static void main(String[] args) {
		
		Scanner scan0 = new Scanner(System.in);
		System.out.print("Nhập vào mã: ");
		int j = scan0.nextInt();
        switch(j) {        
        case 1:
        	accountDesign();
        	break;
        case 2:
        	groupDesign();
        	break;
        case 3:
        	addGroup();
        	break;
        	
        }  
		
	}
	private static void a(String string) {
		Scanner scan0 = new Scanner(System.in);
	    System.out.println("Bạn có muốn thực hiện chức năng khác không: ");
	    String a = scan0.next();
	    if(a == "Có") {
	    	main(null);
	    }
		if(a == "Không") {
			return ;
		}
	}	
    
	
}
