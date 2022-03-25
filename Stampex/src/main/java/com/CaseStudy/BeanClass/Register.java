package com.CaseStudy.BeanClass;

public class Register{
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String emailId;
    private long phoneNo;
    
    public Register() {}
	public Register(String firstname, String lastName, String userName, String password,String emailId,long phoneNo) {
		super();
		this.firstName = firstname;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
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
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public long getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    @Override
    public String toString() {
        return "Register [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password=" +
            password + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
    }
}
