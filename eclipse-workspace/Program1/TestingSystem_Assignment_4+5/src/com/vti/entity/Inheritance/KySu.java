package com.vti.entity.Inheritance;

import java.util.Scanner;

public class KySu extends CanBo {
     private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
     
     public void nhap() {
    	 super.nhap();
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Nhập vào ngành đào tạo: ");
    	 setNganhDaoTao(sc.nextLine());
     }
     
     public void hien() {
    	 super.hien();
    	 System.out.println("Ngành đào tạo của Kỹ sư: " + getNganhDaoTao());
     }
}
