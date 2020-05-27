import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Flow_Control {
	public static void main(String[] args) {
		Department department1 = new Department(1, "Sale");

		Group gr1 = new Group(1, "Java");
		Group gr2 = new Group(2, "C##");
		Group gr3 = new Group(3, "SQL");

		Account acc1 = new Account(1, "Bùi Quang Thắng", "thang.bq163817@sis.vn", new Group[] { gr1, gr2 },
				department1);
		Account acc2 = new Account(2, "Đinh Thị Tâmm", "tam123@gmail.com", new Group[] { gr1 }, department1);
		Account acc3 = new Account(3, "Đinh Hải Long", "long.234@gmail.com", new Group[] {}, department1);
		Account acc4 = new Account(4, "Trương Thị Hương", "huong998@gmail.com", new Group[] { gr3 }, department1);
		Account acc5 = new Account(5, "Trần Thị Thanh Nhàn", "nhan223@gmail.com", new Group[] { gr1, gr2, gr3 },
				department1);

		gr1.setCreator(acc1);
		gr2.setCreator(acc2);
		gr3.setCreator(acc3);
		
//		System.out.println(gr1.getCreator().getName());
//		System.out.println(acc1.getName() + " " + acc1.getDepartment().getName());
//		Group[] gr = acc1.getGroups();
//		for (Group group : gr) {
//			System.out.println(group.getName());
//		}
		
		//Question1:
		
//		if(acc2.getDepartment() == null) {
//			System.out.println(acc2.getName() + " không có phòng ban");
//		}else {
//			System.out.println(acc2.getName() + " có phòng ban là: " + acc2.getDepartment().getName());
//		}
		
//		//Question2:
//		
//		if(acc5.getGroups() == null) {
//			System.out.println(acc5.getName() + " Không có group");
//		}else if(acc5.getGroups().length <= 2) {
//			System.out.println(acc5.getName() + " có Group: ");
//			Group[] gr = acc5.getGroups();
//			for (Group group : gr) {
//				System.out.println(group.getName());
//			}
//		}else if(acc5.getGroups().length == 3) {
//			System.out.println("Nhân viên là người quan trọng");
//		}else {
//			System.out.println("Nhân viên này hóng chuyện");
//		}
		
		
	    //-------------------------------TERNARY------------------------------------------------//
		
//		//Question3: ternary:
//		
//		String a = (acc2.getDepartment() == null) ? "Không có phòng ban" : acc2.getName() + " có phòng ban là: " + acc2.getDepartment().getName();
//        System.out.println(a);
		
//		//Question4: 
//		
//		String b = (acc1.getDepartment().getName().equals("Sale")) ? acc1.getName()+" Là nhân viên phòng sale" :  acc1.getName() + " Không là nhân viên phòng sale";
//		System.out.println(b);
		
		//--------------------------------------- switch_case:----------------------------------------------
		
		// Question5:
		
//		int a = acc1.getGroups().length;
//		switch (a) {
//		case 1:
//			System.out.println(acc1.getName() + "  thuộc 1 phòng ban");
//			break;
//		case 2:
//			System.out.println(acc1.getName() + " thuộc 2 phòng ban");
//			break;
//		case 3:
//			System.out.println(acc1.getName() + " thuộc 3 phòng ban");
//			break;
//		}

		// Question6:

//		String a = acc1.getDepartment().getName();
//
//		switch (a) {
//		case "sale":
//			System.out.println("Nhân viên thuộc phòng sale");
//			break;
//
//		default:
//			System.out.println("Nhân viên không thuộc phòng ban");
//		}
		
	 //-----------------------FOREACH---------------------------------------------// 
		
		//Question8:
		
		Account[] accounts =  {acc1,acc2,acc3,acc4,acc5};

//		for (Account account : accounts) {
//			System.out.println(account.getName() + " " + account.getEmail() + " " + account.getDepartment().getName());
//		}
		
//		//Question9:
//		
//		Group[] groups = new Group[3];
//		groups[0] = gr1;
//		groups[1] = gr2;
//		groups[2] = gr3;
//		
//		for (Group group : groups) {
//			System.out.println(group.getId() + " " + group.getName());
//		}
		
		//----------------------FOR----------------------------------//
		
		//Question10:
		
//	for(int i = 0; i < accounts.length; i++) {
//		
//		if(i == 1) {
//			continue;
//		}
//			System.out.println("Thông tin account thứ " + (i+1));
//			System.out.println("Name " +accounts[i].getName());
//			System.out.println("Email "+accounts[i].getEmail());
//			System.out.println("Phòng ban " + accounts[i].getDepartment().getName());
//			System.out.println("                                                ");
//		}
		
		
		
		
	}

}
