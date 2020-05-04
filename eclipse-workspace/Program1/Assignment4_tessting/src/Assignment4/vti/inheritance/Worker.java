package Assignment4.vti.inheritance;

import java.util.Scanner;

public class Worker extends Person {
    private int bac;

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
	
	public Worker() {
		super();
	}

	public Worker(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.bac = bac;
	}
	
    @Override 
	
    public void NhapThongTin() {
    	super.NhapThongTin();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhập cấp bậc: ");
    	bac = sc.nextInt();
    } 
    
    public void HienThiThongTin() {
    	super.HienThiThongTin();
    	System.out.println("\n Cấp bậc: " + bac);
    }
    
    public void nhapNhanVienCanTim() {
    	super.nhapNhanVienCanTim();
    }
    public void timNhanVienTheoTen() {
    	super.timNhanVienTheoTen();
    }
    
    
}
