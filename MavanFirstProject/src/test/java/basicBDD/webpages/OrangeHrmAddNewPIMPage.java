package basicBDD.webpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class OrangeHrmAddNewPIMPage extends SeleniumUtility{
	
	public OrangeHrmAddNewPIMPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='First Name']")
	public WebElement FirstName;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	public WebElement LastName;
	@FindBy(css=".oxd-form-row>div:nth-of-type(2)  .oxd-input")
	public WebElement EmpId;
	@FindBy(xpath="//button[text()=' Save ']")
	public WebElement SavePIM;
	public void FirstNameInput(String input) {
		typeInput(FirstName,input);
	}
	public void LastNameInput(String input) {
		typeInput(LastName,input);
	}
	public void EmpIdInput(String input) {
		for (int i = 0; i < 10; i++) {
			EmpId.sendKeys(Keys.BACK_SPACE);
		}
		typeInput(EmpId,input);
	}
	public void SavePIMClick() {
		performClick(SavePIM);
	}
}
