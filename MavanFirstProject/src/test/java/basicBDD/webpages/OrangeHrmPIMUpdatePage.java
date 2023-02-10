package basicBDD.webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class OrangeHrmPIMUpdatePage  extends SeleniumUtility{
	Actions act = new Actions(driver);
	public OrangeHrmPIMUpdatePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Job']")
	public WebElement job;
	
	@FindBy(css=".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div")
	public WebElement jobselecter;
	
	@FindBy(css=".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div")
	public List <WebElement> JobTitleList;
	
	public List<WebElement> joblist(){
		return JobTitleList;
	}
	public void JobTitleUpdate(WebElement options, String input) {
	for (int i = 0; i < 100; i++) {
		act.moveToElement(options).sendKeys(Keys.ARROW_DOWN).build().perform();
		if (options.getText().equals(input)) {
			options.sendKeys(Keys.ENTER);
			break;
		}
	}
}
}