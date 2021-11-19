package db_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class rmgyTryfinally 
{
	public static void main(String[] args) throws InterruptedException, SQLException
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8084");
		driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("SDET-24-01");
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Naveen Patil");
		WebElement ele = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
		 Select s = new Select(ele);
		 Thread.sleep(2000);
		 s.selectByVisibleText("Created");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(5000);
		 Connection conn=null;
		 try
		 {
		 Driver driverref=new Driver();
			DriverManager.registerDriver(driverref);
			//step2:-Connect to Db
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
			//step3:-create or issue sql statements
			Statement stat = conn.createStatement();
			//step4:-execute the query
			ResultSet set = stat.executeQuery("select * from project where upper(project_name)='SDET-24-01' ");
		  while(set.next())
		  {
			String val = set.getString(4) ;
			if(val.equals("SDET-24-01"))
			{
				System.out.println("project is created");
				break;
			}
		  }
		 }
			catch (Exception e) {
				System.out.println("project is not created");
			}
		 finally {
		  //verify
		  //step5:-close the connection
		  conn.close();	
	}
	}
}
