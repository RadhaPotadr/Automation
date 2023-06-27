package basicBDD.webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class GsmarenMovilePage extends SeleniumUtility {
	public GsmarenMovilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

@FindBy (xpath= "//button[text()='Agree and proceed']")
private WebElement cookie;

@FindBy (css= ".brandmenu-v2>ul>li>a")
private List<WebElement> phonelist;

public List<WebElement> getSuggestedOptions(){
	return phonelist;
}
public void CatchCookie() {
	performClick(cookie);

}
public void samsungclick (String input) {
	for(int i=0;i<phonelist.size();i++) {
		phonelist=driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		if(phonelist.get(i).getText().equals(input)) {
			phonelist.get(i).click();
			break;
		}
	}
}
}
