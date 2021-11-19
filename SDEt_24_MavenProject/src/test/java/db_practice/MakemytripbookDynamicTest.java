package db_practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MakemytripbookDynamicTest 
{
	@Test
	public void makeMyTripTest() throws InterruptedException
	{
		Date dateobj=new Date();
		String date = dateobj.toString();
		System.out.println(date);
		String[] splitdata = date.split(" ");
		String day=splitdata[0];
		String month=splitdata[1];
		String actDate=splitdata[2];
		String year=splitdata[5];
		String depDate=day+" "+month+" "+actDate+" "+year;
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open the application
		driver.get("https://www.makemytrip.com/");
		//navigate to src
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		WebElement src = driver.findElement(By.xpath("//label[@for='fromCity']"));		
		Thread.sleep(2000);
		src.click();
		//inspect field
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("BOM");
		//navigate to city and click
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
		//navigate to destination
		driver.findElement(By.xpath("//span[.='To']")).click();
		//pass the value to to field
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("MAA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='Chennai, India']")).click();
		//navigate to departure
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		//select the date
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='"+depDate+"']")).click();
		System.out.println("flight booked");
	}

}
