package db_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.comcast.generalUtility.PropertiesFileUtility;

public class Sampletigerpgm 
{
	public static void main(String[] args) throws Throwable {
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
		WebElement ele = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		String val = ele.getText();
		if(val.contains("Naveen_org"))
		{
		System.out.println("organization created");
		}
	}

}
