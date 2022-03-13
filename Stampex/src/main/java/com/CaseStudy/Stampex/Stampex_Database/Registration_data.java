package com.CaseStudy.Stampex.Stampex_Database;
import com.CaseStudy.Stampex.Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

 class Registration_data{

	public static  void Register(Register register) throws ClassNotFoundException, SQLException {
		
		
		
		//Step 1
		Class.forName("oracle.jdbc.OracleDriver");
		//Step 2
		String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe";
		String userId ="system";
		String Password = "manager";
		Connection connection = DriverManager.getConnection(dbUrl,userId,Password);
		// Step3 create the statement
		
		
		
		String query = "insert into registration values(?,?,?,?,?,?)";
		PreparedStatement prepared = connection.prepareStatement(query);
		
	
		
			String firstName = register.getFirstName();
			String lastName = register.getLastName();
			String userName = register.getUserName();
			String password = register.getPassword();
			String emailId = register.getEmailId();
			int phoneNo = register.getPhoneNo();
			
			prepared.setString(1,firstName);
			prepared.setString(2,lastName);
			prepared.setString(3,userName);
			prepared.setString(4,password);
			prepared.setString(5,emailId);
			prepared.setInt(6,phoneNo);
			
			prepared.executeUpdate();
			
		   
			
		
		System.out.println("Registration Done Successfully");
			

		
		connection.close();

	}

}