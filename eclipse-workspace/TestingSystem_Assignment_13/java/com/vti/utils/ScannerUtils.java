package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner scanner = new Scanner(System.in);
	/**
	 * This class is Int Scanner.  
	 * 
	 * @Description: .
	 * @author: Thang
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: thang
	 * @modifer_date: May 31, 2020
	 */
	public static int inputInt(String errorMessage) {
		while(true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			}catch(Exception e) {
				System.err.println(errorMessage);
			}
		}
	}
	/**
	 * This class is float Scanner.  
	 * 
	 * @Description: .
	 * @author: Thang
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: thang
	 * @modifer_date: May 31, 2020
	 */
	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}
	/**
	 * This class is double Scanner.  
	 * 
	 * @Description: .
	 * @author: Thang
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: thang
	 * @modifer_date: May 31, 2020
	 */
	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}
	/**
	 * This class is String Scanner.  
	 * 
	 * @Description: .
	 * @author: Thang
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: thang
	 * @modifer_date: May 31, 2020
	 */
	public static String inputString(String errorMessage) {
		while(true) {
			String input = scanner.nextLine().trim();
			if(!input.isEmpty()) {
				return input;
			}else {
				System.out.println(errorMessage);
			}
		}
	}
	
	public static int inputId() {
		while(true) {
			int id = inputInt("Please input a id as int, please input again.");
			if(id > 0) {
				return id;
			}else {
				System.out.println("Please input a id as int which must be greater than > 0, please input again.");
			}
		}
	}
	
	public static String inputName() {
		return inputString("Please input a name, please input again.");
	}
	
	public static int inputInt() {
		return inputInt("Please input a number as int, please input again");
	}
}
