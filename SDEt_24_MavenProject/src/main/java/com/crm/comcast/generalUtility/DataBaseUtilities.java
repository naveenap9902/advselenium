package com.crm.comcast.generalUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtilities 
{
	static Driver driver;
	static Connection connection;
	static ResultSet result;
	static int verifyNum;
	/**
	 * 
	 */
	public void connectToDB()
	{
		try{
		driver=new Driver();
		DriverManager.registerDriver(driver);
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void closeDB() throws SQLException
	{
		connection.close();
	}
	public ResultSet excuteSelectQuery(String query) throws Throwable
	{
		try{
		result=connection.createStatement().executeQuery(query);
		return result;
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return result;
	}
	public int excuteUpdateQuery(String query) throws Throwable
	{
		try{
		 verifyNum = connection.createStatement().executeUpdate(query);
		 return verifyNum;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return verifyNum;
	}

}
