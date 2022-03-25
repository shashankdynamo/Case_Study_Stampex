package com.CaseStudy.Stampex.Stampex_Database;
import com.CaseStudy.BeanClass.*;
import com.CaseStudy.ServiceClass.AddCompetition;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public class Competition_DB{

	public static  void AddCompetition(CompetitionBean comp) throws Exception {



		//Step 1
		Class.forName("oracle.jdbc.OracleDriver");
		//Step 2
		String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe";
		String userId ="system";
		String Password = "manager";
		Connection connection = DriverManager.getConnection(dbUrl,userId,Password);
		Statement statement= connection.createStatement();

		String query = "INSERT INTO Competition VALUES('"+comp.getCompetiton_id()+"','"+comp.getCompetition_name()+"','"+comp.getDescription()+"','"+comp.getCompetition_type()+"','"+comp.getStart_Date()+"','"+comp.getTimings()+"','"+comp.getEnd_Date()+"')";
		try {
			int row = statement.executeUpdate(query);
			System.out.println("*********************************************************************************************");
			System.out.println("Success");
			System.out.println("*********************************************************************************************");

			System.out.println("\tThe Competition Added Successfully");

			System.out.println("*********************************************************************************************");

		}catch(SQLDataException se) {
			System.out.println("*********************************************************************************************");
			System.out.println("The Pre Request Format Doesnt match Please Enter it Again");
			System.out.println("*********************************************************************************************");

			AddCompetition.competitionEntry();
		}
		

		connection.close();

	}
	public  void list_of_competition()throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.OracleDriver");
		String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe";
		String userId ="system";
		String Password = "manager";
		Connection con = DriverManager.getConnection(dbUrl,userId,Password);
		Statement state = con.createStatement();
		// Step4 create the Result set
		ResultSet  resultSet = state.executeQuery("select * from Competition");
		while(resultSet.next())
		{
			System.out.println("*********************************************************************************************");

			System.out.print("Competiton_id:");
			System.out.println(resultSet.getString("Competiton_id"));
			System.out.print("Competiton_Name:");
			System.out.println(resultSet.getString("Competition_name"));
			System.out.print("Description:");
			System.out.println(resultSet.getString("Description"));
			System.out.print("Competiton_Type:");
			System.out.println(resultSet.getString("Competition_type"));
			System.out.print("Start_Date:");

			System.out.println(resultSet.getString("Start_Date"));
			System.out.print("Timings:");

			System.out.println(resultSet.getString("Timings"));
			System.out.print("End_date:");

			System.out.println(resultSet.getString("End_Date"));
			System.out.println("*********************************************************************************************");



		}
		con.close();
	}
	public  void upcoming_competition()throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.OracleDriver");
		String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe";
		String userId ="system";
		String Password = "manager";
		Connection conn = DriverManager.getConnection(dbUrl,userId,Password);
		Statement statement = conn.createStatement();
		// Step4 create the Result set
		ResultSet  resultSet = statement.executeQuery("select * from Upcoming_Competition");
		System.out.println("*********************************************************************************************************************************************************************************************************");
		System.out.println("id \t|\tCompetition_Title\t\t|\tDescription\t|\tlocation\t|Competition_type \t|\tStart Datedate \t\tTimings\t\tEnd_date");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		while(resultSet.next())
		{

			String id = resultSet.getString("Competiton_id");
			String name=resultSet.getString("Competition_name");
			String desc = resultSet.getString("Description");
			String loc = resultSet.getString("Location");
			String type =resultSet.getString("Competition_type");
			String sdate =resultSet.getString("Start_Date");
			String time = resultSet.getString("Timings");
			Date edate = resultSet.getDate("End_Date");
			System.out.println("*********************************************************************************************************************************************************************************************************");
			System.out.println(id +"\t|\t"+ name  +"\t|\t\t"+  desc +"\t|\t"+ loc +"\t|\t"+ type +"\t|\t"+  sdate +"\t|\t"+time+"\t|\t"+edate);

		}
		System.out.println("*********************************************************************************************************************************************************************************************************");

		conn.close();
	}


}




