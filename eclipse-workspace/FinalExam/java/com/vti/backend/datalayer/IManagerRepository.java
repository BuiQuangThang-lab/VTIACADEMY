package com.vti.backend.datalayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Manager;

public interface IManagerRepository {

	void createManager(String firstname, String lastname, int phone, String email, String password, int expInYear) throws Exception;
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException;
}
