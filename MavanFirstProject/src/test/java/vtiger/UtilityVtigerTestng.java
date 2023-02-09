package vtiger;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.SeleniumUtility;
public class UtilityVtigerTestng extends SeleniumUtility{
	WebDriver driver;
	Actions act;
	 List<WebElement> create;
  @Test(priority=1)
  public void create() {
		 driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		 act = new Actions(driver);
		typeInput(driver.findElement(By.id("username")), "admin");
		typeInput(driver.findElement(By.id("password")), "Test@123");
		performClick(driver.findElement(By.className("buttonBlue")));
		performClick(driver.findElement(By.id("appnavigator")));
		performClick(driver.findElement(By.xpath("//span[text()=' MARKETING']")));
		performClick(driver.findElement(By.xpath("//span[text()=' Leads']")));
		performClick(driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")));
		typeInput(driver.findElement(By.name("firstname")), "radha");
		typeInput(driver.findElement(By.name("lastname")), "potdar");
		 List<WebElement> industry =getDropdownOptionList(driver.findElement(By.xpath("//select[@name='industry']")));
		 for(int i=1;i<industry.size();i++) {
				if(industry.get(i).getText().equals("Construction")) {
					industry.get(i).click();
					break;
				}
			}
		 performClick(driver.findElement(By.xpath("//button[text()='Save']"))); 
		 performClick(driver.findElement(By.xpath("//span[text()='Leads']"))); 
		 create=driver.findElements(By.xpath("//tr[@class='listViewEntries'] //td[2]"));
		 for(int i=0;i<create.size();i++) {
				if(create.get(i).getText().equals("radha"));
				System.out.println("created");
				Assert.assertEquals(create.get(i).getText(), "radha","lead created validation");
					break;
				}
  }
  @Test(priority=2)
  public void modify() {
	  performClick(driver.findElement(By.xpath("//tr[td[2][span[span[a[text()='radha']]]]]//td/div/span[1]"))); 
		 performClick(driver.findElement(By.xpath("//a[text()='radha']"))); 
		performClick(driver.findElement(By.id("Leads_detailView_basicAction_LBL_EDIT")));
		 List<WebElement> lead=getDropdownOptionList(driver.findElement(By.xpath("//select[@name='leadstatus']")));
		 for(int i=1;i<lead.size();i++) {
				if(lead.get(i).getText().equals("Contact in Future")) {
					lead.get(i).click();
					break;
				}
			}
		 typeInput(driver.findElement(By.id("Leads_editView_fieldName_phone")), "7887659394");
		 performClick(driver.findElement(By.xpath("//button[text()='Save']"))); 
		 performClick(driver.findElement(By.xpath("//span[text()='Leads']"))); 
		 if(driver.findElement(By.xpath("//tr[td[2][span[span[a[text()='radha']]]]]//td[5]/span/span")).getText().equals("7887659394")) {
			 System.out.println("modified"); 
				Assert.assertEquals(driver.findElement(By.xpath("//tr[td[2][span[span[a[text()='radha']]]]]//td[5]/span/span")).getText(), "7887659394","lead modification validation");
		 }
  }
 @Test(priority=3)
  public void delete() {
	  performClick(driver.findElement(By.xpath("//tr[td[2][span[span[a[text()='radha']]]]]//td/div/span[1]"))); 
		 performClick(driver.findElement(By.xpath("//a[text()='radha']"))); 
		performClick(driver.findElement(By.cssSelector(".btn-group>button:nth-of-type(5)")));
		 performClick(driver.findElement(By.id("Leads_detailView_moreAction_Delete_Lead"))); 
		 performClick(driver.findElement(By.xpath("//button[text()='Yes']")));
		 performClick(driver.findElement(By.xpath("//span[text()='Leads']"))); 
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 create=driver.findElements(By.xpath("//tr[@class='listViewEntries'] //td[2]"));
		for(int i=0;i<create.size();i++) {
				if(!create.get(i).getText().equals("radha"));
				System.out.println("deleted");
				 Assert.assertFalse(create.get(i).getText().contains("radha"),"Lead is not deleted");
					break;
				}
		
		 driver.close();
  }
}
