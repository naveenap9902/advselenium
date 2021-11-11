package pgmadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hiddenddevision {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/?&utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab%7CMain_E%7Cclear%20trip%7Ce&dxid=EAIaIQobChMInpmgqMiZ8wIVUx0rCh31-geJEAAYASAAEgIlufD_BwE&gclid=EAIaIQobChMInpmgqMiZ8wIVUx0rCh31-geJEAAYASAAEgIlufD_BwE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Sat, Sep 25'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='30'])[2]")).click();
}
}
