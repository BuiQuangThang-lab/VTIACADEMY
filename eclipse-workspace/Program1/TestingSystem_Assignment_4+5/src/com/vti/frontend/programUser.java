package com.vti.frontend;

import com.vti.backend.ListUser;

public class programUser {
   public static void main(String[] args) {
	ListUser listUser = new ListUser();
	listUser.insertUser();
	listUser.displayInfo();
}
}
