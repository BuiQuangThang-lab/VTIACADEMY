package Assignment4.vti.inheritance;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Worker worker = new Worker();
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			worker.NhapThongTin();
			break;
		case 2:
			worker.HienThiThongTin();
			break;
		case 3:
			worker.timNhanVienTheoTen();
			break;
		}

	}

}
