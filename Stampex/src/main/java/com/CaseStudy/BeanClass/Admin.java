package com.CaseStudy.BeanClass;

public class Admin {
	 private String adminName;
	 private String adminPassword;
	 
	public Admin() {
		super();
	}

	public Admin(String adminName, String adminPassword) {
		super();
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
	}
	 

}
