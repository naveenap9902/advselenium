package pgmadv;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkforoption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/NAVEEN%20PATIL/OneDrive/Desktop/HTML%20Pages/monthDD.html");
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		ArrayList<String> a1=new ArrayList<String>();
		for(WebElement f1:opt)
		{
		String	 text=f1.getText();
		a1.add(text);
		}
		a1.remove("feb");
		if(a1.contains("jan"))
		{
			System.out.println("jan is present");
		}
		else
		{
			System.out.println("it is not present");
		}
		if(a1.contains("feb"))
		{
			System.out.println("feb is present");
		}

}
}
