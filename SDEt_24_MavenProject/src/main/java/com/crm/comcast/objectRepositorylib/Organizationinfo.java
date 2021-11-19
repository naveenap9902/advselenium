package com.crm.comcast.objectRepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationinfo 
{
	WebDriver driver;
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement verifyOrg;
	
	@FindBy(xpath="//span[@id='dtlview_Industry']")
	private WebElement verifyIndustries;
	
	@FindBy(xpath="//span[@id='dtlview_Type']")
	private WebElement verifyType;
	
	public WebElement getVerifyIndustries() {
		return verifyIndustries;
	}
	public WebElement getVerifyType() {
		return verifyType;
	}
	public Organizationinfo(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getVerifyOrg() {
		return verifyOrg;
	}

}
