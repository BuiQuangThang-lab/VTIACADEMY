package Assignment4.vti.Polymorphism.HinhHoc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   int canh;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Nhập cạnh hình vuông: ");
	   canh = sc.nextInt();
	   HinhVuong hv = new HinhVuong(canh);
	   System.out.println("Diện tích hình vuông: " + hv.chuVi());
	   
	   System.out.println("Nhập vào chiều dài: ");
	   int a = sc.nextInt();
	   System.out.println("Nhập vào chiều rộng: ");
	   int b = sc.nextInt();
	   HinhChuNhat hcn = new HinhChuNhat(a,b);
	   System.out.println("Diện tích hình chữ nhật là: " + hcn.dienTich());
	    
	    

	}

}
