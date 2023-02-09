package wbDDT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class Actitimelogin extends SeleniumUtility{
	String appUrl;
	String userName;
	String password;
	
	@BeforeTest
	public void getData() {
		appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "Sheet1", 3, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "Sheet1", 3, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\excel\\AppTest.xlsx", "Sheet1", 3, 2);
	}

	@Test
	public void actitimeLogin() {
			WebDriver driver=setUp("chrome", appUrl);	
			typeInput(driver.findElement(By.id("username")), userName);
			typeInput(driver.findElement(By.name("pwd")), password);
			performClick(driver.findElement(By.id("loginButton")));
			wait.until(ExpectedConditions.textToBe((By.className("errormsg")), "Username or Password is invalid. Please try again."));
			if(driver.findElement(By.className("errormsg")).getText().equals("Username or Password is invalid. Please try again.")) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "Sheet1", 3, 3,"Failed");
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excel\\AppTest.xlsx", "Sheet1", 3, 3,"passed");
			}
			
	}
	@AfterTest
	public void cleanUp1() {
		cleanUp();
	}
}

