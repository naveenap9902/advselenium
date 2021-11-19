package db_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Nonselectquery 
{
	public static void main(String[] args) throws Throwable 
	{
		Connection con=null;
		try
		{
		//step1:-load/register the driver for specific database
				Driver driverref=new Driver();
				DriverManager.registerDriver(driverref);
				//step2:-Connect to Db
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
				//step3:-create or issue sql statements
				Statement stat = con.createStatement();
				//step4:-exceute the query
				int val = stat.executeUpdate("insert into student values(6,'pradeep','l','pradeep@gmail.com')");
				if(val==1)
				{
					System.out.println("student is successfully created");
				}
		}
		catch (Exception e) {
			System.err.println("student not created");
		}
		finally 
		{
			//step5:-close connection mandatarily
			con.close();
			System.out.println("=====connection closed=====");
		}			
	}
}
