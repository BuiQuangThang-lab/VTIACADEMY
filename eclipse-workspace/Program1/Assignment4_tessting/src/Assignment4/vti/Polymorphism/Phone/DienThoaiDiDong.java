package Assignment4.vti.Polymorphism.Phone;

public abstract class DienThoaiDiDong implements VuKhi {
	public void nghe() {
		System.out.println("Nghe điện thoại....");
	}
	public void goi() {
		System.out.println("Gọi điện thoại....");
	}
	public void guiTinNhan() {
		System.out.println("Gửi tin nhắn....");
	}
	public void nhanTinNhan() {
		System.out.println("Nhận tin nhắn");
	}
}
