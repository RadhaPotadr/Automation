package dataprovider.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class Allinone extends SeleniumUtility {
	@DataProvider
	public Object[][] orangehrm() {
		Object[][] obj = new Object[1][4];
		// row1
		obj[0][0] = "chrome";
		obj[0][1] = "Admin";
		obj[0][2] = "admin123";
		obj[0][3] = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		return obj;
	}
	@DataProvider
	public Object[][] Actitime() {
		Object[][] obj = new Object[1][4];
		// row1
		obj[0][0] = "chrome";
		obj[0][1] = "admin";
		obj[0][2] = "manager";
		obj[0][3] = "https://demo.actitime.com/";
		return obj;
	}
	@DataProvider
	public Object[][] vtiger() {
		Object[][] obj = new Object[1][4];
		// row1
		obj[0][0] = "chrome";
		obj[0][1] = "admin";
		obj[0][2] = "Test@123";
		obj[0][3] = "https://demo.vtiger.com/vtigercrm/index.php";
		return obj;
	}
	
	 @Test(priority=1,dataProvider="Actitime")
	  public void Actitime(String browser, String username, String password, String appUrl) {	
		 WebDriver driver=setUp(browser, appUrl);
			typeInput(driver.findElement(By.id("username")), username);
			typeInput(driver.findElement(By.name("pwd")), password);
			performClick(driver.findElement(By.id("loginButton")));
			Assert.assertEquals(getPageTitle("actiTIME - Enter Time-Track"), "actiTIME - Enter Time-Track");
			driver.close();
	  }
	 @Test(priority=2,dataProvider="vtiger")
		 public void vtiger(String browser, String username, String password, String appUrl) {  
		 WebDriver driver=setUp(browser, appUrl);
		typeInput(driver.findElement(By.id("username")), username);
		typeInput(driver.findElement(By.id("password")), password);
		performClick(driver.findElement(By.className("buttonBlue")));
		Assert.assertEquals(getPageTitle("Dashboard"), "Dashboard");
		driver.close();	 
		 }
	 @Test(priority=3,dataProvider="orangehrm")
	 public void oranagehrm(String browser, String username, String password, String appUrl) { 
		 WebDriver driver=setUp(browser, appUrl);
	typeInput(driver.findElement(By.name("username")), username);
	typeInput(driver.findElement(By.name("password")), password);
	performClick(driver.findElement(By.className("orangehrm-login-button")));
	Assert.assertEquals(getCurrentPageURL(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	driver.close();	 
	 }
}
