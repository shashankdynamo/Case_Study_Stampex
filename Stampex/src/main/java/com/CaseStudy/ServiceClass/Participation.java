package com.CaseStudy.ServiceClass;
import com.CaseStudy.BeanClass.Participate;
import com.CaseStudy.Stampex.Stampex_Database.Participation_data;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Participation{

	Participate participate = new Participate();
	public void participate() throws Exception, SQLException{
		{

			Scanner scanner = new Scanner(System.in);
			System.out.print(" Enter The Name : ");
			String name = scanner.nextLine();
			participate.setName(name);

			System.out.print(" Enter The City: ");
			String city = scanner.nextLine();
			participate.setCity(city);

			System.out.print(" Enter The Competition Type [Virtual,Live]: ");
			String type = scanner.nextLine();
			participate.setCompetition_type(type);

			System.out.print(" Enter The Theame Name: ");
			String Theame = scanner.nextLine();
			participate.setTheame_name(Theame);

			int  no_frames=0;
            while(true){
			System.out.print(" Enter Total no of Frames: ");
			 try
			{
			no_frames=scanner.nextInt();
			participate.setTotal_no_Frames(no_frames);
			break;
			}catch(InputMismatchException e)
				{
					String str=scanner.next();
					System.out.println(str+"\t Is not a valid input");
				}
            }
        	int  no_stamps =0;
        	while(true){
			System.out.print(" Enter Total no of Stamps Used: ");
			// scanner.next();
			try{
			no_stamps =scanner.nextInt();
			scanner.nextLine();
			participate.setTotal_no_Stamps(no_stamps);
			break;
			}catch(InputMismatchException e)
			{
				String str=scanner.next();
				System.out.println(str+"\t Is not a valid input");
			}
        }

			System.out.print(" Description of your Theame: ");
			String Description = scanner.nextLine();
			participate.setDescription(Description);
			Participation_data.participation(participate);

		

			//System.out.println(participate.toString());
		}
	}
}
