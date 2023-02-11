package basicBDD.webpagesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basicBDD.webpages.VtigerCreateLeadPage;
import basicBDD.webpages.VtigerDeleteLeadPage;
import basicBDD.webpages.VtigerHomePage;
import basicBDD.webpages.VtigerLeadModificationPage;
import basicBDD.webpages.VtigerLoginPage;
import utilities.SeleniumUtility;

public class Vtiger extends SeleniumUtility {

	VtigerLoginPage getVtigerLoginPage;
	VtigerHomePage getVtigerHomePage;
	VtigerCreateLeadPage getVtigerCreateLeadPage;
	VtigerLeadModificationPage getVtigerLeadModificationPage;
	VtigerDeleteLeadPage getVtigerDeleteLeadPage;
	Actions action = null;
	@BeforeMethod
	public void prerequisite() {
		WebDriver driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage=new VtigerLoginPage(driver);
		getVtigerHomePage=new VtigerHomePage(driver);
		getVtigerCreateLeadPage=new VtigerCreateLeadPage(driver);
		getVtigerLeadModificationPage=new VtigerLeadModificationPage(driver);
		getVtigerDeleteLeadPage= new VtigerDeleteLeadPage(driver);
		getVtigerLoginPage.login("admin", "Test@123");
		getVtigerHomePage.goToLeadPage();
	}
	@Test(priority=1)
	public void leadCreation() {
		getVtigerCreateLeadPage.addLead("radha", "potdar", "Construction", "Contact in Future");
		//wait.until(ExpectedConditions.elementToBeClickable(getVtigerHomePage.Leads));
		//getVtigerHomePage.Leads.click();
		getVtigerHomePage.goToLeadPage();
		getVtigerHomePage.createValidation(getVtigerHomePage.leadnames);
		Assert.assertTrue(getVtigerHomePage.leadnames.contains("radha"),"lead created validation");	
	}
	@Test(priority=2,dependsOnMethods="leadCreation")
	public void leadmodifition() {
		getVtigerLeadModificationPage.ModifyLead("7887659394");
		getVtigerCreateLeadPage.savelead.click();
	//	getVtigerHomePage.Leads.click();
		getVtigerHomePage.goToLeadPage();
		Assert.assertEquals(getVtigerHomePage.modifiedLead.getText(), "7887659394","lead modification validation");
	}
	@Test(priority=3,dependsOnMethods="leadCreation")
	public void leadDeletion() {
			getVtigerDeleteLeadPage.deleteLead();
			//getVtigerHomePage.Leads.click();
			//getVtigerHomePage.goToLeadPage();
			getVtigerHomePage.createValidation(getVtigerHomePage.leadnames);
			Assert.assertFalse(getVtigerHomePage.leadnames.contains("radha"),"lead created validation");
	}
	@AfterMethod
	public void postrequisite() {
		driver.close();
}}
