package basicBDD.webpagesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import basicBDD.webpages.OrangeHrmAddNewPIMPage;
import basicBDD.webpages.OrangeHrmHomePage;
import basicBDD.webpages.OrangeHrmLoginPage;
import basicBDD.webpages.OrangeHrmPIMPage;
import basicBDD.webpages.OrangeHrmPIMUpdatePage;
import utilities.SeleniumUtility;

public class OrangeHrm extends SeleniumUtility {

	OrangeHrmLoginPage getOrangeHrmLoginPage;
	OrangeHrmHomePage getOrangeHrmHomePage;
	OrangeHrmPIMPage getOrangeHrmPIMPage;
	OrangeHrmAddNewPIMPage getOrangeHrmAddNewPIMPage;
	OrangeHrmPIMUpdatePage getOrangeHrmPIMUpdatePage;

	@BeforeMethod
	public void prerequisite() {
		WebDriver driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getOrangeHrmLoginPage = new OrangeHrmLoginPage(driver);
		getOrangeHrmHomePage = new OrangeHrmHomePage(driver);
		getOrangeHrmPIMPage = new OrangeHrmPIMPage(driver);
		getOrangeHrmAddNewPIMPage = new OrangeHrmAddNewPIMPage(driver);
		getOrangeHrmPIMUpdatePage = new OrangeHrmPIMUpdatePage(driver);
		getOrangeHrmLoginPage.UserNameInput("Admin");
		getOrangeHrmLoginPage.passwordInput("admin123");
		getOrangeHrmLoginPage.Loginclick();
		getOrangeHrmHomePage.PIMclick();
	}
	@Test(priority=1)
	public void testPIMCreation() {
		getOrangeHrmPIMPage.AddPIMclick();
		getOrangeHrmAddNewPIMPage.FirstNameInput("karen");
		getOrangeHrmAddNewPIMPage.LastNameInput("jasaon");
		getOrangeHrmAddNewPIMPage.EmpIdInput("54336");
		getOrangeHrmAddNewPIMPage.SavePIMClick();
		wait.until(ExpectedConditions.elementToBeClickable(getOrangeHrmAddNewPIMPage.FirstName));
		getOrangeHrmHomePage.PIMclick();
		getOrangeHrmPIMPage.getEmployee(getOrangeHrmPIMPage.employees);
		Assert.assertTrue(getOrangeHrmPIMPage.empName.contains("54336"), "PIM is created sucessfully");
	}
	@Test(priority=2,dependsOnMethods="testPIMCreation")
	public void testPIMModofication() {
		getOrangeHrmPIMPage.checkboxClick();
		getOrangeHrmPIMPage.editClick();
		getOrangeHrmPIMUpdatePage.job.click();
		wait.until(ExpectedConditions.elementToBeClickable(getOrangeHrmPIMUpdatePage.jobselecter));
		getOrangeHrmPIMUpdatePage.jobselecter.click();
		getOrangeHrmPIMUpdatePage.JobTitleUpdate(getOrangeHrmPIMUpdatePage.jobselecter, "QA Engineer");
		getOrangeHrmAddNewPIMPage.SavePIMClick();
		getOrangeHrmHomePage.PIMclick();
		Assert.assertEquals(getOrangeHrmHomePage.PIMupdate.getText(), "QA Engineer", "PIM is updated sucessfully");
	}
	@Test(priority=3,dependsOnMethods="testPIMCreation")
	public void testPIMDeletion() {
		getOrangeHrmPIMPage.checkboxClick();
		getOrangeHrmPIMPage.delete.click();
		getOrangeHrmPIMPage.Confirmdelete.click();
		getOrangeHrmHomePage.PIMclick();
		getOrangeHrmHomePage.PIMsearch("54336");
		getOrangeHrmHomePage.searchbutton.click();
		Assert.assertEquals(getOrangeHrmHomePage.PIMDeletion.getText(), "No Records Found", "PIM deletion validation");		
	}
	@AfterMethod
	public void postrequisite() {
		driver.close();
}}