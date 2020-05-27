package com.vti.entity.construction;

public class Account {
   private int id;
   private String email;
   private String UserName;
   private String firstName;
   private String lastName;
   private Position postion;
   
   public Account(String userNames) {
	   this.UserName = userNames;
   }

public Account(String email, String userName, String firstName, String lastName, String fullName) {
	super();
	this.email = email;
	this.UserName = userName;
	this.firstName = firstName;
	this.lastName = lastName;
	fullName = this.firstName + " " + this.lastName;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Position getPostion() {
	return postion;
}

public void setPostion(Position postion) {
	this.postion = postion;
};


   
  
}
