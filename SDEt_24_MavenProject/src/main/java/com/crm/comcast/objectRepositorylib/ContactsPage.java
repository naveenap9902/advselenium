package com.crm.comcast.objectRepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage 
{
	WebDriver driver;
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createNewContact;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNamefd;
	
@FindBy(xpath="//input[@name='account_name']/following-sibling::img")
private WebElement orgLookUp;

@FindBy(xpath="//tbody/tr[1]/td[1]/div[1]/input[1]")
private WebElement saveContactBtn;
public ContactsPage(WebDriver driver) 
{
this.driver=driver;
PageFactory.initElements(driver, this);
}


public WebElement getCreateNewContact() {
	return createNewContact;
}


public WebElement getLastNamefd() {
	return lastNamefd;
}
public WebElement getOrgLookUp() {
	return orgLookUp;
}
public WebElement getSaveContactBtn() {
	return saveContactBtn;
}


}
