package TakesScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.utils.FileNameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.FileUtils;

public class Takescreenshotas {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Sws/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("E:\\scree1.jpeg");
		org.apache.commons.io.FileUtils.copyFile(sc, dst);
	}

}
