package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/NAVEEN%20PATIL/OneDrive/Desktop/HTML%20Pages/monthDD.html");
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("d");
		Thread.sleep(2000);
		s.selectByVisibleText("june");
		Thread.sleep(2000);
		s.deselectAll();
		

}
}
