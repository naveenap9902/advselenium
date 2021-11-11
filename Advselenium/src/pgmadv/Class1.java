package pgmadv;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/NAVEEN%20PATIL/OneDrive/Desktop/HTML%20Pages/textbox.html");
			List<WebElement> box = driver.findElements(By.xpath("//input"));
			int count=box.size();
			System.out.println(count);
			for(WebElement we:box)
			{
				we.sendKeys("abc");
				Thread.sleep(1000);
			}
			for(int i=count-1;i>=0;i--)
			{
				WebElement we1 = box.get(i);
				we1.clear();
				Thread.sleep(1000);
			}
			
		
	}

}
