package basicBDD.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ActitimeHomePage  extends SeleniumUtility{
	
	public ActitimeHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="container_tasks")
	private WebElement Task;
  
public void taskClick() {
	performClick(Task);
}
}
