package com.CaseStudy.Stampex.Stampex_Database;
import com.CaseStudy.Stampex.Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Registration_data{

	public static  void Register(Register register) throws ClassNotFoundException, SQLException {
		
		
		
		//Step 1
		Class.forName("oracle.jdbc.OracleDriver");
		//Step 2
		String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe";
		String userId ="system";
		String Password = "manager";
		Connection connection = DriverManager.getConnection(dbUrl,userId,Password);
		// Step3 create the statement
		
		
		
		String query = "insert into registration values(register_id.nextval,?,?,?,?,?,?)";
		PreparedStatement prepared = connection.prepareStatement(query);
		
	
		
			String firstName = register.getFirstName();
			String lastName = register.getLastName();
			String userName = register.getUserName();
			String password = register.getPassword();
			String emailId = register.getEmailId();
			long phoneNo = register.getPhoneNo();
			
			prepared.setString(1,firstName);
			prepared.setString(2,lastName);
			prepared.setString(3,userName);
			prepared.setString(4,password);
			prepared.setString(5,emailId);
			prepared.setLong(6,phoneNo);
			//try{
			prepared.executeUpdate();
		  
		System.out.println("*********************************************************************************************");

		System.out.println("Registration Done Successfully");
		
		System.out.println("*********************************************************************************************");
		//	}catch(SQLException s){
				//System.out.println("*********************************************************************************************");
				//System.out.println("The size is too large Please Enter it Again");
			//	System.out.println("*********************************************************************************************");
				
		//	}

		
		connection.close();

	}
	
	public static void registrationLog()throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.OracleDriver");
		String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe";
		String userId ="system";
		String Password = "manager";
		Connection conn = DriverManager.getConnection(dbUrl,userId,Password);
		Statement statement = conn.createStatement();
		// Step4 create the Result set
		ResultSet  resultSet = statement.executeQuery("select * from registration");
		System.out.println("*********************************************************************************************************************************************************************************************************");
	    System.out.println("Firstname \t| Lastname  \t|Email \t|Phoneno");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		while(resultSet.next())
		{
			String firstname = resultSet.getString("firstName");
			String lastname=resultSet.getString("lastName");
			String email = resultSet.getString("email");
			long phoneno = resultSet.getLong("phoneNo");
		
           System.out.println(firstname +"\t|\t"+ lastname  +"\t|\t"+  email +"\t|\t"+ phoneno);


		}
		System.out.println("*********************************************************************************************************************************************************************************************************");

		conn.close();
	

  }
}