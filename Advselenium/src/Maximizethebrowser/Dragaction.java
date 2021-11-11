package Maximizethebrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dragaction 
{
	public static void main(String[] args) 
	{ 
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Point p=new Point(300,400);
		driver.manage().window().setPosition(p);		
	}

}
