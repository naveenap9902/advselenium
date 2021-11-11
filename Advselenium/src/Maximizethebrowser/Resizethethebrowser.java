package Maximizethebrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Resizethethebrowser 
{ 
	public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Dimension d=new Dimension(300,400);
	driver.manage().window().setSize(d);

}
}