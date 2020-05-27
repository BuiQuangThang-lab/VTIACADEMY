package com.vti.entity.Polymorphism;

public class HinhChuNhat implements TinhToan {
	private int chieuDai;
	private int chieuRong;

	public HinhChuNhat() {
	};

	public HinhChuNhat(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	@Override
	public int chuVi(int chieuDai, int chieuRong) {
		System.out.println("Chu vi hình chữ nhật: ");
		return 2 * (chieuDai + chieuRong);
	}

	@Override
	public int dienTich(int chieuDai, int chieuRong) {
		System.out.println("Diện tích hình chữ nhật: ");
		return chieuDai * chieuRong;
	}
}
