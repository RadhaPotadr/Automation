package actitime;

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

public class login extends SeleniumUtility{
	WebDriverWait wait;
  @BeforeMethod
  public void beforeMethod() {
	  setUp("chrome","https://demo.actitime.com/");
	  wait = new WebDriverWait(driver, 20);
  }
  @Test
  public void a() {
	  typeInput(driver.findElement(By.name("username")), getValueFromPropertyFile(".\\src\\test\\resources\\propertyfile\\Actitime.properties","username"));
		typeInput(driver.findElement(By.name("pwd")), getValueFromPropertyFile(".\\src\\test\\resources\\propertyfile\\Actitime.properties","password"));
		performClick(driver.findElement(By.id("loginButton"))); 
		Assert.assertEquals(getPageTitle("Time"), "actiTIME - Enter Time-Track");	
  }
  @Test
  public void b() {
	  typeInput(driver.findElement(By.name("username")), getValueFromPropertyFile(".\\src\\test\\resources\\propertyfile\\Actitime.properties","username1"));
		typeInput(driver.findElement(By.name("pwd")), getValueFromPropertyFile(".\\src\\test\\resources\\propertyfile\\Actitime.properties","password1"));
		performClick(driver.findElement(By.id("loginButton"))); 
		Assert.assertEquals(getPageTitle("Time"), "actiTIME - Enter Time-Track");
  }
  @Test
  public void c() {
	  typeInput(driver.findElement(By.name("username")), getValueFromPropertyFile(".\\src\\test\\resources\\propertyfile\\Actitime.properties","username2"));
		typeInput(driver.findElement(By.name("pwd")), getValueFromPropertyFile(".\\src\\test\\resources\\propertyfile\\Actitime.properties","password2"));
		performClick(driver.findElement(By.id("loginButton")));
		wait.until(ExpectedConditions.textToBe((By.className("errormsg")), "Username or Password is invalid. Please try again."));
		//Assert.assertTrue(driver.findElement(By.className("errormsg")).isDisplayed());
		Assert.assertEquals(driver.findElement(By.className("errormsg")).getText(), "Username or Password is invalid. Please try again.");
		//Assert.assertNotEquals(getPageTitle("Time"), "actiTIME - Enter Time-Track");
  }
  @Test
  public void d()  {
	  typeInput(driver.findElement(By.name("username")), getValueFromPropertyFile(".\\src\\test\\resources\\propertyfile\\Actitime.properties","username3"));
		typeInput(driver.findElement(By.name("pwd")), getValueFromPropertyFile(".\\src\\test\\resources\\propertyfile\\Actitime.properties","password3"));
		performClick(driver.findElement(By.id("loginButton")));
		wait.until(ExpectedConditions.textToBe((By.className("errormsg")), "Username or Password is invalid. Please try again."));
		Assert.assertEquals(driver.findElement(By.className("errormsg")).getText(), "Username or Password is invalid. Please try again.");
		//Assert.assertTrue(driver.findElement(By.className("errormsg")).isDisplayed());
		//Assert.assertNotEquals(getPageTitle("Time"), "actiTIME - Enter Time-Track");
  }
  @AfterMethod
  public void afterTest() {
	  driver.close();
  }
}
