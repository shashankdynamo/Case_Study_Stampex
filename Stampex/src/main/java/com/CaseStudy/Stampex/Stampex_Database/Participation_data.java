package com.CaseStudy.Stampex.Stampex_Database;
import com.CaseStudy.BeanClass.Participate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Participation_data {
	public static void participation(Participate participate)throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.OracleDriver");
		String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe";
		String userId ="system";
		String Password = "manager";
		Connection connection = DriverManager.getConnection(dbUrl,userId,Password);
		Statement statement = connection.createStatement();

		String query = "INSERT INTO Participation VALUES(Participation_id.nextval"+",'"+participate.getName()+"','"+participate.getCity()+"','"+participate.getCompetition_type()+"','"+participate.getTheame_name()+"',"+participate.getTotal_no_Frames()+","+participate.getTotal_no_Stamps()+",'"+participate.getDescription()+"')";
		int row = statement.executeUpdate(query);
		System.out.println("*********************************************************************************************");

		System.out.println("Success");
		System.out.println("*********************************************************************************************");

		System.out.println(participate.getName()+"\tYour Participation has been Registered Successfully");
		System.out.println("*********************************************************************************************");

		connection.close();
	}
	public static void participationLog()throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.OracleDriver");
		String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe";
		String userId ="system";
		String Password = "manager";
		Connection conn = DriverManager.getConnection(dbUrl,userId,Password);
		Statement statement = conn.createStatement();
		// Step4 create the Result set
		ResultSet  resultSet = statement.executeQuery("select * from Participation");
		System.out.println("*********************************************************************************************************************************************************************************************************");
		System.out.println("Name \t|City  \t|Competition_Type \t| Theame_name \t|Total_no_Frames \t|Total_no_Stamps \t|Description");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		while(resultSet.next())
		{
			String name = resultSet.getString("Participant_name");
			String city=resultSet.getString("City");
			String type = resultSet.getString("Competition_type");
			String theame = resultSet.getString("Theame_name");
			int frames =resultSet.getInt("Total_no_Frames");
			int stamps =resultSet.getInt("Total_no_Stamps");
			String desc = resultSet.getString("Description");

			System.out.println(name +"\t|"+ city  +"\t|\t"+  type +"\t|\t"+ theame+"\t|\t"+frames+"\t|\t"+stamps+"\t|\t"+ desc);


		}
		System.out.println("*********************************************************************************************************************************************************************************************************");

		conn.close();


	}

}
