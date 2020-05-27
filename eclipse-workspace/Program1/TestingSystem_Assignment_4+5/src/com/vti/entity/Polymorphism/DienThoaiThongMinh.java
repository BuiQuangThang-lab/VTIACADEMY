package com.vti.entity.Polymorphism;

public class DienThoaiThongMinh extends DienThoaiDiDong {

	@Override
	public void tanCongKeDich() {
		System.out.println("Điện thoại thông minh ném kẻ địch.....");
		
	}
	
	public void suDung3G() {
		System.out.println("Điện thoại thông minh sử dụng 3G.........");
	}
	
	public void chupAnh() {
		System.out.println("Điện thoại thông minh chụp ảnh..........");
	}

}
