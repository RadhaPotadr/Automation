package parameterization.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class Vtiger extends SeleniumUtility{
	@Parameters({"browser", "username", "password" })
	@Test
	public void vtigerlogin(String browser,String username, String password) {
		setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password,Keys.ENTER);
		Assert.assertEquals(getPageTitle("Dashboard"), "Dashboard");
		driver.close();
  }
}
