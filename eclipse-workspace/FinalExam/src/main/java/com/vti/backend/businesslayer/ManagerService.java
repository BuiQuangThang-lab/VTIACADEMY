package com.vti.backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import com.vti.backend.datalayer.ManagerRepository;
import com.vti.entity.Manager;

public class ManagerService implements IManagerService {
	private ManagerRepository repository;

	public ManagerService() {
		repository = new ManagerRepository();
	}

	public void createManager(String firstname, String lastname, int phone, String email, String password, int expInYear)
			throws ClassNotFoundException, SQLException {
		 repository.createManager(firstname, lastname, phone, email, password, expInYear);
	} 
	
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException{
		return repository.isAccountExists(email, password);
	}
}
