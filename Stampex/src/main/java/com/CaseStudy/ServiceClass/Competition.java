package com.CaseStudy.ServiceClass;
import com.CaseStudy.BeanClass.Participate;
import com.CaseStudy.Stampex.Stampex_Database.*;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Competition {
	//Competition comp = new Competition();
	Participation participation = new Participation();

	Competition_DB competition = new Competition_DB();

	int ch=0; 
	void competition() throws Exception, Exception{
		HomePage home = new HomePage();
		Scanner sc = new Scanner(System.in); 
		boolean bool=true;

		while(bool)
		{	        	 
			System.out.println("|      Welcome to the STAMPEX       |");
			System.out.println("|-----------------------------------|");
			System.out.println("|                                   |");
			System.out.println("|   Select number and press enter   |");
			System.out.println("|       to Move forward             |");
			System.out.println("|-----------------------------------|");
			System.out.println("|                                   |");
			System.out.println("| 1.)List of On going Competition   |");
			System.out.println("| 2.)UpComing Competition           |");
			System.out.println("| 3.)Participate                    |");
			System.out.println("| 4.)Go back to main page           |");
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
				try {
					competition.list_of_competition();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	


				break;

			case 2: 
				try {
					competition.upcoming_competition();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	


				break;

			case 3:

				participation.participate();
				break;
			case 4: 
				//home.homepage();
				bool=false;
				break;
				


			default:
				System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
			}
		}

	}

}
