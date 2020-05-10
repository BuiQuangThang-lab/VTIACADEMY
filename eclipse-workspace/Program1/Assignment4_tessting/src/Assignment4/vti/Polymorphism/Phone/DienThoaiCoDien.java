package Assignment4.vti.Polymorphism.Phone;

public class DienThoaiCoDien extends DienThoaiDiDong implements ChucNangCoDien {


	@Override
	public void tanCongKeDich() {
		System.out.println("Điện thoại cổ điển tấn công kẻ địch.....");
		
	}

	@Override
	public void ngheDaiRadio() {
		System.out.println("Điện thoại cổ điển nghe Radio.....");
		
	}

}
