package basicBDD.webpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class VtigerHomePage extends SeleniumUtility {

	public VtigerHomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "appnavigator")
	private WebElement appnavigator;
	@FindBy(xpath= "//span[text()=' MARKETING']")
	private WebElement MARKETING;
	@FindBy(xpath= "//span[text()=' Leads']")
	public WebElement Leads;
	@FindBy(xpath= "//tr[@class='listViewEntries'] //td[2]")
	private  List<WebElement> Leadslist;
	public List <String>leadnames= new ArrayList();
  public void goToLeadPage() {
	  performClick(appnavigator);
	  performClick(MARKETING);
	  performClick(Leads);
  }
  public void createValidation( List <String>leadnames) {
	  for(int i=0;i<Leadslist.size();i++) {
		  leadnames.add(Leadslist.get(i).getText());
			}
}
  @FindBy(xpath= "//tr[td[2][span[span[a[text()='radha']]]]]//td[5]/span/span")
	public WebElement modifiedLead;
  }
  

