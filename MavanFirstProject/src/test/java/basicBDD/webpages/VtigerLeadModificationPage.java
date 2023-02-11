package basicBDD.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class VtigerLeadModificationPage extends SeleniumUtility {

	public VtigerLeadModificationPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//tr[td[2][span[span[a[text()='radha']]]]]//td/div/span[1]")
	private WebElement checkbox;
	@FindBy(xpath ="//a[text()='radha']")
	private WebElement createdLead;
	@FindBy(id ="Leads_detailView_basicAction_LBL_EDIT")
	private WebElement editLead;
	@FindBy(id ="Leads_editView_fieldName_phone")
	private WebElement phone;
	
	
  public void ModifyLead(String input) {
	  performClick(checkbox);
	  performClick(createdLead);
	  performClick(editLead);
	  typeInput(phone,input);
  }
    
  }

