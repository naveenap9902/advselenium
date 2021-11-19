package com.crm.comcast.generalUtility;

import java.sql.Connection;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.crm.comcast.objectRepositorylib.HomePage;
import com.crm.comcast.objectRepositorylib.LoginPage;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class BaseAnnotationClass 
{
	public PropertiesFileUtility plib=new PropertiesFileUtility();
	public ExcelFileUtility2 exc=new ExcelFileUtility2();
	public JavaGenericUtility jav=new JavaGenericUtility();
	public WebDriverGenericUtility webd=new WebDriverGenericUtility();
	public DataBaseUtilities dblib=new DataBaseUtilities();
	public WebDriver driver=null;
	
	
	@BeforeSuite(groups="smokeTest")
	public void configBS()
	{
		System.out.println("===connect to database and config extend report===");
		dblib.connectToDB();
	}
   // @Parameters(value="BROWSER")
	@BeforeClass(groups="smokeTest")
	public void configBC() throws Throwable
	{
		System.out.println("===launch the browser===");
		String BROWSER=plib.getPropertyKeyValue("browser");
		
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (BROWSER.equals("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else if (BROWSER.equals("iebrowser")) {
			driver=new InternetExplorerDriver();		
		}	
	}
	@BeforeMethod(groups="smokeTest")
	public void configBM() throws Throwable
	{
		System.out.println("===login to application===");
		LoginPage lp=new LoginPage(driver);
		webd.waitUntilPageLoad(driver);
		lp.loginToApp();
	}
	@AfterMethod(groups="smokeTest")
	public void configAM()
	{
		System.out.println("===logout from application====");
		HomePage home=new HomePage(driver);
		home.signOut();
	}
	@AfterClass(groups="smokeTest")
	public void configAC()
	{
		System.out.println("===close the browser====");
		driver.close();
	}
	@AfterSuite(groups="smokeTest")
	public void configAS() throws SQLException
	{
		System.out.println("===close DB connection===");
		dblib.closeDB();
	}
}
