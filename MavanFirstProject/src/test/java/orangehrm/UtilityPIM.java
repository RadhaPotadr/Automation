package orangehrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class UtilityPIM {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Actions act = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//login
		s1.typeInput(driver.findElement(By.name("username")), "Admin");
		driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
		//PIM creation
		s1.performClick(driver.findElement(By.xpath("//span[text()='PIM']")));
		s1.performClick(driver.findElement(By.xpath("//button[text()=' Add ']")));
		s1.typeInput(driver.findElement(By.xpath("//input[@placeholder='First Name']")), "Radha");
		s1.typeInput(driver.findElement(By.xpath("//input[@placeholder='Middle Name']")), "Dinesh");
		s1.typeInput(driver.findElement(By.xpath("//input[@placeholder='Last Name']")), "Potdar");
		WebElement id =driver.findElement(By.cssSelector(".oxd-form-row>div:nth-of-type(2)  .oxd-input"));
		for (int i = 0; i < 10; i++) {
			id.sendKeys(Keys.BACK_SPACE);
		}
		s1.typeInput(id, "7777");
		s1.performClick(driver.findElement(By.xpath("//button[text()=' Save ']")));
		//validation
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='First Name']"))));
		s1.performClick(driver.findElement(By.xpath("//span[text()='PIM']")));
		List<WebElement> emp = driver.findElements(By.xpath("//div[@class='oxd-table-card']/div/div[2]"));
		for (int i = 0; i < emp.size(); i++) {
			emp = driver.findElements(By.xpath("//div[@class='oxd-table-card']/div/div[2]"));
			//System.out.println(emp.get(i).getText());
			if (emp.get(i).getText().equals("7777")) {
				System.out.println("PIM is created sucessfully");
				break;
			}
		}
		//PIM Modofication
		s1.performClick(driver.findElement(By.xpath("//div[div[div[div[text()='7777']]]]/div//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")));
		s1.performClick(driver.findElement(By.xpath("//div[div[div[div[text()='7777']]]]/div//i[@class='oxd-icon bi-pencil-fill']")));
		s1.performClick(driver.findElement(By.xpath("//a[text()='Job']")));
		WebElement one = driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div"));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div")));
		one.click();
		for (int i = 0; i < 100; i++) {
			act.moveToElement(one).sendKeys(Keys.ARROW_DOWN).build().perform();
			if (driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div")).getText().equals("QA Engineer")) {
				one.sendKeys(Keys.ENTER);
				break;
			}
		}
		s1.performClick(driver.findElement(By.xpath("//button[text()=' Save ']")));
		//validation
		s1.performClick(driver.findElement(By.xpath("//span[text()='PIM']")));
		if(driver.findElement(By.xpath("//div[div[div[text()='7777']]]//div[5]")).getText().equals("QA Engineer")){
			System.out.println("PIM is updated sucessfully");
		}
		
	//PIM Deletion
		s1.performClick(driver.findElement(By.xpath("//div[div[div[div[text()='7777']]]]/div//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")));
		s1.performClick(driver.findElement(By.xpath("//div[div[div[div[text()='7777']]]]/div//i[@class='oxd-icon bi-trash']")));
		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		s1.performClick(driver.findElement(By.xpath("//span[text()='PIM']")));
		driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).sendKeys("7777");
		s1.performClick(driver.findElement(By.xpath("//button[text()=' Search ']")));
		System.out.println("PIM deletion validation :" + (driver.findElement(By.xpath("//span[(text()='No Records Found')]")).getText()));
			driver.close();
			
			
	}

}
