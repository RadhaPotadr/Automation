package extendreports;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class ExtentReportPIM extends  SeleniumUtility {
	WebDriver driver;
	Actions act;
	List<WebElement> emp;
	WebDriverWait wait;
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest() {
		report = new ExtentReports(".\\extentreports\\Oragehrm_PIM.html");	
	}
	@Test(priority = 1)
	public void PIMcreation() {
		test = report.startTest("PIM creation");
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 20);
		// login
		typeInput(driver.findElement(By.name("username")), "Admin");
		driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
		// PIM creation
		performClick(driver.findElement(By.xpath("//span[text()='PIM']")));
		performClick(driver.findElement(By.xpath("//button[text()=' Add ']")));
		typeInput(driver.findElement(By.xpath("//input[@placeholder='First Name']")), "kia");
		typeInput(driver.findElement(By.xpath("//input[@placeholder='Middle Name']")), "carl");
		typeInput(driver.findElement(By.xpath("//input[@placeholder='Last Name']")), "troy");
		WebElement id = driver.findElement(By.cssSelector(".oxd-form-row>div:nth-of-type(2)  .oxd-input"));
		for (int i = 0; i < 10; i++) {
			id.sendKeys(Keys.BACK_SPACE);
		}
		typeInput(id, "7777");
		performClick(driver.findElement(By.xpath("//button[text()=' Save ']")));
		// validation
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='First Name']"))));
		performClick(driver.findElement(By.xpath("//span[text()='PIM']")));
		List<WebElement> emp = driver.findElements(By.xpath("//div[@class='oxd-table-card']/div/div[2]"));
		List<String> empid=new ArrayList<String>();
		for(int i=0;i<emp.size();i++) {
			empid.add(emp.get(i).getText());
		}
		if(empid.contains("7777")) {
		
				test.log(LogStatus.PASS, "PIM creation is passed");
				Assert.assertTrue(empid.contains("7777"),"PIM creation validation succesfull");
			}
		else {
			test.log(LogStatus.FAIL, "PIM creation is failed");
		}		
	}
	
	@Test(priority = 2)
	public void PIMModofication() {
		test = report.startTest("PIM updation");
		// PIM Modofication
		try {
		performClick(driver.findElement(By.xpath(
				"//div[div[div[div[text()='7777']]]]/div//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")));}
		catch(Exception e){
			
		}
		performClick(driver
				.findElement(By.xpath("//div[div[div[div[text()='7777']]]]/div//i[@class='oxd-icon bi-pencil-fill']")));
		performClick(driver.findElement(By.xpath("//a[text()='Job']")));
		WebElement one = driver
				.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div"));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div")));
		one.click();
		for (int i = 0; i < 100; i++) {
			act.moveToElement(one).sendKeys(Keys.ARROW_DOWN).build().perform();
			if (driver
					.findElement(
							By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div"))
					.getText().equals("QA Engineer")) {
				one.sendKeys(Keys.ENTER);
				break;
			}
		}
		performClick(driver.findElement(By.xpath("//button[text()=' Save ']")));
		// validation
		performClick(driver.findElement(By.xpath("//span[text()='PIM']")));
	if (driver.findElement(By.xpath("//div[div[div[text()='7777']]]//div[5]")).getText().equals("QA Engineer")) {
		test.log(LogStatus.PASS, "PIM updation is passed");
		}
	else {
		test.log(LogStatus.FAIL, "PIM updation is failed");
	}
	Assert.assertEquals(driver.findElement(By.xpath("//div[div[div[text()='7777']]]//div[5]")).getText(), "QA Engineer","PIM is updated sucessfully");	
	}
	@Test(priority = 3)
	public void PIMDeletion() {
		// PIM Deletion
		test = report.startTest("PIM deletion");
		performClick(driver.findElement(By.xpath(
				"//div[div[div[div[text()='7777']]]]/div//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")));
		performClick(
				driver.findElement(By.xpath("//div[div[div[div[text()='7777']]]]/div//i[@class='oxd-icon bi-trash']")));
		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		performClick(driver.findElement(By.xpath("//span[text()='PIM']")));
		driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input"))
				.sendKeys("7777");
		performClick(driver.findElement(By.xpath("//button[text()=' Search ']")));
		if((driver.findElement(By.xpath("//span[(text()='No Records Found')]")).getText()).equals("No Records Found")) {
			test.log(LogStatus.PASS, "PIM deletion is passed");		
		}else {
			test.log(LogStatus.FAIL, "PIM deletion is failed");
		}
		Assert.assertEquals(driver.findElement(By.xpath("//span[(text()='No Records Found')]")).getText(),"No Records Found", "PIM deletion validation");
		driver.close();
	}
	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}
}

