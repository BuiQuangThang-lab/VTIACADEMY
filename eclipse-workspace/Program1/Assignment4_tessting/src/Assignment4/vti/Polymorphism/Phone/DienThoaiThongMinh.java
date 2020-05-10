package Assignment4.vti.Polymorphism.Phone;

public class DienThoaiThongMinh extends DienThoaiDiDong implements ChucNangThongMinh {


	@Override
	public void tanCongKeDich() {
		System.out.println("Điện thoại thông minh tấn công kẻ địch.....");
		
	}

	@Override
	public void suDung3G() {
		System.out.println("Điện thoại thông minh dùng 3G.....");
		
	}

	@Override
	public void chupHinh() {
		System.out.println("Điện thoại thông minh chụp ảnh.....");
		
	}
     
}
