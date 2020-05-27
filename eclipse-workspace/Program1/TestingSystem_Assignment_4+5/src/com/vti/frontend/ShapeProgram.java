package com.vti.frontend;

import com.vti.entity.Polymorphism.HinhChuNhat;
import com.vti.entity.Polymorphism.HinhVuong;

public class ShapeProgram {
   public static void main(String[] args) {
	   HinhChuNhat hcn = new HinhChuNhat();
	   System.out.println(hcn.chuVi(2, 3));
	   HinhChuNhat hv = new HinhVuong();
	   System.out.println(hv.chuVi(1, 1));
}
    
}
