package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtubeclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Sws/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='ytd-searchbox']")).sendKeys("kgf trailer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']")).click();
	}
}
		
	