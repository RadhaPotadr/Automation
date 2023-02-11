package basicBDD.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class VtigerLoginPage extends SeleniumUtility {

	public VtigerLoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(className = "buttonBlue")
	private WebElement loginbutton;
  public void login(String input,String input1) {
	  typeInput(username,input);
	  typeInput(password,input1);
	  performClick(loginbutton);
  }
}
