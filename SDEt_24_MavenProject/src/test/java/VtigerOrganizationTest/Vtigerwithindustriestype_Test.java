package VtigerOrganizationTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import com.crm.comcast.generalUtility.ExcelFileUtility2;


public class Vtigerwithindustriestype_Test 
{
@Test
public void CreateOrgwithIndustry() throws Throwable
{
	Random ran=new Random();
	int ranNum = ran.nextInt(1000);
	String BROWSER=System.getProperty("browser");
	String URL=System.getProperty("url");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");		
	ExcelFileUtility2 ex2=new ExcelFileUtility2();
	String OrgName = ex2.getData1("org",4, 2)+"_"+ranNum;
	String indus = ex2.getData1("org",4, 3);
	String type = ex2.getData1("org",4, 4);
	/*String OrgName="naveen_Org";
	String indus="Energy";
	String type="Press";*/
	
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
		WebElement ele1 = driver.findElement(By.name("industry"));
		Select s1=new Select(ele1);
		s1.selectByVisibleText(indus);
		WebElement ele2 = driver.findElement(By.name("accounttype"));
		Select s2=new Select(ele2);
		s2.selectByVisibleText(type);
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

