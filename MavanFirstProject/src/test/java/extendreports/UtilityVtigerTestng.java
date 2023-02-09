package extendreports;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.SeleniumUtility;
public class UtilityVtigerTestng extends SeleniumUtility{
	WebDriver driver;
	Actions act;
	 List<WebElement> create;
	 static ExtentTest test;
		static ExtentReports report;
	@BeforeClass
		public static void startTest() {
			report = new ExtentReports(".\\extentreports\\Vtiger_Lead.html");	
		}
  @Test(priority=1)
  public void create() {
	  test=report.startTest("Lead Creation");
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
		 List<String>find=new ArrayList();
		 for(int i=0;i<create.size();i++) {
			 find.add(create.get(i).getText());
			 }
		if(find.contains("radha")) {
					test.log(LogStatus.PASS, "Lead Creation is passed");
				Assert.assertTrue((find.contains("radha")),"lead created validation");	
				}
		else {
			test.log(LogStatus.FAIL, "Lead Creation is failed");
		}
  }
  @Test(priority=2)
  public void modify() {
	  test=report.startTest("Lead modification");
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
			test.log(LogStatus.PASS, "Lead Modification is passed");
				Assert.assertEquals(driver.findElement(By.xpath("//tr[td[2][span[span[a[text()='radha']]]]]//td[5]/span/span")).getText(), "7887659394","lead modification validation");
		 }
		 else {
			 test.log(LogStatus.FAIL, "Lead Modification is failed");
		 }
  }
 @Test(priority=3)
  public void delete() {
	 test=report.startTest("Lead deletion");
	  performClick(driver.findElement(By.xpath("//tr[td[2][span[span[a[text()='radha']]]]]//td/div/span[1]"))); 
		 performClick(driver.findElement(By.xpath("//a[text()='radha']"))); 
		performClick(driver.findElement(By.cssSelector(".btn-group>button:nth-of-type(5)")));
		 performClick(driver.findElement(By.id("Leads_detailView_moreAction_Delete_Lead"))); 
		 performClick(driver.findElement(By.xpath("//button[text()='Yes']")));
		 performClick(driver.findElement(By.xpath("//span[text()='Leads']"))); 
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 create=driver.findElements(By.xpath("//tr[@class='listViewEntries'] //td[2]"));
		 List<String>find1=new ArrayList();
		 for(int i=0;i<create.size();i++) {
			 find1.add(create.get(i).getText());
			 }
		if(find1.contains("radha")) {
					test.log(LogStatus.FAIL, "Lead Deletion is failed");
				Assert.assertTrue((find1.contains("radha")),"lead deleted validation");	
				}
		else {
			test.log(LogStatus.PASS, "Lead deletion is passed");
		}
		 driver.close();
  }
 @AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}
}
