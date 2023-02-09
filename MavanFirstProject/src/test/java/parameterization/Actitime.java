package parameterization;

import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Actitime extends SeleniumUtility{
  
	@Parameters({"browser2", "username2", "password2" })
  @Test
  public void actitime(String browser,String username, String password) {
		setUp(browser,"https://demo.actitime.com/");
		typeInput(driver.findElement(By.id("username")), username);
		typeInput(driver.findElement(By.name("pwd")), password);
		performClick(driver.findElement(By.id("loginButton")));
		Assert.assertEquals(getPageTitle("actiTIME - Enter Time-Track"), "actiTIME - Enter Time-Track");
		driver.close();
  }
	
	
}
