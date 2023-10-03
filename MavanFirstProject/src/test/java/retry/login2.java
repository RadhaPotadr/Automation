package retry;

import org.testng.annotations.Test;

import utilities.SeleniumUtility;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class login2 extends SeleniumUtility{
	WebDriverWait wait;
  @BeforeMethod
  public void beforeMethod() {
	  setUp("chrome","https://demo.actitime.com/");
	  wait = new WebDriverWait(driver, 20);
  }
  @Test (retryAnalyzer = retry.RetryAnalyzer.class)
  public void a() {
	  typeInput(driver.findElement(By.name("username")),"admin");
		typeInput(driver.findElement(By.name("pwd")), "manager");
		performClick(driver.findElement(By.id("loginButton"))); 
		Assert.assertEquals(getPageTitle("Time"), "actiTIME - Enter Time-Track");	
  }
  
  @Test (retryAnalyzer = retry.RetryAnalyzer.class)
  public void c() {
	  typeInput(driver.findElement(By.name("username")),"trainee");
		typeInput(driver.findElement(By.name("pwd")),"train");
		performClick(driver.findElement(By.id("loginButton")));
		Assert.assertEquals(getPageTitle("Time"), "actiTIME - Enter Time-Track");	
  }
		
  @Test (retryAnalyzer = retry.RetryAnalyzer.class)
  public void d()  {
	  typeInput(driver.findElement(By.name("username")), "username3");
		typeInput(driver.findElement(By.name("pwd")), "password3");
		performClick(driver.findElement(By.id("loginButton")));
		wait.until(ExpectedConditions.textToBe((By.className("errormsg")), "Username or Password is invalid. Please try again."));
		Assert.assertEquals(driver.findElement(By.className("errormsg")).getText(), "Username or Password is invalid. Please try again.");
		
  }
  @AfterMethod
  public void afterTest() {
	  driver.close();
  }
}
