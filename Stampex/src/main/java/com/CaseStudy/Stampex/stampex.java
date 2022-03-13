package com.CaseStudy.Stampex;
import java.util.Scanner;
public class stampex {
	 

	 public static void main(String args[])
	 {
		 Registration register=new Registration();
		         int ch; 
	                
	         Scanner sc = new Scanner(System.in); 
	         
	         do
	         {	        	 
	        	 System.out.println("|      Welcome to the STAMPEX       |");
	             System.out.println("|-----------------------------------|");
	             System.out.println("|                                   |");
	             System.out.println("|   Select number and press enter   |");
	             System.out.println("|       to Move forward             |");
	             System.out.println("|-----------------------------------|");
	             System.out.println("|                                   |");
	             System.out.println("| 1.) Login to Existing Account     |");
	             System.out.println("| 2.) Register new Account          |");
	             System.out.println("| 3.) Exit from Stampex             |");
	             System.out.println("|                                   |");
	             System.out.println("|                                   |");
	             System.out.println("-------------------------------------");
	     	

	         
	             System.out.print("\n Enter your choice: ");  
	             ch = sc.nextInt(); 
	            
	         
	             System.out.println("\n");
	                  
	              switch (ch)
	              {
	                case 1: 
	                	
	                break;
	                
	                case 2: 
	                			register.register();
	                 
	                 break;
	                 
	                case 3: 
		                System.out.println("Thank You \n\n");

	                	System.exit(0);	  

	             	    break;
	               
	                
	                default:
	                 System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
	               }
	         }while(ch <1 || ch > 3);
	             
	              }

	    
		    }

