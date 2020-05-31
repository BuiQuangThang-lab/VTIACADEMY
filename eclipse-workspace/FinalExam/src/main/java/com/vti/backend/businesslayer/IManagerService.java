package com.vti.backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Manager;

public interface IManagerService {
	void createManager(String firstname, String lastname, int phone, String email,String password, int expInYear) throws ClassNotFoundException, SQLException;
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException;
}
