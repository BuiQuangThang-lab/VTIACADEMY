package com.vti.entity.Polymorphism;

public class DienThoaiCoDien extends DienThoaiDiDong {

	@Override
	public void tanCongKeDich() {
		System.out.println("Điện thoại cổ điểm ném kẻ địch.....");
	}
	
	public void ngheRadio() {
		System.out.println("Điện thoại cổ điển nghe radio..........");
	}

}
