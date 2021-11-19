package com.crm.comcast.objectRepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPageinfo 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement verifyContact;
	
	public ContactPageinfo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getVerifyContact() {
		return verifyContact;
	}
}
