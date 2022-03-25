package com.CaseStudy.ServiceClass;

import java.util.*;

import com.CaseStudy.Stampex.Stampex_Database.Participation_data;
import com.CaseStudy.Stampex.Stampex_Database.Registration_data;
import com.CaseStudy.Stampex.*;


public class AdminPage {
	stampex home = new stampex();
	AddCompetition compete = new AddCompetition();
	int ch=0; 
	public void adminpage() throws Exception{
		Scanner sc = new Scanner(System.in); 
		boolean bool=true;
		while(bool)
		{	        	 
			System.out.println("|         STAMPEX Admin             |");
			System.out.println("|-----------------------------------|");
			System.out.println("|                                   |");
			System.out.println("| ---------> Admin page <-----------|");
			System.out.println("|      				                |");
			System.out.println("|-----------------------------------|");
			System.out.println("|                                   |");
			System.out.println("| 1.) Add Competitions              |");
			System.out.println("| 2.) Registration log         		|");
			System.out.println("| 3.) Participation log             |");
			System.out.println("| 4.) Logout                        |");
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
				compete.competitionEntry();
				break;

			case 2: 	
				Registration_data.registrationLog();
				break;

			case 3: 
				Participation_data.participationLog();
				break;
			case 4: 
				System.out.println("Thank You \n\n");

				bool=false;

			default:
				System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
			}
		}

	}

}





