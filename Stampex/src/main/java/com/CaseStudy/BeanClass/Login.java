package com.CaseStudy.BeanClass;

public class Login {
	 private String UserName;
	 private String Password;
	public Login() {
		super();

	}
	public Login(String userName, String password) {
		super();
		this.UserName = userName;
		this.Password = password;
	}
	@Override
	public String toString() {
		return "Login [UserName=" + UserName + ", Password=" + Password + "]";
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

}
