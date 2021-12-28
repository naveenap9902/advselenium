package db_practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class ClearTripBookCurrentDateTest 
{
	@Test
	public void clearTripCurrentdateTest() throws InterruptedException
	{
		//get the current system date
		Date dateobj=new Date();
		String date = dateobj.toString();
		System.out.println(date);
		String[] splitdata = date.split(" ");
		String day=splitdata[0];
		String month=splitdata[1];
		String actDate=splitdata[2];
		String year=splitdata[5];
		//convert sysdate into depDate format
		String depDate=day+" "+month+" "+actDate+" "+year;
		//open the empty browser
		WebDriver driver=new ChromeDriver();
		
	}

}
