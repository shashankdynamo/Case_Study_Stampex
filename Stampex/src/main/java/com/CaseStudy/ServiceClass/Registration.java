package com.CaseStudy.ServiceClass;
import com.CaseStudy.Stampex.Register;
import java.util.*;

import java.util.Scanner;
 class Registration {

	 		Register register = new Register();
    		public void register(){
    		{
    		
        	Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter FirstName : ");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);

            System.out.print(" Enter LastName: ");
            String lastName = scanner.nextLine();
            register.setLastName(lastName);

            System.out.print(" Enter UserName: ");
            String userName = scanner.nextLine();
            register.setUserName(userName);

            System.out.print(" Enter Password: ");
            String password = scanner.nextLine();
            register.setPassword(password);

            System.out.print(" Enter EmailId: ");
            String emailId = scanner.nextLine();
            register.setEmailId(emailId);
            
            System.out.print("Enter PhoneNo: ");
            int phoneNo = scanner.nextInt();
            scanner.next();
            register.setPhoneNo(phoneNo);
           
            //System.out.println(register.toString());
    		}
        }
 }
    

