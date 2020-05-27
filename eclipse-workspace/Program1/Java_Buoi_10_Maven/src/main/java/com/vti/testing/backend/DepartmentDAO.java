package com.vti.testing.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.vti.testing.Utils.ScannerUtils;
import com.vti.testing.entity.Department;

public class DepartmentDAO {
	private List<Department> departments;
	private Connection connection;
	public Properties databaseproperties;
	public Properties messageProperties;

	public DepartmentDAO() throws FileNotFoundException, IOException {
		departments = new ArrayList<Department>();
		databaseproperties = new Properties();
		databaseproperties.load(new FileInputStream("src/main/resource/database.properties"));
		messageProperties = new Properties();
		messageProperties.load(new FileInputStream("src/main/resource/message.properties"));
	}

	private Connection connect() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {

		String url = databaseproperties.getProperty("url2");
		String username = databaseproperties.getProperty("username");
		String password = databaseproperties.getProperty("password");
		try {
			// Step 1* register the driver class with DriverManager
			Class.forName(databaseproperties.getProperty("driver"));

			// Step 2: get a Database Connection
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Connect success!");
		return connection;
	}

//=============================================================================================//
	// Select from department by id
	public void SelectUser() throws SQLException, FileNotFoundException, ClassNotFoundException, IOException {
		connect();

		Department department = new Department();
		while (true) {
			System.out.println("Nhập vào departmentId: ");
			department.setId(ScannerUtils.inputInt("Bạn cần nhập vào sô! Mời bạn nhập lại: "));
			String sql = "SELECT DepartmentName FROM inputtesting.department\r\n" + "WHERE DepartmentID = ?;";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, department.getId());
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				department.setName(rs.getString("DepartmentName"));
				System.out.println(department);
			}
			if (!isDepartmentIdExists()) {
				System.out.println("Không có department này. mời nhập lại: ");
			}
		}
	}
//=============================================================================================//
	// select from department

	public List<Department> getDepartments()
			throws SQLException, FileNotFoundException, ClassNotFoundException, IOException {
		if (connection == null || connection.isClosed()) {
			connect();
		}
		// Create a statement object
		String sql = "SELECT * FROM inputtesting.department;";
		Statement statement = connection.createStatement();
		// execute query
		ResultSet resultSet = statement.executeQuery(sql);
		// Step 5: handling result set
		while (resultSet.next()) {
			Department department = new Department();
			department.setId((resultSet.getInt("DepartmentID")));
			department.setName((resultSet.getString("DepartmentName")));

			departments.add(department);

		}
		return departments;
	}
//==============================================================================================//
	// create Department

	public void insertDepartment() throws SQLException, FileNotFoundException, ClassNotFoundException, IOException {
		connect();
		Department department = new Department();
//		System.out.println("Nhập vào id: ");
//		department.setId(scanner.nextInt());
		System.out.println("Nhập vào tên: ");

		department.setName(ScannerUtils.inputString("Bạn cần nhập vào tên! mời bạn nhập: "));
		String sql = "	INSERT INTO department (DepartmentName)"
				+ "	VALUE				           (        ?		)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// input scanner
//		int DepartmentID = department.getId();
		String DepartmentName = department.getName();

//		preparedStatement.setInt(1,DepartmentID);
		preparedStatement.setString(1, DepartmentName);

		// Step 4: execute query
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmount);
		if (isDepartmentNameExists()) {
			System.out.println("Đã có tên này, mời nhập vào tên khác: ");
		}
	}
//==============================================================================================//
	// Update theo id

	public void updateDepartment() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		connect();
		System.out.println("Nhập vào thông tin cần update");
		System.out.println("Nhập vào departmetID: ");
		Department department = new Department();
		String sql = "UPDATE inputtesting.department " + "SET    DepartmentName = ? " + "WHERE  DepartmentID   = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		department.setId(ScannerUtils.inputInt("Bạn cần nhập vào số, mời nhập lại: "));
		System.out.println("Nhập vào NewName: ");
		department.setName(ScannerUtils.inputString("Bạn cần nhập vào tên: "));
		preparedStatement.setInt(1, department.getId());
		preparedStatement.setString(2, department.getName());
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmount);
		if (!isDepartmentIdExists()) {
			System.out.println("Không có department này. mời nhập lại: ");
		}
	}

	// DELETE department

	public void DeleteDepartment() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		connect();
		Department department = new Department();
		System.out.println("Nhập vào id Department cần xóa: ");
		department.setId(ScannerUtils.inputInt("Bạn cần nhập vào số, mời bạn nhập lại: "));
		String sql = "DELETE FROM inputtesting.department " + "WHERE  DepartmentID   = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, department.getId());
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmount);
		if (!isDepartmentIdExists()) {
			System.out.println("Không có department này. mời nhập lại: ");
		}
	}
	// ================Kiểm tra điều kiện tồn tại của
	// id==============================//

	public boolean isDepartmentIdExists() throws SQLException {
		Department department = new Department();
		System.out.println("Nhập vào departmentId: ");
		department.setId(ScannerUtils.inputInt("Bạn cần nhập vào sô! Mời bạn nhập lại: "));
		String sql = "SELECT DepartmentName FROM inputtesting.department\r\n" + "WHERE DepartmentID = ?;";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, department.getId());
		ResultSet rs = preparedStatement.executeQuery();
		if (rs.next()) {
			return true;
		} else
			return false;

	}

	// =======================Kiểm tra NameDepartment có tồn tai
	// không========================//
	public boolean isDepartmentNameExists() throws SQLException {
		Department department = new Department();
		System.out.println("Nhập vào departmentName: ");
		department.setName(ScannerUtils.inputString("Bạn cần nhập vào tên: "));
		String sql = "SELECT DepartmentName FROM inputtesting.department\r\n" + "WHERE DepartmentName = ?;";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(2, department.getName());
		ResultSet rs = preparedStatement.executeQuery();
		if (rs.next()) {
			return true;
		} else
			return false;
	}
}