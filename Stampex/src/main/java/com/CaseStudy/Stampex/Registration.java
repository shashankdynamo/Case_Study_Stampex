package com.CaseStudy.Stampex;
import java.util.*;

import java.util.Scanner;
public class Registration {

    static Register register = new Register();

    public static void main(String[] args) {

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

            System.out.print(" Enter PhoneNo: ");
            int phoneNo = scanner.nextInt();
            register.setPhoneNo(phoneNo);

            System.out.println(register.toString());
        }
    }

