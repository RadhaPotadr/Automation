package basicBDD.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class OrangeHrmLoginPage extends SeleniumUtility{
	
	public OrangeHrmLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (name="username")
	public WebElement UserName;
	@FindBy (name="password")
	private WebElement Password;
	@FindBy (className="orangehrm-login-button")
	private WebElement LoginButton;
	public void UserNameInput(String input) {
		typeInput(UserName,input);
	}
	public void passwordInput(String input) {
		typeInput(Password,input);
	}
	public void Loginclick() {
		performClick(LoginButton);
	}
}
