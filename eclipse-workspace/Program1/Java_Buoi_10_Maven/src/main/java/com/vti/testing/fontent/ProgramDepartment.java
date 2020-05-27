package com.vti.testing.fontent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import com.vti.testing.backend.DepartmentDAO;
import com.vti.testing.entity.Department;

public class ProgramDepartment {
	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException, ClassNotFoundException {
		DepartmentDAO departmentDAO = new DepartmentDAO();
		
		//Q1. Get department
//		List<Department> departments = departmentDAO.getDepartments();
//		for (Department department : departments) {
//			System.out.println(departments.indexOf(department) + 1);
//			System.out.println(department);
//		}
//		
//		departmentDAO.insertDepartment();
		
		departmentDAO.SelectUser();
		
//		departmentDAO.updateDepartment();
		
//		departmentDAO.DeleteDepartment();
	}
}
