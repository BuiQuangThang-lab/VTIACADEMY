package Assignment4.vti.Polymorphism.HinhHoc;

public class HinhChuNhat implements TinhToan {
    
	private int chieuDai;
	private int chieuRong;
	
	public HinhChuNhat() {}
	
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
	public int dienTich() {
		// TODO Auto-generated method stub
		return chieuDai * chieuRong;
	}

	@Override
	public int chuVi() {
		// TODO Auto-generated method stub
		return  chieuDai + chieuRong;
	}
    
	
     
}
