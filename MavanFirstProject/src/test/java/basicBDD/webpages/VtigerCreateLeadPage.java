package basicBDD.webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class VtigerCreateLeadPage extends SeleniumUtility {

	public VtigerCreateLeadPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="Leads_listView_basicAction_LBL_ADD_RECORD")
	private WebElement Add;
	@FindBy(name ="firstname")
	private WebElement firstname;
	@FindBy(name ="lastname")
	private WebElement lastname;
	@FindBy(xpath ="//select[@name='industry']")
	private List<WebElement> industry;
	@FindBy(xpath="//select[@name='leadstatus']")
	private List<WebElement>  leadstatus;
	@FindBy(css=".saveButton")
	public WebElement savelead;
  public void addLead(String a,String b,String c,String d) {
	  performClick(Add);
	  typeInput(firstname,a);
	  typeInput(lastname,b);
		 for(int i=1;i<industry.size();i++) {
				if(industry.get(i).getText().equals(c)) {
					industry.get(i).click();
					break;
				}
			}
  for(int i=1;i<leadstatus.size();i++) {
		if(leadstatus.get(i).getText().equals(d)) {
			leadstatus.get(i).click();
			break;
		}
	}
  performClick(savelead);
}
  
}