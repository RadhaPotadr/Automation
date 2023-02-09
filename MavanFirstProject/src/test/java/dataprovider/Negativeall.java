package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class Negativeall extends SeleniumUtility {
	@DataProvider
	public Object[][] Actitime(){
		Object[][]data=new Object[1][4];
		data[0][0] = "chrome";
		data[0][1] = "radha";
		data[0][2] = "radga123";
		data[0][3] = "https://demo.actitime.com/";
		return data;
				}
	@DataProvider
	public Object[][] vtiger(){
		Object[][]data=new Object[1][4];
		data[0][0] = "firefox";
		data[0][1] = "anuja";
		data[0][2] = "ky123";
		data[0][3] = "https://demo.vtiger.com/vtigercrm/index.php";
		return data;
				}
	@DataProvider
	public Object[][] orangehrm(){
		Object[][]data=new Object[1][4];
		data[0][0] = "chrome";
		data[0][1] = "accl";
		data[0][2] = "rada123";
		data[0][3] = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		return data;
				}
  @Test(priority=1,dataProvider="Actitime")
  public void Actitime(String Browser,String username,String password,String AppUrl) {
	  WebDriver driver=setUp(Browser, AppUrl);
		typeInput(driver.findElement(By.id("username")), username);
		typeInput(driver.findElement(By.name("pwd")), password);
		performClick(driver.findElement(By.id("loginButton")));
		wait.until(ExpectedConditions.textToBe((By.className("errormsg")), "Username or Password is invalid. Please try again."));
		Assert.assertEquals(driver.findElement(By.className("errormsg")).getText(),  "Username or Password is invalid. Please try again.");
		driver.close();  
  }
  @Test(priority=2,dataProvider="orangehrm")
	 public void oranagehrmnegative(String Browser,String username,String password,String AppUrl) { 
	 driver=setUp("chrome", AppUrl);
	typeInput(driver.findElement(By.name("username")), username);
	typeInput(driver.findElement(By.name("password")), password);
	performClick(driver.findElement(By.className("orangehrm-login-button")));
	wait.until(ExpectedConditions.textToBe(By.cssSelector(".oxd-alert-content-text"), "Invalid credentials"));
	Assert.assertEquals(driver.findElement(By.cssSelector(".oxd-alert-content-text")).getText(),  "Invalid credentials");
	driver.close();
	 }
	 @Test(priority=3,dataProvider="vtiger")
	 public void vtigernegative(String Browser,String username,String password,String AppUrl) { 
	 driver=setUp("chrome", AppUrl);
	typeInput(driver.findElement(By.id("username")), username);
	typeInput(driver.findElement(By.id("password")), password);
	performClick(driver.findElement(By.className("buttonBlue")));
	wait.until(ExpectedConditions.textToBe(By.cssSelector("#validationMessage"), "Invalid credentials"));
	Assert.assertEquals(driver.findElement(By.cssSelector("#validationMessage")).getText(), "Invalid credentials" );
	driver.close(); 
	 }
}
