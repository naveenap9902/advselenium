package pgmadv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Typecasrarraytotree {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/NAVEEN%20PATIL/OneDrive/Desktop/HTML%20Pages/monthDD.html");
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		ArrayList<String> a1=new ArrayList<String>();
		TreeSet<String> b1=new TreeSet<String>(a1);
 		for(WebElement we:opt)
		{
			String text=we.getText();
			b1.add(text);
		}
		for(String f:b1)
		{
			System.out.println(f);
	}
	}
}
