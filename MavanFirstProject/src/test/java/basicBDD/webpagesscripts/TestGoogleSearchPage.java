package basicBDD.webpagesscripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basicBDD.webpages.GoogleSearchPage;
import basicBDD.webpages.GoogleSearchResultPage;
import utilities.SeleniumUtility;

public class TestGoogleSearchPage extends SeleniumUtility{
	
	GoogleSearchPage getGoogleSearchPage;
	GoogleSearchResultPage getGoogleSearchResultPage;
	@BeforeMethod
	public void startUp() {
		WebDriver driver=setUp("chrome", "https://www.google.com");
		getGoogleSearchPage=new GoogleSearchPage(driver);
		getGoogleSearchResultPage =new GoogleSearchResultPage(driver);
		getGoogleSearchPage.CatchCookie();
	}
	
	@Test
	public void testGoogleSearchFunctinality() {
		
		getGoogleSearchPage.searchInput("Selenium");
		String expectedTitle="Selenium - Google Search";
		String actualTitle=getGoogleSearchResultPage.getSearchPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void testSuggestionCount() {
		getGoogleSearchPage.searchText("Selenium");
		int actualSuggestedOptionCount=getGoogleSearchPage.getSuggestedOptions().size();
		Assert.assertTrue(actualSuggestedOptionCount==10);
	}
	
	@AfterMethod
	public void ends() {
		cleanUp();
	}

}
