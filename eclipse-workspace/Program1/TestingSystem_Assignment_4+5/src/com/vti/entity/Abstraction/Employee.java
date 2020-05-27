package com.vti.entity.Abstraction;

public class Employee extends User {
	
     public Employee() {
    	 super();
     }
     
     public Employee(String name, double salaryRatio) {
    	 super(name, salaryRatio);
     }
     
     @Override
     public double calculatePay() {
		return super.calculatePay() * 420;    	 
     }
     @Override
    public void nhap() {
    	 System.out.println("Nhập vào thông tin employee: ");
    	 super.nhap();
     }
     @Override
     public void hien() {
    	 System.out.println("Thông tin employee: ");
    	 super.hien();
     }
     
     
}
