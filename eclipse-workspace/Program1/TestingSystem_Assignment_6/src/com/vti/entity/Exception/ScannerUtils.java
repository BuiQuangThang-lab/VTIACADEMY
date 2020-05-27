package com.vti.entity.Exception;

import java.util.Scanner;

public class ScannerUtils {

	public static int inputInt(String errorMessege) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				return Integer.parseInt(sc.nextLine());

			} catch (Exception e) {
				System.out.println(errorMessege);
			}
		}
	}

	public static String inputString(String errorMessege) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			input = input.trim();
			if (input.isEmpty()) {
				System.out.println(errorMessege);
				continue;
			} else {

				return input;

			}
		}
	}
}
