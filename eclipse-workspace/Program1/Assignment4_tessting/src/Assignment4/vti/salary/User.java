package Assignment4.vti.salary;

import java.util.ArrayList;
import java.util.Scanner;

import Assignment4.vti.abstraction.Phone;

public class User {
	private String name;
	private double salary;

	public static ArrayList<User> arrUser;

	public User() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static ArrayList<User> getArrUser() {
		return arrUser;
	}

	public static void setArrUser(ArrayList<User> arrUser) {
		User.arrUser = arrUser;
	}

	public User(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	public void Nhap() {
		System.out.println("Nhập thông tin");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên: ");
		name = sc.nextLine();
		System.out.println("Nhập vào salary: ");
		salary = sc.nextDouble();
		arrUser = new ArrayList<User>();
		User u = new User(name, salary);
		
	}
	
	public void Tra() {
		for(int i = 0; i < arrUser.size(); i++) {
			System.out.println(arrUser.get(i));
		}
	}
	
	

}
