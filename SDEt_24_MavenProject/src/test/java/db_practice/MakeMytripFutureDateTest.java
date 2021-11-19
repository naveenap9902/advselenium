package db_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MakeMytripFutureDateTest 
{
	@Test
	public void makeMyTripFutureTest() throws InterruptedException
	{
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
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Fri Jan 21 2022']")).click();
		System.out.println("flight booked");
	}

}
