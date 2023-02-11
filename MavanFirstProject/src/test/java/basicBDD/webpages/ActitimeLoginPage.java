package basicBDD.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ActitimeLoginPage  extends SeleniumUtility{
	
	public ActitimeLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (name="username")
	private WebElement UserName;
	
	@FindBy (name="pwd")
	private WebElement Password;
	
	@FindBy (id="loginButton")
	private WebElement loginbutton;
	
  public void loginInput(String input, String input1) {
	  typeInput(UserName,input);
	  typeInput(Password ,input1);
	  performClick(loginbutton);
	  
  }
}
