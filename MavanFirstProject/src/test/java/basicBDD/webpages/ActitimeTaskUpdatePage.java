package basicBDD.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ActitimeTaskUpdatePage extends SeleniumUtility {

	public ActitimeTaskUpdatePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Galaxy Corporation']")
	public WebElement Galaxy;
	
	@FindBy(xpath="//div[text()='Android testing']")
	public WebElement project;
	
	@FindBy(xpath = "//tr[td[div[div[div[div[text()='API testing']]]]]]/td[7]/div/div/span[2]")
	public WebElement calander;
	
	@FindBy(css = ".x-date-right>a")
	public WebElement month;
	
	@FindBy(css = ".x-date-inner tr:nth-of-type(3)>td:nth-of-type(3) span")
	public WebElement date;
	
	@FindBy(xpath = "//tr[td[div[div[div[div[text()='API testing']]]]]]/td[7]/div /div/span[1]")
	public WebElement calandercheck;
  public void calanderclick() {
	  performClick(calander);
	  }
  public void monthclick() {
	  performClick(month);
	  }
  public void dateclick() {
	  performClick(date);
	  }
	  
}
