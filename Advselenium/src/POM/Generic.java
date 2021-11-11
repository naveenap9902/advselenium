package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Generic 
{
	//declaration
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	@FindBy(xpath="//input[@id='password']")
	private WebElement pwd;
	
	//initialization
	public Generic(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void username1(String un)
	{
		username.sendKeys(un);
	}
	public void password1(String p1)
	{
		pwd.sendKeys(p1);
	}
	public void loginsumbit()
	{
		submit.click();
	}
}
