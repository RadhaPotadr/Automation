package basicBDD.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ActitimeDeleteTaskPage extends SeleniumUtility {

	public ActitimeDeleteTaskPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//tr[td[div[div[div[div[text()='API testing']]]]]]/td[1]/div")
	public WebElement checkbox;
	@FindBy(xpath = "//div[@class='delete button']")
	public WebElement delete;
	@FindBy(xpath = "//span[text()='Delete permanently']")
	public WebElement confirmdelete;
  public void checkboxClick() {
	  performClick(checkbox);
  }
  @FindBy(css = ".taskTableContainer>table>tbody>tr>td>input")
	private WebElement TaskName1;
}
