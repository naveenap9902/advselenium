package com.crm.comcast.objectRepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.generalUtility.WebDriverGenericUtility;

public class OrganizationPage 
{
	WebDriver driver;
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrgBtn;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgNamefd;
	
	@FindBy(name="industry")
	private WebElement indusDropdown;
	
	@FindBy(name="accounttype")
	private WebElement accDropdown;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/div[1]/input[1]")
	private WebElement saveButton;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement serchBtn;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement serachfd;
	
	

	public WebElement getSerachfd() {
		return serachfd;
	}

	public WebElement getSerchBtn() {
		return serchBtn;
	}
	
	public OrganizationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateOrgBtn() {
		return createOrgBtn;
	}

	public WebElement getOrgNamefd() {
		return orgNamefd;
	}

	public WebElement getIndusDropdown() {
		return indusDropdown;
	}

	public WebElement getAccDropdown() {
		return accDropdown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	WebDriverGenericUtility webd=new WebDriverGenericUtility();
	
	
	public void selectOrgName(String OrgName)
	{
		webd.switchToWindow(driver, "Accounts&action");
		//OrganizationPage orgp=new OrganizationPage(driver);
		getSerachfd().sendKeys(OrgName);
		getSerchBtn().click();
		driver.findElement(By.xpath("//a[.='"+OrgName+"']")).click();
		webd.switchToWindow(driver, "Contacts&action");
		ContactsPage cp=new ContactsPage(driver);
		cp.getSaveContactBtn().click();
	}
	
	
	

}
