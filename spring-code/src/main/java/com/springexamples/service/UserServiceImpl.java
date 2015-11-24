package com.springexamples.service;
import java.sql.SQLException;
public class UserServiceImpl implements UserService {
	
	private String userName;
	private String password;
	
	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName){
		this.userName  = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValidUser(String userName,String password) throws SQLException {
		return isValidUser(userName,password);
	}
}
