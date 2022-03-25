package com.CaseStudy.ServiceClass;

import java.sql.SQLException;
import java.util.Scanner;

import com.CaseStudy.BeanClass.*;
import com.CaseStudy.Stampex.Stampex_Database.*;

public class AddCompetition {
	
	public  static void competitionEntry() throws Exception, SQLException{
	{
		CompetitionBean comp = new CompetitionBean();

	
	Scanner scanner = new Scanner(System.in);
    System.out.print(" Enter The Competition Id : ");
    String competition_id = scanner.nextLine();
    comp.setCompetiton_id(competition_id);

    System.out.print(" Enter The Competition_name : ");
    String competition_name= scanner.nextLine();
    comp.setCompetition_name(competition_name);
    

    System.out.print(" Enter The Description: ");
    String description = scanner.nextLine();
    comp.setDescription(description);
    
    System.out.print(" Enter The Competition Type [Virtual,Live]: ");
    String competition_type = scanner.nextLine();
    comp.setCompetition_type(competition_type);


    System.out.print(" Enter The Start date (format dd/mm/yyyy): ");
    String start_Date= scanner.nextLine();
    comp.setStart_Date(start_Date);
    
    System.out.print(" Enter The Timings :(fomat 12:00pm-24:00am) ");
    String timings= scanner.nextLine();
    comp.setTimings(timings);
    
    System.out.print(" Enter The End date (format dd/mm/yyyy): ");
    String end_Date= scanner.nextLine();
    comp.setEnd_Date(end_Date);
    
    Competition_DB.AddCompetition(comp);
    
   
   
		}
	}
 }
