package db_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.comcast.generalUtility.PropertiesFileUtility;

public class VtigerwithExcel 
{
	public static void main(String[] args) throws Throwable 
	{
		PropertiesFileUtility flib=new PropertiesFileUtility();
		String BROWSER=flib.getPropertyKeyValue("browser");
		String URL=flib.getPropertyKeyValue("url");
		String USERNAME=flib.getPropertyKeyValue("username");
		String PASSWORD=flib.getPropertyKeyValue("password");
		
	//	ExcelFileUtility ex=new ExcelFileUtility();
		//String val = ex.getD("OrgName");
	
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
		Thread.sleep(5000);
		//System.out.println(val);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		//driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(val);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		String val2 = ele.getText();
		if(val2.contains("Naveen_Org2"))
		{
		System.out.println("organization created");
}
}
}

