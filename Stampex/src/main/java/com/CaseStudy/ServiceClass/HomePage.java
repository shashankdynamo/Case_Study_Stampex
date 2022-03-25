package com.CaseStudy.ServiceClass;
import java.util.*;

public class HomePage {
	int ch; 
	PhilaCenter phila = new PhilaCenter();
	Competition competition = new Competition();
	public void homepage() throws Exception{
		
		boolean bool=true;
		while(bool)
		{	        	 
			System.out.println("|      Welcome to the STAMPEX       |");
			System.out.println("|-----------------------------------|");
			System.out.println("|                                   |");
			System.out.println("| ---------> Home page <----------- |");
			System.out.println("|      	Pick Your Choice            |");
			System.out.println("|-----------------------------------|");
			System.out.println("|                                   |");
			System.out.println("| 1.) Philately Competition         |");
			System.out.println("| 2.) Auction          				|");
			System.out.println("| 3.) Phila Beuro                   |");
			System.out.println("| 4.) Phila Center                  |");
			System.out.println("| 5.) logout                        |");
			System.out.println("-------------------------------------");
			Scanner sc = new Scanner(System.in); 


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
				competition.competition();
				break;

			case 2: 	
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! SEVER UNDER MAINTAINANCE     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				break;

			case 3: 
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! SEVER UNDER MAINTAINANCE     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

				break;
			case 4: 
				phila.philacenter();
				break;
			case 5:
				bool = false;
				break;

			default:
				System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
			}
		}

	}

}


