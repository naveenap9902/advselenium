package pgmadv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Storeinarrayandsort {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/NAVEEN%20PATIL/OneDrive/Desktop/HTML%20Pages/monthDD.html");
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		ArrayList<String> a1=new ArrayList<String>();
		for(WebElement we:opt)
		{
			String text=we.getText();
			a1.add(text);
		}
		Collections.sort(a1);
		for(String f:a1)
		{
			System.out.println(f);
		}
}
}