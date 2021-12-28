package Vtigerwithpomrepository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.comcast.generalUtility.BaseAnnotationClass;
import com.crm.comcast.objectRepositorylib.ContactPageinfo;
import com.crm.comcast.objectRepositorylib.ContactsPage;
import com.crm.comcast.objectRepositorylib.HomePage;
import com.crm.comcast.objectRepositorylib.OrganizationPage;
import com.crm.comcast.objectRepositorylib.Organizationinfo;
@Listeners(com.crm.comcast.generalUtility.ListnerImp.class)
public class CreateContactwithpomlibTest  extends BaseAnnotationClass
{
	@Test
	public void createContact() throws Throwable
	{	
			int ranNum = jav.getRanDomNumber();
			String contactName = exc.getData1("contact",1,3)+"_"+ranNum;
			HomePage home=new HomePage(driver);
			home.getCreatecontact().click();
			ContactsPage cp=new ContactsPage(driver);
			cp.getCreateNewContact().click();
			cp.getLastNamefd().sendKeys(contactName);
			cp.getSaveContactBtn().click();
			ContactPageinfo cpi=new ContactPageinfo(driver);
			String contactNameAct = cpi.getVerifyContact().getText();
			if(contactNameAct.contains(contactName))
			{
				System.out.println(contactName+" ==>contact is created");
			}else
			{
				System.out.println(contactName+" ==> contact not created");
			}
		
	}
	@Test
	public void CreatecontactwithOrgTest() throws Throwable
	{	
			int ranNum = jav.getRanDomNumber();
			String OrgName = exc.getData1("org",1,2)+"_"+ranNum;
			String lastName = exc.getData1("contact",1,3)+"_"+ranNum;	
			HomePage home=new HomePage(driver);
			OrganizationPage orgp=new OrganizationPage(driver);
			home.getOrgization().click();
			orgp.getCreateOrgBtn().click();
			orgp.getOrgNamefd().sendKeys(OrgName);
			orgp.getSaveButton().click();
			Organizationinfo orginfo=new Organizationinfo(driver);
			String text = orginfo.getVerifyOrg().getText();
			if(text.contains(OrgName))
			{
				System.out.println(OrgName+" organization is created");
			}
			//webd.waitForElementVisibility(driver, home.getCreatecontact());
			Thread.sleep(4000);
			home.getCreatecontact().click();
			ContactsPage cp=new ContactsPage(driver);
			cp.getCreateNewContact().click();
			cp.getLastNamefd().sendKeys(lastName);
			cp.getOrgLookUp().click();
			orgp.selectOrgName(OrgName);
			ContactPageinfo cpi=new ContactPageinfo(driver);
			String text1 = cpi.getVerifyContact().getText();
			if(text1.contains(lastName))
			{
				System.out.println("contact is created");
			}
}

}
