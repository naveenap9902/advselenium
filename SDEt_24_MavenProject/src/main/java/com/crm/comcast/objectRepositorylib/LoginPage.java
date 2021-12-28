package com.crm.comcast.objectRepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.generalUtility.PropertiesFileUtility;

public class LoginPage 
{
	public WebDriver driver;
	
	@FindBy(name="user_name")
	private WebElement usernamefd;
	
	@FindBy(name="user_password")
	private WebElement passwordfd;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernamefd() {
		return usernamefd;
	}

	public WebElement getPasswordfd() {
		return passwordfd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	PropertiesFileUtility plib=new PropertiesFileUtility();
	public void loginToApp() throws Throwable
	{
		driver.get(plib.getPropertyKeyValue("url"));
		usernamefd.sendKeys(plib.getPropertyKeyValue("username"));
		passwordfd.sendKeys(plib.getPropertyKeyValue("password"));
		loginbtn.click();
	}
	public void loginToApp(String username,String password) throws Throwable
	{
		
		usernamefd.sendKeys(username);
		passwordfd.sendKeys(password);
		loginbtn.click();
		
	}
}
