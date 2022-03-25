package com.CaseStudy.Stampex.Stampex_Database;
import com.CaseStudy.BeanClass.*;
import com.CaseStudy.ServiceClass.UserLogin;
import com.CaseStudy.BeanClass.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login_data {
	//Login login=new Login();
	public static ResultSet login(String Query)throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.OracleDriver");
		String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe";
		String userId ="system";
		String Password = "manager";
		Connection connection = DriverManager.getConnection(dbUrl,userId,Password);
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(Query);
		return rs;
			
		
		
	}


	
	

}
