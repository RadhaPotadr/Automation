package orangehrm;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.SeleniumUtility;
public class UtilityPIMTestng extends SeleniumUtility {
	WebDriver driver;
	Actions act;
	List<WebElement> emp;
	WebDriverWait wait;
	@Test(priority = 1)
	public void PIMcreation() {
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
		for (int i = 0; i < emp.size(); i++) {
			emp = driver.findElements(By.xpath("//div[@class='oxd-table-card']/div/div[2]"));
		//	System.out.println(emp.get(i).getText());
			if (emp.get(i).getText().equals("7777")) {
				System.out.println("PIM is created sucessfully");
				//String creation=emp.get(i).getText();
				Assert.assertEquals(emp.get(i).getText(), "7777","PIM creation validation succesfull");
				break;
			}
		}
	}
	@Test(priority = 2)
	public void PIMModofication() {
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
		Assert.assertEquals(driver.findElement(By.xpath("//div[div[div[text()='7777']]]//div[5]")).getText(), "QA Engineer","PIM is updated sucessfully");
		/*if (driver.findElement(By.xpath("//div[div[div[text()='7777']]]//div[5]")).getText().equals("QA Engineer")) {
			System.out.println("PIM is updated sucessfully");
		}*/
		
	}
	@Test(priority = 3)
	public void PIMDeletion() {
		// PIM Deletion
		performClick(driver.findElement(By.xpath(
				"//div[div[div[div[text()='7777']]]]/div//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")));
		performClick(
				driver.findElement(By.xpath("//div[div[div[div[text()='7777']]]]/div//i[@class='oxd-icon bi-trash']")));
		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		performClick(driver.findElement(By.xpath("//span[text()='PIM']")));
		driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input"))
				.sendKeys("7777");
		performClick(driver.findElement(By.xpath("//button[text()=' Search ']")));
		/*System.out.println("PIM deletion validation :"
				+ (driver.findElement(By.xpath("//span[(text()='No Records Found')]")).getText()));*/
		Assert.assertEquals(driver.findElement(By.xpath("//span[(text()='No Records Found')]")).getText(),"No Records Found", "PIM deletion validation");
		driver.close();
	}
}
