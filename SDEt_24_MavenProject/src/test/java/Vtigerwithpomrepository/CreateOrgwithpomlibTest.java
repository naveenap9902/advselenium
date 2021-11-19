package Vtigerwithpomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.comcast.generalUtility.BaseAnnotationClass;
import com.crm.comcast.generalUtility.ExcelFileUtility2;
import com.crm.comcast.generalUtility.JavaGenericUtility;
import com.crm.comcast.generalUtility.PropertiesFileUtility;
import com.crm.comcast.generalUtility.WebDriverGenericUtility;
import com.crm.comcast.objectRepositorylib.HomePage;
import com.crm.comcast.objectRepositorylib.LoginPage;
import com.crm.comcast.objectRepositorylib.OrganizationPage;
import com.crm.comcast.objectRepositorylib.Organizationinfo;

public class CreateOrgwithpomlibTest extends BaseAnnotationClass
{
	@Test
	public void createOrg()  throws Throwable {
	
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
			System.out.println("organization is created");
		}
}
	@Test
	public void createOrgwithIndusType() throws Throwable 
	{	
			int ranNum = jav.getRanDomNumber();
			String OrgName = exc.getData1("org",1,2)+"_"+ranNum;
			String lastName = exc.getData1("contact",1,3)+"_"+ranNum;
			String indus = exc.getData1("org",4, 3);
			String type = exc.getData1("org",4, 4);
			HomePage home=new HomePage(driver);
			OrganizationPage orgp=new OrganizationPage(driver);
			home.getOrgization().click();
			orgp.getCreateOrgBtn().click();
			orgp.getOrgNamefd().sendKeys(OrgName);
			webd.select(orgp.getIndusDropdown(), indus);
			webd.select(orgp.getAccDropdown(), type);
			orgp.getSaveButton().click();
			Organizationinfo orginfo=new Organizationinfo(driver);
			String text = orginfo.getVerifyOrg().getText();
			if(text.contains(OrgName))
			{
				System.out.println("organization is created");
			}else{
				System.out.println("organazation not created");
			}
			String indusAct = orginfo.getVerifyIndustries().getText().trim();
			if(indusAct.equals(indus))
			{
				System.out.println(indus+" ==> industries is verified");
			}else{
				System.out.println(indus+" ==. industries is not verified");
			}
			String typeAct = orginfo.getVerifyType().getText().trim();
			if(typeAct.equals(type))
			{
				System.out.println(type+" type is verified");
			}else
			{
				System.out.println(type+" type is not verified");
			}			
	}
}
