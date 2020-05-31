package com.vti.fontend;

import java.sql.SQLException;

import com.vti.backend.presentationlayer.EmployeeController;
import com.vti.backend.presentationlayer.ManagerController;
import com.vti.utils.ScannerUtils;

public class ProgramUser {
	private static ManagerController managerController;
	private static EmployeeController employeeController;

	public static void main(String[] args) throws Exception {
		managerController = new ManagerController();
		employeeController = new EmployeeController();
		int choose;
		do {
			menu();
			choose = ScannerUtils.inputInt("you can input number");
			switch (choose) {
			case 1:
				System.out.println("=====Create Manager=========");
				registerManager();
				break;
			case 2:
				System.out.println("======Create Employee=======");
				registerEmployee();
				break;
			case 3:
				System.out.println("=======Login Manager========");
				ManagerLogin();
				break;
			case 4:
				System.out.println("========Login Employee======");
				EmployeeLogin();
				break;
			default:
				System.out.println("input wrong ! please input again.");
				break;
			}
		} while (choose != 5);
	}
	
	private static void menu() {
		System.out.println("============MENU===========");
		System.out.println("=|1. Create Manager    |=");
		System.out.println("=|2. Create Employee   |=");
		System.out.println("=|3. Login Manager      |=");
		System.out.println("=|4. Login Employee      |=");
		System.out.println("You choose:                ");
	}

	private static void registerManager() throws Exception {

		System.out.println("Input firstname: ");
		String firstname = ScannerUtils.inputString("Please input email as String!");

		System.out.println("Input lastname: ");
		String lastname = ScannerUtils.inputString("Please input username as String!");

		System.out.println("Input phone: ");
		int phone = ScannerUtils.inputInt("Please input phone as int!");

		System.out.println("Input full email: ");
		String email = ScannerUtils.inputString("Please input full name as String!");

		System.out.println("Input full password: ");
		String password = ScannerUtils.inputString("Please input full name as String!");

		System.out.println("Input expInYear: ");
		int expInYear = ScannerUtils.inputInt("Please input phone as int!");

		managerController.createManager(firstname, lastname, phone, email, password, expInYear);
	}

	public static void ManagerLogin() throws ClassNotFoundException, SQLException {
		System.out.println("Input full email: ");
		String email = ScannerUtils.inputString("Please input full name as String!");

		System.out.println("Input full password: ");
		String password = ScannerUtils.inputString("Please input full name as String!");
		if (managerController.isAccountExists(email, password)) {
			System.out.println("login success!");
		} else {
			System.out.println("username or password is false!");
		}
	}

	private static void registerEmployee() throws Exception {

		System.out.println("Input firstname: ");
		String firstname = ScannerUtils.inputString("Please input email as String!");

		System.out.println("Input lastname: ");
		String lastname = ScannerUtils.inputString("Please input username as String!");

		System.out.println("Input phone: ");
		int phone = ScannerUtils.inputInt("Please input phone as int!");

		System.out.println("Input full email: ");
		String email = ScannerUtils.inputString("Please input full name as String!");

		System.out.println("Input full password: ");
		String password = ScannerUtils.inputString("Please input full name as String!");

		System.out.println("Input full email: ");
		String projectName = ScannerUtils.inputString("Please input full name as String!");

		System.out.println("Input full password: ");
		String proSkill = ScannerUtils.inputString("Please input full name as String!");

		employeeController.createEmployee(firstname, lastname, phone, email, password, projectName, proSkill);
	}

	public static void EmployeeLogin() throws ClassNotFoundException, SQLException {
		System.out.println("Input full email: ");
		String email = ScannerUtils.inputString("Please input full name as String!");

		System.out.println("Input full password: ");
		String password = ScannerUtils.inputString("Please input full name as String!");
		if (employeeController.isAccountExists(email, password)) {
			System.out.println("login success!");
		} else {
			System.out.println("username or password is false!");
		}
	}
}