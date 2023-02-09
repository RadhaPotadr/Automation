package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import utilities.SeleniumUtility;

public class GoogleApplicationWithBeforeAfterTest extends SeleniumUtility {

	WebDriver driver;
	@BeforeTest
	public void startUp() {
		driver = setUp("chrome", "https://www.google.com/");
	}
	@Test
	public void testGoogleLandingPage() {
		String expectedTitle = "Google";
		String actualTitle = getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Google Search page not opened or its title got changed");
	}
	@Test
	public void testSearch() {
		driver.findElement(By.id("L2AGLb")).click();
		  WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("SQL", Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.titleContains("SQL"));
		Assert.assertTrue(getPageTitle().contains("SQL"), "SQL search is failed");;
	}
	@AfterTest
	public void tearDown() {
		cleanUp();
	}
}
/**
 * precondition: open browser and enter google url
 * 			TC1: validation google page
 * 			TC2: search SQL and validation search result page
 * post-condition: close the browser 
 */
