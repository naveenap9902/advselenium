package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelementmeth1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/NAVEEN%20PATIL/OneDrive/Desktop/HTML%20Pages/allin.html");
		WebElement ele = driver.findElement(By.xpath("//input[@id='a1']"));
		boolean e = ele.isEnabled();
		System.out.println(e);
		if(e)
		{
			System.out.println("it is enabled");
		}
		else
		{
			System.out.println("it is disabled");
		}
	}

}
