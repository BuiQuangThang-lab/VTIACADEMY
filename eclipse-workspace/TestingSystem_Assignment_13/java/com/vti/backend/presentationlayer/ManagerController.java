package com.vti.backend.presentationlayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IManagerService;
import com.vti.backend.businesslayer.ManagerService;
import com.vti.entity.Manager;

public class ManagerController {
	private IManagerService service;

	public ManagerController() {
		service = new ManagerService();
	}
	/**
	 * This class is method check is manager is exists.  
	 * 
	 * @Description: .
	 * @author: Thang
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: thang
	 * @modifer_date: May 31, 2020
	 */
	public void createManager(String firstname, String lastname, int phone, String email,String password, int expInYear)
			throws Exception {
		String phones = String.valueOf(phone);
		String[] arr = password.split("");
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].charAt(0) > 91) {
				count ++;
			}
			if(count == arr.length) {
				throw new Exception("password must be have one more capital character");
			}
		}
		while (true) {
			if (phones.length() > 12 || phones.length() < 9) {
				throw new Exception("phone must be 9 character to 12 character");
			}
			if (email.contains("@vti.com.vn")) {
				throw new Exception("email must be contains @vti.com.vn");
			}
			if (expInYear > 20) {
				throw new Exception("expInYear is smaller 20");
			}

			service.createManager(firstname, lastname, phone, email,password, expInYear);
		}
	}
	
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException{
		return service.isAccountExists(email, password);
	}

}
