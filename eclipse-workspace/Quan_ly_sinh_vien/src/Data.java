
import java.util.Timer;

public class Data {
	public static void main(String[] args) {
		
		// Create KHOA
		Khoa khoa1 = new Khoa();
		khoa1.maKhoa = 1;
		khoa1.ten = "Cong nghe thông tin";
		khoa1.vanPhongKhoa = "C2-102";
		khoa1.sđt = "0986613692";
		
		Khoa khoa2 = new Khoa();
		khoa2.maKhoa = 2;
		khoa2.ten = "Cong nghe thông tin";
		khoa2.vanPhongKhoa = "C2-302";
		khoa2.sđt = "0986613692";
		
		Khoa khoa3 = new Khoa();
		khoa3.maKhoa = 3;
		khoa3.ten = "Cong nghe thông tin";
		khoa3.vanPhongKhoa = "C1-112";
		khoa3.sđt = "0986613692";
		
		//Create GiangVien
	    GiangVien giangVien1 = new GiangVien();
	    giangVien1.maGv = 1;
	    giangVien1.ho_ten = "Ngô Thế Huy";
	    giangVien1.queQuan = "Thái Bình";
	    giangVien1.bacHam = BacHam.thac_si;
	    giangVien1.chucVu = "phó khoa";
	    giangVien1.khoa = khoa1;
	    giangVien1.sđt = "0382451818";
	    
	    GiangVien giangVien2 = new GiangVien();
	    giangVien2.maGv = 2;
	    giangVien2.ho_ten = "Bui Quang Duy";
	    giangVien2.queQuan = "Hà Tây";
	    giangVien2.bacHam = BacHam.pho_giao_sư_ts;
	    giangVien2.chucVu = "trưởng khoa";
	    giangVien2.khoa = khoa2;
	    giangVien2.sđt = "0383228181";
	    
	    GiangVien giangVien3 = new GiangVien();
	    giangVien3.maGv = 3;
	    giangVien3.ho_ten = "Nguyễn Viết Cảnh";
	    giangVien3.queQuan = "Nghệ An";
	    giangVien3.bacHam = BacHam.thac_si;
	    giangVien3.chucVu = null;
	    giangVien3.khoa = khoa2;
	    giangVien3.sđt = "0972334373";
	    
	    GiangVien giangVien4 = new GiangVien();
	    giangVien4.maGv = 4;
	    giangVien4.ho_ten = "Dương Thị Ánh";
	    giangVien4.queQuan = "Hải Dương";
	    giangVien4.bacHam = BacHam.thac_si;
	    giangVien4.chucVu = "Phó hiệu trưởng";
	    giangVien4.khoa = khoa3;
	    giangVien4.sđt = "0976222334";
		
		// Create LOP
	    Lop lop1 = new Lop();
	    lop1.maLop = 1;
	    lop1.ten = "Java";
	    lop1.giangVien = giangVien1;
	    lop1.phongHoc = "D5-222";
	    lop1.thoiGian = new Timer("09:30:00");
	    
	    Lop lop2 = new Lop();
	    lop2.maLop = 2;
	    lop2.ten = "C++";
	    lop2.giangVien = giangVien2;
	    lop2.phongHoc = "D5-121";
	    lop2.thoiGian = new Timer("13:00:00");
	    
	    Lop lop3 = new Lop();
	    lop3.maLop = 3;
	    lop3.ten = "SQL";
	    lop3.giangVien = giangVien2;
	    lop3.phongHoc = "D5-101";
	    lop3.thoiGian = new Timer("15:00:00");
	    
		//Create SINH VIEN
	    SinhVien sinhVien1 = new SinhVien();
	    sinhVien1.maSinhVien = 1;
	    sinhVien1.ho_ten = "Ngô Việt Anh";
	    sinhVien1.nam_vao_truong = 2016;
	    sinhVien1.khoa = khoa1;
	    sinhVien1.gioiTinh = GioiTinh.Nữ;
	    sinhVien1.khóa = "K61";
	    sinhVien1.email = "Vietanh22@gmail.com";
	    sinhVien1.sđt = "093348455";
	    
	    SinhVien sinhVien2 = new SinhVien();
	    sinhVien2.maSinhVien = 2;
	    sinhVien2.ho_ten = "Hà Anh Tuấn";
	    sinhVien2.nam_vao_truong = 2016;
	    sinhVien2.khoa = khoa1;
	    sinhVien2.gioiTinh = GioiTinh.Nam;
	    sinhVien2.khóa = "K61";
	    sinhVien2.email = "anhtuan23@gamil.com";
	    sinhVien2.sđt = "09334344566";
	    
	    SinhVien sinhVien3 = new SinhVien();
	    sinhVien3.maSinhVien = 3;
	    sinhVien3.ho_ten = "Bùi Tùng Dương";
	    sinhVien3.nam_vao_truong = 2015;
	    sinhVien3.khoa = khoa2;
	    sinhVien3.gioiTinh = GioiTinh.Nam;
	    sinhVien3.khóa = "K60";
	    sinhVien3.email = "tungduong@gmail.com";
	    sinhVien3.sđt = "088052455";
	    
	    SinhVien sinhVien4 = new SinhVien();
	    sinhVien4.maSinhVien = 4;
	    sinhVien4.ho_ten = "Nguyễn Huy Hoang";
	    sinhVien4.nam_vao_truong = 2016;
	    sinhVien4.khoa = khoa2;
	    sinhVien4.gioiTinh = GioiTinh.Nam;
	    sinhVien4.khóa = "K61";
	    sinhVien4.email = "hoang2212@gmail.com";
	    sinhVien4.sđt = "093467455";
	    
	    SinhVien sinhVien5 = new SinhVien();
	    sinhVien5.maSinhVien = 5;
	    sinhVien5.ho_ten = "Trần Đăng Huy";
	    sinhVien5.nam_vao_truong = 2017;
	    sinhVien5.khoa = khoa1;
	    sinhVien5.gioiTinh = GioiTinh.Nam;
	    sinhVien5.khóa = "K62";
	    sinhVien5.email = "huyaw12@gmail.com";
	    sinhVien5.sđt = "0933123455";
	    
	    SinhVien sinhVien6 = new SinhVien();
	    sinhVien6.maSinhVien = 6;
	    sinhVien6.ho_ten = "Phạm Tú Anh";
	    sinhVien6.nam_vao_truong = 2015;
	    sinhVien6.khoa = khoa3;
	    sinhVien6.gioiTinh = GioiTinh.Nữ;
	    sinhVien6.khóa = "K59";
	    sinhVien6.email = "tuanh@gmail.com";
	    sinhVien6.sđt = "0933456678";
	    
	    SinhVien sinhVien7 = new SinhVien();
	    sinhVien7.maSinhVien = 7;
	    sinhVien7.ho_ten = "Phạm Anh Khoa";
	    sinhVien7.nam_vao_truong = 2016;
	    sinhVien7.khoa = khoa1;
	    sinhVien7.gioiTinh = GioiTinh.Nam;
	    sinhVien7.khóa = "K61";
	    sinhVien7.email = "Khoa22@gmail.com";
	    sinhVien7.sđt = "033348455";
	    
	    SinhVien sinhVien8 = new SinhVien();
	    sinhVien8.maSinhVien = 8;
	    sinhVien8.ho_ten = "Trần Thu Thảo";
	    sinhVien8.nam_vao_truong = 2016;
	    sinhVien8.khoa = khoa1;
	    sinhVien8.gioiTinh = GioiTinh.Nữ;
	    sinhVien8.khóa = "K61";
	    sinhVien8.email = "thao22@gmail.com";
	    sinhVien8.sđt = "085493255";
	    
	    
	    
	}
}
