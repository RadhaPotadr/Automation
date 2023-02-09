package orangehrm;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PIM {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Actions act = new Actions(driver);
		String[] u = driver.findElement(By.xpath("//p[text()='Username : Admin']")).getText().split(": ");
		String[] p = driver.findElement(By.xpath("//p[text()='Password : admin123']")).getText().split(": ");
		driver.findElement(By.name("username")).sendKeys(u[1], Keys.TAB);
		driver.findElement(By.name("password")).sendKeys(p[1], Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.urlContains("addEmployee"));
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("kim");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kardesian");
		Thread.sleep(1000);
		WebElement id =driver.findElement(By.cssSelector(".orangehrm-employee-form>div>div:nth-of-type(2)>div>div>div:nth-of-type(2)>input"));
		act.moveToElement(id).doubleClick().sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(1000);
		//or
		 /* for (int i = 0; i < 10; i++) {
			driver.findElement(By.cssSelector(".orangehrm-employee-form>div>div:nth-of-type(2)>div>div>div:nth-of-type(2)>input")).sendKeys(Keys.BACK_SPACE);
		}*/
		driver.findElement(By.cssSelector(".orangehrm-employee-form>div>div:nth-of-type(2)>div>div>div:nth-of-type(2)>input")).sendKeys("7007");
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).click();
		driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).sendKeys("7007");
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(2000);
		System.out.println("PIM creation validation :" + (!driver.findElement(By.xpath("//span[(text()='(1) Record Found')]")).getText().equals("No Records Found")));
		List<WebElement> emp = driver.findElements(By.xpath("//div[@class='oxd-table-card']/div/div"));
		for (int i = 0; i < emp.size(); i++) {
			emp = driver.findElements(By.xpath("//div[@class='oxd-table-card']/div/div"));
			//System.out.println(emp.get(i).getText());
			if (emp.get(i).getText().contains("7007")) {
				System.out.println("PIM is created sucessfully");
			}
		}
		driver.findElement(By.cssSelector(".orangehrm-container>div>div:nth-of-type(2) span>i")).click();
		driver.findElement(By.cssSelector(".orangehrm-container>div>div:nth-of-type(2) >div>div>div:nth-of-type(9)>div button:nth-of-type(2)>i")).click();
		driver.findElement(By.xpath("//a[text()='Job']")).click();
		WebElement one = driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div"));
		one.click();
		for (int i = 0; i < 100; i++) {
			act.moveToElement(one).sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(80);
			if (driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div")).getText().equals("QA Engineer")) {
				one.sendKeys(Keys.ENTER);
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).click();
		driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).sendKeys("7007");
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(2000);
		for (int i = 0; i < emp.size(); i++) {
			emp = driver.findElements(By.xpath("//div[@class='oxd-table-card']/div/div"));
			//System.out.println(emp.get(i).getText());
			if (emp.get(i).getText().contains("QA Engineer")) {
				System.out.println("PIM is updated sucessfully");
			}
		}
		driver.findElement(By.cssSelector(".orangehrm-container>div>div:nth-of-type(2) span>i")).click();
		driver.findElement(By.cssSelector(".orangehrm-container>div>div:nth-of-type(2) >div>div>div:nth-of-type(9)>div button:nth-of-type(1)>i")).click();
		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).click();
		driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).sendKeys("7007");
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(1000);
		System.out.println("PIM deletion validation :" + (driver.findElement(By.xpath("//span[(text()='No Records Found')]")).getText()));
			driver.close();
		}
	}
