package grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class Allinone extends SeleniumUtility {
	String appUrl;
	String userName;
	String password;
	 @Test(groups = "Positive")
	  public void Actitimepositive() {
		 	appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 3, 0);
			userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC",3, 1);
			password=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 3, 2);
			WebDriver driver=setUp("chrome", appUrl);	
			typeInput(driver.findElement(By.id("username")), userName);
			typeInput(driver.findElement(By.name("pwd")), password);
			performClick(driver.findElement(By.id("loginButton")));
			if(getPageTitle("actiTIME - Enter Time-Track").equals("actiTIME - Enter Time-Track"))  {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 3, 5,"passed");
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 3, 4,"actiTIME - Enter Time-Track");
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 3, 5,"failed");
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 3, 4,"actiTIME - Login");	
			}
		  driver.close();
	  }
	 @Test(groups = "Positive")
		 public void vtigerpositive() { 
	     appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 1, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC",1, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 1, 2);
		 driver=setUp("chrome", appUrl);
		typeInput(driver.findElement(By.id("username")), userName);
		typeInput(driver.findElement(By.id("password")), password);
		performClick(driver.findElement(By.className("buttonBlue")));
		if(getPageTitle("Dashboard").equals("Dashboard"))  {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 1, 5,"passed");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 1, 4,"Dashboard");
		}else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 1, 5,"failed");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 1, 4,"vtiger");	
		}
	  driver.close();	 
		 }
	 @Test(groups = "Positive")
	 public void oranagehrmpositive() { 
     appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 5, 0);
	userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC",5, 1);
	password=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 5, 2);
	 driver=setUp("chrome", appUrl);
	typeInput(driver.findElement(By.name("username")), userName);
	typeInput(driver.findElement(By.name("password")), password);
	performClick(driver.findElement(By.className("orangehrm-login-button")));
	if(getCurrentPageURL().contains("dashboard"))  {
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 5, 5,"passed");
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 5, 4,getCurrentPageURL());
	}else {
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 5, 5,"failed");
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 5, 4,getCurrentPageURL());	
	}
  driver.close();	 
	 }
	 @Test(groups = "Negative")
	 public void oranagehrmnegative() { 
     appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 6, 0);
	userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC",6, 1);
	password=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 6, 2);
	 driver=setUp("chrome", appUrl);
	typeInput(driver.findElement(By.name("username")), userName);
	typeInput(driver.findElement(By.name("password")), password);
	performClick(driver.findElement(By.className("orangehrm-login-button")));
	wait.until(ExpectedConditions.textToBe(By.cssSelector(".oxd-alert-content-text"), "Invalid credentials"));
	if(driver.findElement(By.cssSelector(".oxd-alert-content-text")).getText().equals("Invalid credentials"))  {
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 6, 5,"failed");
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 6, 4,getCurrentPageURL());
		}else {
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 6, 5,"passed");
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 6, 4,getCurrentPageURL());
	}
  driver.close();	 
	 }
	 @Test(groups = "Negative")
	 public void vtigernegative() { 
     appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 2, 0);
	userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC",2, 1);
	password=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 2, 2);
	 driver=setUp("chrome", appUrl);
	typeInput(driver.findElement(By.id("username")), userName);
	typeInput(driver.findElement(By.id("password")), password);
	performClick(driver.findElement(By.className("buttonBlue")));
	wait.until(ExpectedConditions.textToBe(By.cssSelector("#validationMessage"), "Invalid credentials"));
	if(driver.findElement(By.cssSelector("#validationMessage")).getText().equals("Invalid credentials"))  {
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 2, 5,"failed");
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 2, 4,"vtiger");
	}else {	
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 2, 5,"passed");
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 2, 4,"Dashboard");
	}
  driver.close();	 
	 }
  @Test(groups = "Negative")
  public void Actitimenegative() {
	  appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 4, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC",4, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 4, 2);
		WebDriver driver=setUp("chrome", appUrl);	
		typeInput(driver.findElement(By.id("username")), userName);
		typeInput(driver.findElement(By.name("pwd")), password);
		performClick(driver.findElement(By.id("loginButton")));
		wait.until(ExpectedConditions.textToBe((By.className("errormsg")), "Username or Password is invalid. Please try again."));
		if(driver.findElement(By.className("errormsg")).getText().equals("Username or Password is invalid. Please try again.")) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 4, 5,"Failed");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 4, 4,"actiTIME - Login");	
		}else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 4, 5,"passed");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "TC", 4, 4,"actiTIME - Enter Time-Track");
		}
		driver.close();
  }
}
