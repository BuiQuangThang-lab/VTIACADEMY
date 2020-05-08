package Assignment4.vti.abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class VN_Phone extends Phone {
	 private String number;
	 private String name;
	 
     public void dauSo() {  
    	 System.out.println("84");
     }
     
     public void tenDichVu() {
    	 System.out.println("Viettle, Vinaphone, VNmobie....");
     }
     
     public void insert_VNPhone(){
    	 super.insertPhone();
		 System.out.println("Thêm số điện thoại");
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập vào họ và tên: ");
			name = sc.nextLine();
			System.out.println("Nhập vào số điện thoại: ");
			number = sc.nextLine();
			numberPhone = new ArrayList<Phone>();
			VN_Phone p = new VN_Phone(); 
			numberPhone.add(p);
	 }
     
     public void update_VNPhone() {
    	 super.updatePhone();
     }
}
