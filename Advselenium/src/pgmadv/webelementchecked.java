package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelementchecked {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/NAVEEN%20PATIL/OneDrive/Desktop/HTML%20Pages/allin.html");
		WebElement ele = driver.findElement(By.xpath("//input[@id='a5']"));
		boolean s = ele.isSelected();
		System.out.println(s);
		if(s)
		{
			System.out.println("it is seleced");
		}
		else
		{
			System.out.println("it is not selected");
		}
	}

}
