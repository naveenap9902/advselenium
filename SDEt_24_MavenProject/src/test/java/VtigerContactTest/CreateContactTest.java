package VtigerContactTest;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.comcast.generalUtility.ExcelFileUtility2;
import com.crm.comcast.generalUtility.PropertiesFileUtility;

public class CreateContactTest 
{
	/**
	 * 
	 * Create organization and verify and create contact and verify
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable 
	{
	//create object of general utility
		PropertiesFileUtility plib=new PropertiesFileUtility();
		ExcelFileUtility2 exc=new ExcelFileUtility2();
			Random ran=new Random();
			int ranNum = ran.nextInt(1000);
			String BROWSER=plib.getPropertyKeyValue("browser");
			String URL=plib.getPropertyKeyValue("url");
			String USERNAME=plib.getPropertyKeyValue("username");
			String PASSWORD=plib.getPropertyKeyValue("password");
			
			String OrgName = exc.getData1("org",1,2)+"_"+ranNum;
			String lastName = exc.getData1("contact",1,3)+"_"+ranNum;
		
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
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(URL);
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			driver.findElement(By.id("submitButton")).click();
			driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(OrgName);
			driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
			Thread.sleep(2000);
			//step2:-verify whether organization is created or not
			WebElement ele = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
			String val2 = ele.getText();
			if(val2.contains(OrgName))
			{
			System.out.println("organization created");
			}
			else
			{
				System.out.println("organization not created");
			}
			//step4:-specify the explicitly wait to check for visibility of element(active)
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']"))));
			driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']")).click();
			driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
			driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
			//step5:-get the id's of all the windows
			Set<String> set = driver.getWindowHandles();
			Iterator< String> itr=set.iterator();
			//step6:-switch the window to child browser
			while(itr.hasNext())
			{
				String windowid = itr.next();
				driver.switchTo().window(windowid);
				String title = driver.getTitle();
				if(title.contains("Accounts&action"))
					{
					break;
						}
			}
			//step7:-create contact
			driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(OrgName);
			driver.findElement(By.xpath("//input[@name='search']")).click();
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[.='"+OrgName+"']"))));
			driver.findElement(By.xpath("//a[.='"+OrgName+"']")).click();
			//step8:- switch the control back to parent window
			Set<String> set2 = driver.getWindowHandles();
			Iterator< String> itr2=set2.iterator();
			
			while(itr2.hasNext())
			{
				String windowid = itr2.next();
				driver.switchTo().window(windowid);
				String title = driver.getTitle();
				if(title.contains("Contacts&action"))
					{
					break;
						}
          	}
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
			//driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='dvHeaderText']"))));
			//Thread.sleep(4000);
			WebElement ele2 = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
			//step9:-check whether contact is created(Verify)
			String val3= ele2.getText();
			if(val3.contains(lastName))
			{
			System.out.println("Contact is created");
			}
			else
			{
				System.out.println("Contact not created");
			}
			//step10:-mouse over and signout
			Actions act=new Actions(driver);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))));
			
			act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
			driver.findElement(By.xpath("//a[.='Sign Out']")).click();
			
			driver.close();

}
}

