package parameterization.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class orangehrm extends SeleniumUtility {
	@Parameters({"browser1", "username1", "password1" })
	@Test
	public void orangehrmlogin (String browser,String username, String password) {
		setUp(browser,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeInput(driver.findElement(By.name("username")), username);
		driver.findElement(By.name("password")).sendKeys(password);
		performClick(driver.findElement(By.className("orangehrm-login-button")));
		Assert.assertEquals(getCurrentPageURL(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		driver.close();
  }
}
