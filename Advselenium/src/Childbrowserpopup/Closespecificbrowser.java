package Childbrowserpopup;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Closespecificbrowser {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(7000);
		Set<String> alltabs = driver.getWindowHandles();
		for(String a1:alltabs)
		{
			driver.switchTo().window(a1);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.equals("Tech Mahindra"))
			{
				driver.close();
			}
		}
}
}
