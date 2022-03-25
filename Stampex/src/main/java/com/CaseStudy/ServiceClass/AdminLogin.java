package com.CaseStudy.ServiceClass;
import com.CaseStudy.BeanClass.*;
import com.CaseStudy.Stampex.Stampex_Database.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class AdminLogin {

	Admin_login Adminlogin= new Admin_login();
	AdminPage adminhome = new AdminPage();

	public void adminlogin() throws  SQLException, Exception {

		Scanner scanner = new Scanner(System.in);
		while(true)
		{
		System.out.print(" Enter Admin user name => ");
		String userName = scanner.nextLine();

		System.out.print(" Enter Admin password => ");
		String password = scanner.nextLine();
		String query="SELECT * FROM administration where adminName ='"+userName+"' AND  adminPassword ='"+password+"'";
		ResultSet resultset=Admin_login.Alogin(query);
		if(resultset.next()){
			System.out.println("*********************************************************************************************");
			System.out.println("                        Logged in Successfully                      ");
			System.out.println("*********************************************************************************************");
			adminhome.adminpage();
			break;

		}
		else {
			System.out.println("*********************************************************************************************");
			System.out.println("                   Invalid Admin userName or Password                       ");
			System.out.println("*********************************************************************************************");

		}
		}

	}
}
