package Childbrowserpopup;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Closeparentbrowser {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(7000);
		String parent_id = driver.getWindowHandle();
		Set<String> alltabs = driver.getWindowHandles();
		for(String a1:alltabs)
		{
			driver.switchTo().window(a1);
			String text = driver.getTitle();
			System.out.println(text);
			Thread.sleep(2000);
			if(a1.equals(parent_id))
			{
				driver.close();
			}
		}
}
}
