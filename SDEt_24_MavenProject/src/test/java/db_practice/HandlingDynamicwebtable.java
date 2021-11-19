package db_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.comcast.generalUtility.PropertiesFileUtility;

public class HandlingDynamicwebtable 
{
	@Test
	public void handlewebTable() throws Throwable
	{
		PropertiesFileUtility flib=new PropertiesFileUtility();
		String BROWSER=flib.getPropertyKeyValue("browser");
		String URL=flib.getPropertyKeyValue("url");
		String USERNAME=flib.getPropertyKeyValue("username");
		String PASSWORD=flib.getPropertyKeyValue("password");
		WebDriver driver=null;
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]/input"));
		for(int i=1;i<list.size()-1;i++)
		{
			list.get(i).click();
		}
		Thread.sleep(2000);
		list.get(list.size()-1).click();
		//select only 5th checkbox
		driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[7]/td[1]/input")).click();
		//get all the organization details
		List<WebElement> list1 = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
	/*	for(int i=1;i<list1.size()-1;i++)
		{
			System.out.println(list1.get(i).getText());
		}*/
		//verify the organization and delete the organization
		String OrgName = list1.get(6).getText();
		System.out.println(OrgName);
		for(int i=1;i<list.size()-1;i++)
		{
			if(OrgName.equals(list1.get(i).getText()))
			{
				driver.findElement(By.xpath("//a[.='"+OrgName+"']/../../td[8]/a[.='del']")).click();
				System.out.println("organizatin deleted");
				break;
			}
		}
		
	}

}
