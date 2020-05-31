package com.vti.backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Employee;

public interface IEmployeeService {
	void createEmployee(String firstname, String lastname, int phone, String email,String password, String projectName, String proSkill) throws ClassNotFoundException, SQLException;
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException;
}
