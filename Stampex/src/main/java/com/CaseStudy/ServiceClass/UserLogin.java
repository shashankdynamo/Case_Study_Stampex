package com.CaseStudy.ServiceClass;
import com.CaseStudy.BeanClass.*;
import com.CaseStudy.Stampex.Stampex_Database.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class UserLogin {
	HomePage home = new HomePage();
	Login_data login= new Login_data();
	public void login() throws  SQLException, Exception {

		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.print(" Enter user name => ");
			String userName = scanner.nextLine();

			System.out.print(" Enter password => ");
			String password = scanner.nextLine();
			String query="SELECT * FROM registration where userName ='"+userName+"' AND  user_password ='"+password+"'";
			ResultSet resultset=Login_data.login(query);
			if(resultset.next()){
				System.out.println("*********************************************************************************************");
				System.out.println("              Logged in Successfully            ");
				System.out.println("*********************************************************************************************");
				home.homepage();
				break;
			}
			else {
				System.out.println("*********************************************************************************************");
				System.out.println("          Invalid User Name or Password          ");
				System.out.println("*********************************************************************************************");

			}

		}
	}
}



