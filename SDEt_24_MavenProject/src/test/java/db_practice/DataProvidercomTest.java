package db_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.comcast.generalUtility.WebDriverGenericUtility;

public class DataProvidercomTest 
{
	@Test(dataProvider="product")
	public void sesrchProduct(String product) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		WebDriverGenericUtility webd=new WebDriverGenericUtility();
		webd.waitUntilPageLoad(driver);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(product);
		driver.findElement(By.xpath("input[@id='nav-search-submit-button']")).click();
		Thread.sleep(1000);
		driver.quit();
	}
	@DataProvider
	public Object[][] product()
			{
		      Object[][] abc=new Object[5][1];
		      abc[0][0]="samsung m20";
		      abc[1][0]="iphone 10";
		      abc[2][0]="samsung s20 ultra";
		      abc[3][0]="mi 11 pro";
		      abc[4][0]="dell laptop";
		      return abc;
			}
}
