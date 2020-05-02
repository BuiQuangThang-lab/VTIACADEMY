import java.util.Random;
import java.util.Scanner;

public class Casting {
	
	//----------------------------Question1----------------------------------------//
	
	public static void salary() {
		double salary_Account_1 = 5240.5;
		double salary_Account_2 =  10970.055;
		
		int a = (int) Math.ceil(salary_Account_1);
		
		int b = (int) Math.ceil(salary_Account_2);
		
		System.out.println(a);
		System.out.println(b);
	};
	
	//-----------------------------Question2----------------------------------------//
	
	
	public static void format_number() {
		
		Random number_5 = new Random();
		int a = number_5.nextInt(99999);
		Integer i = Integer.valueOf(a);
		String format = "%1$05d";
		String result = String.format(format, i);
		System.out.println(result);
	}
	
	//-----------------------------Question3------------------------------------------//
	
	public static void lay_2so_cuoi() {
		
		// Cách 1:
		
		int a = 12345;
		String s = String.valueOf(a);
		System.out.println(s.substring(s.length()-2, s.length()));
		
		// Cách 2:
		
		int b = 32653;
		System.out.println(b%100);
	}
	
	public static void phep_chia() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên a: ");
		int a = scan.nextInt();
		System.out.println("Nhập vào số nguyên b: ");
		int b = scan.nextInt();		
		System.out.println((float) a / b);
	}
	
	
	
	
	
     public static void main(String[] args) {
		salary();
		format_number();
		lay_2so_cuoi();
		phep_chia();
	}
}
