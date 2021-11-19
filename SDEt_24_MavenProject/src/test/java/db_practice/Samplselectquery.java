package db_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
public class Samplselectquery 
{
	public static void main(String[] args) throws Exception 
	{
		//step1:-load/register the driver for specific database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		//step2:-Connect to Db
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
		//step3:-create or issue sql statements
		Statement stat = conn.createStatement();
		//step4:-exceute the query
		ResultSet set = stat.executeQuery("select * from student");
	  while(set.next())
	  {
		  System.out.println(set.getInt(1)+"\t"+set.getString(2)+"\t"+set.getString(3)+"\t"+set.getString(4));
	  }
	  //verify
	  //step5:-close the connection
	  conn.close();	
	}
}
