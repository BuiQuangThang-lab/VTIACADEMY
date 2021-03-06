package com.vti.backend.presentationlayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.EmployeeService;
import com.vti.backend.businesslayer.IEmployeeService;
import com.vti.entity.Employee;

public class EmployeeController {
	private IEmployeeService service;

	public EmployeeController() {
		service = new EmployeeService();
	}
	/**
	 * This class is create employee. 
	 * check condition for parameters
	 * @Description: .
	 * @author: Thang
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: thang
	 * @modifer_date: May 31, 2020
	 */
	public void createEmployee(String firstname, String lastname, int phone, String email, String password,
			String projectName, String proSkill) throws Exception {
		service.createEmployee(firstname, lastname, phone, email, password, projectName, proSkill);
		while (true) {
			String phones = String.valueOf(phone);
			String[] arr = password.split("");
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].charAt(0) > 91) {
					count++;
				}
				if (count == arr.length) {
					throw new Exception("password must be have one more capital character");
				}
			}
			if (phones.length() > 12 || phones.length() < 9) {
				throw new Exception("phone must be have 9 character to 12 character");
			}
			if (email.contains("@vti.com.vn")) {
				throw new Exception("email must be contains @vti.com.vn");
			}
			if (projectName != "Testing System" && projectName != "CRM" && projectName != "TimeSheet") {
				throw new Exception("project name is not valid!");
			}
			if (password.length() < 6 || password.length() > 12) {
				throw new Exception("password must have 6 to 12 character");
			}

			service.createEmployee(firstname, lastname, phone, email, password, projectName, proSkill);
		}
	}
	/**
	 * This class is method check is employee is exists.  
	 * 
	 * @Description: .
	 * @author: Thang
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: thang
	 * @modifer_date: May 31, 2020
	 */
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException {
		return service.isAccountExists(email, password);
	}

}