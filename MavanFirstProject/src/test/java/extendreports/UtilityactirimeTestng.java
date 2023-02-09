package extendreports;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.SeleniumUtility;
public class UtilityactirimeTestng extends SeleniumUtility{
	WebDriver driver;
	WebDriverWait wait;
	List<WebElement> taskList;
	List<String> actualTaskName;
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest() {
		report = new ExtentReports(".\\extentreports\\Actitime_task.html");	
	}
  @Test
  public void create() throws InterruptedException { 
	  test = report.startTest("Task creation");
		 driver	=setUp("chrome", "https://demo.actitime.com/");
		 wait =new WebDriverWait(driver,20);
		typeInput(driver.findElement(By.name("username")), "admin");
		typeInput(driver.findElement(By.name("pwd")), "manager");
		performClick(driver.findElement(By.id("loginButton")));
		performClick(driver.findElement(By.id("container_tasks")));
		performClick(driver.findElement(By.className("addNewButton")));
		performClick(driver.findElement(By.className("createNewTasks")));
		performClick(driver.findElement(By.cssSelector(".customerSelector>div")));
		List<WebElement>company=driver.findElements(By.cssSelector(".customerSelector>div>div:nth-of-type(2)>div>div>div>div"));
		for(int i=0;i<company.size();i++) {
			if(company.get(i).getText().trim().equals("Galaxy Corporation")) {
				company.get(i).click();
			}
		}
		performClick(driver.findElement(By.cssSelector(".projectSelector>div")));
		List<WebElement>project=driver.findElements(By.cssSelector(".projectSelector>div>div:nth-of-type(2)>div>div>div>div"));
		for(int i=0;i<project.size();i++) {
			project=driver.findElements(By.cssSelector(".projectSelector>div>div:nth-of-type(2)>div>div>div>div"));
			if(project.get(i).getText().trim().equals("Android testing")) {
				project.get(i).click();
			}
		}
		performClick(driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr>td>input")));
		typeInput(driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr>td>input")), "API testing");
		performClick(driver.findElement(By.cssSelector("#ext-comp-1061>tbody>tr>.x-btn-center>em")));
		performClick(driver.findElement(By.cssSelector("#ext-gen110")));
	performClick(driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-of-type(3)>td:nth-of-type(2)>a>em")));
	wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector(".taskTableContainer>table>tbody>tr:nth-of-type(1)>td:nth-of-type(5)>div:nth-of-type(2)"))));
	performClick(driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr:nth-of-type(1)>td:nth-of-type(5)>div:nth-of-type(2)")));
	List<WebElement>work=driver.findElements(By.cssSelector(".taskTableContainer>table>tbody>tr:nth-of-type(1)>td:nth-of-type(5)>div>div>div>div:nth-of-type(1)>div>div"));
	for(int i=0;i<work.size();i++) {
		if(work.get(i).getText().equals("testing")) {
			work.get(i).click();
			break;
		}
	}
	performClick(driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr:nth-of-type(1)>td:nth-of-type(6)>label")));
	performClick(driver.findElement(By.cssSelector("#createTasksPopup_content>div:nth-of-type(2)>div:nth-of-type(2)>div>div")));
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//div[text()='API testing']")), "API testing"));
	List<WebElement> taskList=driver.findElements(By.cssSelector(".tasksTableVerticalScrollContainer .title"));
	List<String> actualTaskName=new ArrayList<String>();
	for(int i=0;i<taskList.size();i++) {
		actualTaskName.add(taskList.get(i).getText());
	}
	//validation newly created task
	if(actualTaskName.contains("API testing")){
		test.log(LogStatus.PASS, "Task creation is passed");}
	else {
		test.log(LogStatus.FAIL, "Task creation is failed");	
	}
	Assert.assertTrue(actualTaskName.contains("API testing"),"API testing-Task is not created");
	taskList.clear();
  }
  @Test
  public void delete()  {
	  test = report.startTest("Task deletion");
	 	 wait.until(ExpectedConditions.elementToBeClickable(By.id("container_tasks")));
		performClick(driver.findElement(By.id("container_tasks")));
		performClick(driver.findElement(By.xpath("//tr[td[div[div[div[div[text()='API testing']]]]]]/td/div")));
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='delete button']")));
		performClick(driver.findElement(By.xpath("//div[@class='delete button']")));
		performClick(driver.findElement(By.xpath("//span[text()='Delete permanently']")));
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
		List<WebElement>taskList1=driver.findElements(By.cssSelector(".tasksTableVerticalScrollContainer .title"));
		List<String> actualTaskName1=new ArrayList<String>();
	for(int i=0;i<taskList1.size();i++) {
		actualTaskName1.add(taskList1.get(i).getText());
	}
	//validation deletion
	if(actualTaskName1.contains("API testing")){
		test.log(LogStatus.FAIL, "Task deletion is failed");}
	else {
		test.log(LogStatus.PASS, "Task deletion is passed");	
	}
	Assert.assertFalse(actualTaskName1.contains("API testing"),"API testing-Task is not deleted");
		driver.close();
  }
  @AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}
}
