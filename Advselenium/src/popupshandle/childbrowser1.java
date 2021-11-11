package popupshandle;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class childbrowser1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(4000);
		Set<String> alltabs = driver.getWindowHandles();
		int count = alltabs.size();
		System.out.println(count);
		for(String f1:alltabs)
		{
			System.out.println(f1);
		}
		driver.quit();
}
}
