package Assigment4.vti.bookManager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Book book = new Book();
		Document document = new Document();
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			document.NhapThongTin();
			break;
		case 2:
			document.HienThiThongTin();
			break;
		case 3:
			document.timTaiLieu();
			break;
		}

	}

}
