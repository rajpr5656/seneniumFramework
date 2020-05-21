package com.training.bean;

public class LoginBean {
	private String userName;
	private String password;
//	private String email;

	public LoginBean() {
	}

	public LoginBean(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
//		this.email= email;
	}
	
//	
//	public String getEmail() {
//		return email;
//		
//	}
//	
//	public void setEmail(String email) {
//		this.email=email;
//	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + "]";
	}

}
