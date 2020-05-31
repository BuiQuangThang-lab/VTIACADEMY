package com.vti.backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.EmployeeRepository;
import com.vti.backend.datalayer.ManagerRepository;
import com.vti.entity.Employee;
import com.vti.entity.Manager;

public class EmployeeService implements IEmployeeService {
	private EmployeeRepository repository;

	public EmployeeService() {
		repository = new EmployeeRepository();
	}

	public void createEmployee(String firstname, String lastname, int phone, String email,String password, String projectName,
			String proSkill) throws ClassNotFoundException, SQLException {
		repository.createEmployee(firstname, lastname, phone, email,password, projectName, proSkill);
	}
	
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException{
		return repository.isAccountExists(email, password);
	}

}
