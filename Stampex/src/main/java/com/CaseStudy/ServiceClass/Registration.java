package com.CaseStudy.ServiceClass;
import com.CaseStudy.Stampex.Register;
import com.CaseStudy.Stampex.Stampex_Database.*;

import java.sql.SQLException;
import java.util.*;
 public class Registration {

	 		Register register = new Register();
    		public void register() throws ReflectiveOperationException, SQLException{
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
            long phoneNo=0;
            while(true){
            System.out.print(" Enter PhoneNo: ");
            try
			{
             phoneNo = scanner.nextLong();
             register.setPhoneNo(phoneNo);
             Registration_data.Register(register);
             break;
           // scanner.nextLine();
           // scanner.close();
			}catch(InputMismatchException e)
			{
				String str=scanner.next();
				System.out.println(str+"\t Is not a valid input");
			}
            
            
            }
           
            
				

			
            //System.out.println(register.toString());
    		}
        }
 }
    

