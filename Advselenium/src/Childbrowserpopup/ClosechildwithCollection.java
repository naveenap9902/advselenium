package Childbrowserpopup;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClosechildwithCollection {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(7000);
		String parent_id = driver.getWindowHandle();
		Set<String> alltabs = driver.getWindowHandles();
	   int count = alltabs.size();
	   System.out.println(count);
	   alltabs.remove(parent_id);
	   int count1=alltabs.size();
	   System.out.println(count1);
	   for(String a1:alltabs)
	   {
		   driver.switchTo().window(a1);
		   String s1=driver.getTitle();
		   System.out.println(s1);
		   Thread.sleep(2000);
		   driver.close();
	   }
}
}
