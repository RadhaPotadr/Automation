package basicBDD.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class OrangeHrmHomePage extends SeleniumUtility{
	
	public OrangeHrmHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='PIM']")
	public WebElement PIM;
	
	@FindBy(xpath="//div[div[div[text()='54336']]]//div[5]")
	public WebElement PIMupdate;
	
	@FindBy(css=".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")
	public WebElement PIMsearch;
	
	@FindBy(xpath="//button[text()=' Search ']")
	public WebElement searchbutton;
	
	@FindBy(xpath="//span[(text()='No Records Found')]")
	public WebElement PIMDeletion;
	
	public String getHomePageURL() {
		return getCurrentPageURL();
	}
	public void PIMclick() {
		performClick(PIM);
	}
	public void PIMsearch( String input) {
		typeInput(PIMsearch, input);
	}
}
