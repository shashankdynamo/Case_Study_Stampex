package com.CaseStudy.Stampex;
import com.CaseStudy.BeanClass.Participate;
import com.CaseStudy.ServiceClass.*;
import com.CaseStudy.Stampex.Stampex_Database.*;

import java.util.InputMismatchException;
import java.util.Scanner;
public class stampex {


	public static void main(String args[]) throws Throwable
	{
		AdminLogin admin = new AdminLogin();
		Registration register=new Registration();
		UserLogin login = new UserLogin();
		HomePage home = new HomePage();
		Competition_DB competition = new Competition_DB();
		Participate participate = new Participate();

		int ch=0; 
		Scanner sc = new Scanner(System.in); 
		
		while(true)
		{	   
			
			System.out.println("|      Welcome to the STAMPEX       |");
			System.out.println("|-----------------------------------|");
			System.out.println("|                                   |");
			System.out.println("|   Select number and press enter   |");
			System.out.println("|       to Move forward             |");
			System.out.println("|-----------------------------------|");
			System.out.println("| 1.) Admin Login                   |");
			System.out.println("| 2.) Login to Existing Account     |");
			System.out.println("| 3.) Register new Account          |");
			System.out.println("| 4.) Exit from Stampex             |");
			System.out.println("|                                   |");
			System.out.println("|                                   |");
			System.out.println("-------------------------------------");



			System.out.print("\n Enter your choice: ");  
			try
			{
				ch = sc.nextInt(); 
			
			}catch(InputMismatchException e)
			{
				String str=sc.next();
				System.out.println(str+"\t Is not a valid input");
			}

			


			System.out.println("\n");

			switch (ch)
			{
			case 1: 
				admin.adminlogin();
				break;
			case 2: 
				login.login();
				break;

			case 3: 
				register.register();
				login.login();

				break;

			case 4: 
				System.out.println("Thank You \n\n");
				System.exit(0);	  

				break;


			default:
				System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
			}
		}

	}


}

