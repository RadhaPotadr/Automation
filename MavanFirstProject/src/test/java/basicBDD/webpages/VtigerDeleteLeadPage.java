package basicBDD.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class VtigerDeleteLeadPage extends SeleniumUtility {

	public VtigerDeleteLeadPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//tr[td[2][span[span[a[text()='radha']]]]]//td/div/span[1]")
	private WebElement checkbox;
	@FindBy(xpath ="//a[text()='radha']")
	private WebElement createdLead;
	@FindBy(css =".btn-group>button:nth-of-type(5)")
	private WebElement more;
	@FindBy(id ="Leads_detailView_moreAction_Delete_Lead")
	//@FindBy(id ="Leads_detailView_moreAction_Apagar_Lead")
	private WebElement deleteLead;
	@FindBy(xpath ="//button[text()='Yes']")
	private WebElement confirmDelete;
	public void deleteLead() {
		  performClick(checkbox);
		  performClick(createdLead);
		  performClick(more);
		  performClick(deleteLead);
		  performClick(confirmDelete);
}
}