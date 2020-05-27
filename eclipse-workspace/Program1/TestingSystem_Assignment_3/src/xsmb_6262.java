import java.util.Random;
import java.util.Scanner;

public class xsmb_6262 {
	public static void main(String[] args) {

		System.out.println(java.time.LocalDateTime.now());
		Scanner scan = new Scanner(System.in);

		System.out.println("Bạn đánh con gì? ");
		System.out.println("Nhập vào con đánh: ");
		int a1 = scan.nextInt();
		System.out.println("Nhập vào số tiền: ");
		int a2 = scan.nextInt();

		Random rd = new Random();
		int dacBiet = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiNhat = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiNhi = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiBa = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiTu = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiNam = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau1 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau2 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau3 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau4 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau5 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau6 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau7 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau8 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau9 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau10 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau11 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau12 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau13 = (int) Math.floor((Math.random() * 899999) + 100000);
		int giaiSau14 = (int) Math.floor((Math.random() * 899999) + 100000);

		System.out.println("Kết quả đề là: " + (dacBiet % 100));
		int[] kq_no = {dacBiet % 100, giaiNhat % 100, giaiNhi % 100, giaiBa % 100, giaiBa % 100, giaiTu % 100,
				giaiNam % 100, giaiSau1 % 100,giaiSau2 % 100,giaiSau3 % 100,giaiSau4 % 100,giaiSau5 % 100,giaiSau6 % 100,giaiSau7 % 100,giaiSau8 % 100,giaiSau9 % 100,giaiSau10 % 100,giaiSau11 % 100,giaiSau12 % 100,giaiSau13 % 100,giaiSau14 % 100 };

		for (int i = 0; i < kq_no.length; i++) {
			System.out.println("Kết quả Nô là: " + kq_no[i]);

		}

		if (a1 == dacBiet % 1000) {
			System.out.println("Bạn đã trúng đề");
			System.out.println("Số tiền bạn trúng là: " + a2 * 80);
		} else {
			System.out.println("Bạn không trúng đề!");
		}

		int count1 = 0;

		for (int i = 0; i < kq_no.length; i++) {
			if (a1 == kq_no[i]) {
				System.out.println("Bạn đã trúng Nô");
				System.out.println("Trúng con: " + kq_no[i]);
				count1++;
			}
		}
		if (count1 == 0) {
			System.out.println("Bạn không trúng nô!");
		}
		System.out.println("Số tiền bạn trúng là: " + (int) Math.ceil((float) a2 / 23 * 80 * count1));
	}
}
