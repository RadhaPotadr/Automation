package basicBDD.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class GoogleSearchResultPage extends SeleniumUtility{

	public GoogleSearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getSearchPageTitle() {
		return getPageTitle();
	}
}
