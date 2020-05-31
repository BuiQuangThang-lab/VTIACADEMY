package com.vti.backend.datalayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Employee;

public interface IEmployeeRepository {

	void createEmployee(String firstname, String lastname, int phone, String email, String password, String projectName, String proSkill );
	boolean isAccountExists(String email, String password) throws ClassNotFoundException;
}