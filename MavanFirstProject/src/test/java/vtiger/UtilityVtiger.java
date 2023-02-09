package vtiger;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class UtilityVtiger {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		Actions act = new Actions(driver);
		s1.typeInput(driver.findElement(By.id("username")), "admin");
		s1.typeInput(driver.findElement(By.id("password")), "Test@123");
		s1.performClick(driver.findElement(By.className("buttonBlue")));
		s1.performClick(driver.findElement(By.id("appnavigator")));
		s1.performClick(driver.findElement(By.xpath("//span[text()=' MARKETING']")));
		s1.performClick(driver.findElement(By.xpath("//span[text()=' Leads']")));
		s1.performClick(driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")));
		s1.typeInput(driver.findElement(By.name("firstname")), "radha");
		s1.typeInput(driver.findElement(By.name("lastname")), "potdar");
		 List<WebElement> industry =s1.getDropdownOptionList(driver.findElement(By.xpath("//select[@name='industry']")));
		 for(int i=1;i<industry.size();i++) {
				if(industry.get(i).getText().equals("Construction")) {
					industry.get(i).click();
					break;
				}
			}
		 s1.performClick(driver.findElement(By.xpath("//button[text()='Save']"))); 
		 s1.performClick(driver.findElement(By.xpath("//span[text()='Leads']"))); 
		
		 List<WebElement> create=driver.findElements(By.xpath("//tr[@class='listViewEntries'] //td[2]"));
		 
		 for(int i=0;i<create.size();i++) {
				if(create.get(i).getText().equals("radha"));
				System.out.println("created");
					break;
				}
		 s1.performClick(driver.findElement(By.xpath("//tr[td[2][span[span[a[text()='radha']]]]]//td/div/span[1]"))); 
		 s1.performClick(driver.findElement(By.xpath("//a[text()='radha']"))); 

		s1.performClick(driver.findElement(By.id("Leads_detailView_basicAction_LBL_EDIT")));
		 List<WebElement> lead=s1.getDropdownOptionList(driver.findElement(By.xpath("//select[@name='leadstatus']")));
		 for(int i=1;i<lead.size();i++) {
				if(lead.get(i).getText().equals("Contact in Future")) {
					lead.get(i).click();
					break;
				}
			}
		 
		 s1.typeInput(driver.findElement(By.id("Leads_editView_fieldName_phone")), "7887659394");
		 s1.performClick(driver.findElement(By.xpath("//button[text()='Save']"))); 
		 s1.performClick(driver.findElement(By.xpath("//span[text()='Leads']"))); 
		 if(driver.findElement(By.xpath("//tr[td[2][span[span[a[text()='radha']]]]]//td[5]/span/span")).getText().equals("7887659394")) {
			 System.out.println("modified"); 
		 }
		 s1.performClick(driver.findElement(By.xpath("//tr[td[2][span[span[a[text()='radha']]]]]//td/div/span[1]"))); 
		 s1.performClick(driver.findElement(By.xpath("//a[text()='radha']"))); 
		 s1.performClick(driver.findElement(By.cssSelector(".btn-group>button:nth-of-type(5)")));
		 s1.performClick(driver.findElement(By.id("Leads_detailView_moreAction_Delete_Lead"))); 
		 s1.performClick(driver.findElement(By.xpath("//button[text()='Yes']")));
		 s1.performClick(driver.findElement(By.xpath("//span[text()='Leads']"))); 
			
		 create=driver.findElements(By.xpath("//tr[@class='listViewEntries'] //td[2]"));
		 
		 for(int i=0;i<create.size();i++) {
				if(!create.get(i).getText().equals("radha"));
				System.out.println("deleted");
					break;
				}
		 driver.close();
}	
}
