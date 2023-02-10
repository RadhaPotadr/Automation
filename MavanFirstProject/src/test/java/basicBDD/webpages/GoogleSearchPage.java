package basicBDD.webpages;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class GoogleSearchPage extends SeleniumUtility{
	
	public GoogleSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="L2AGLb")
	public WebElement cookie;
	
	@FindBy(name="q")
	private WebElement searchInputField;
	
	@FindBy(css="ul.G43f7e>li div[role='option']>div:nth-of-type(1)>span")
	private List<WebElement> suggestedOptions;
	
	public List<WebElement> getSuggestedOptions(){
		return suggestedOptions;
	}
	
	public void CatchCookie() {
		performClick(cookie);
	
	}
	public void searchText(String input) {
		performClick(searchInputField);
		typeInput(searchInputField, input);
	}
	public void searchInput(String input) {
		typeInput(searchInputField, input);
		getActiveElement().sendKeys(Keys.ENTER);
	}
	
}
