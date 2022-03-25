package com.CaseStudy.ServiceClass;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.CaseStudy.Stampex.stampex;
import com.CaseStudy.Stampex.Stampex_Database.Participation_data;
import com.CaseStudy.Stampex.Stampex_Database.PhilaCenterData;
import com.CaseStudy.Stampex.Stampex_Database.Registration_data;

public class PhilaCenter {
	PhilaCenterData philaData = new PhilaCenterData();
	stampex home = new stampex();
	AddCompetition compete = new AddCompetition();
	int ch=0; 
	public void philacenter() throws Exception{
		Scanner sc = new Scanner(System.in); 
		boolean bool=true;
		while(bool)
		{	        	 
			System.out.println("|        	  STAMPEX               |");
			System.out.println("|-----------------------------------|");
			System.out.println("|                                   |");
			System.out.println("| ---------> Phila Center <---------|");
			System.out.println("|      				                |");
			System.out.println("|-----------------------------------|");
			System.out.println("|                                   |");
			System.out.println("| 1.) Stamps                        |");
			System.out.println("| 2.) First day Cover        		|");
			System.out.println("| 3.) Miniature                     |");
			System.out.println("| 4.) Home Page                     |");
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
				philaData.stamp();
				break;

			case 2: 	
				philaData.fdc();
				break;

			case 3: 
				philaData.miniature();
				break;
			case 4: 
				bool=false;

			default:
				System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
			}
		}

	}

}
