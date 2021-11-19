package com.crm.comcast.objectRepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.generalUtility.WebDriverGenericUtility;

public class HomePage 
{
	WebDriver driver;
	@FindBy(linkText="Organizations")
	private WebElement orgization;
	
	@FindBy(linkText="Products")
	private WebElement product;
	
	@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']")
	private WebElement createcontact;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administration;
	
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signout;

	 public HomePage(WebDriver driver)
	{
	this.driver=driver;
		
	PageFactory.initElements(driver,this);
	}

	public WebElement getOrgization() {
		return orgization;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getCreatecontact() {
		return createcontact;
	}

	public WebElement getAdministration() {
		return administration;
	}

	public WebElement getSignout() {
		return signout;
	}
	WebDriverGenericUtility webd=new WebDriverGenericUtility();
	public void signOut()
	{
	webd.mouseOver(driver, administration);
	signout.click();
	}

}
