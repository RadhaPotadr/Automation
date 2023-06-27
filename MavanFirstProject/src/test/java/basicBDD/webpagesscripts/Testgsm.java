package basicBDD.webpagesscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basicBDD.webpages.GoogleSearchPage;
import basicBDD.webpages.GoogleSearchResultPage;
import basicBDD.webpages.GsmarenMovilePage;
import utilities.SeleniumUtility;

public class Testgsm extends SeleniumUtility{
	GsmarenMovilePage getGsmarenMovilePage;
	@BeforeMethod
	public void startUp() {
		WebDriver driver=setUp("chrome","https://www.gsmarena.com");
		getGsmarenMovilePage=new GsmarenMovilePage(driver);
		getGsmarenMovilePage.CatchCookie();
				}
	
	@Test
	public void testGsmarenaSamasung() {
		getGsmarenMovilePage.samsungclick("SAMSUNG");
		
	}
	@AfterMethod
	public void ends() {
		cleanUp();
	}
}
	
