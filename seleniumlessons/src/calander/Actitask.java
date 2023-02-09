package calander;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Actitask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.className("addNewButton")).click();
		driver.findElement(By.className("createNewTasks")).click();
		driver.findElement(By.cssSelector(".customerSelector>div")).click();
		List<WebElement>company=driver.findElements(By.cssSelector(".customerSelector>div>div:nth-of-type(2)>div>div>div>div"));
		for(int i=0;i<company.size();i++) {
			if(company.get(i).getText().trim().equals("Galaxy Corporation")) {
				company.get(i).click();
			}
		}
		driver.findElement(By.cssSelector(".projectSelector>div")).click();
		List<WebElement>project=driver.findElements(By.cssSelector(".projectSelector>div>div:nth-of-type(2)>div>div>div>div"));
		for(int i=0;i<project.size();i++) {
			project=driver.findElements(By.cssSelector(".projectSelector>div>div:nth-of-type(2)>div>div>div>div"));
			if(project.get(i).getText().trim().equals("Android testing")) {
				project.get(i).click();
			}
		}
		driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr>td>input")).click();
		driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr>td>input")).sendKeys("API testing");
		driver.findElement(By.cssSelector("#ext-comp-1061>tbody>tr>.x-btn-center>em")).click();
		driver.findElement(By.cssSelector("#ext-gen110")).click();
		driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-of-type(3)>td:nth-of-type(2)>a>em")).click();
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector(".taskTableContainer>table>tbody>tr:nth-of-type(1)>td:nth-of-type(5)>div:nth-of-type(2)"))));
		driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr:nth-of-type(1)>td:nth-of-type(5)>div:nth-of-type(2)")).click();
		List<WebElement>work=driver.findElements(By.cssSelector(".taskTableContainer>table>tbody>tr:nth-of-type(1)>td:nth-of-type(5)>div>div>div>div:nth-of-type(1)>div>div"));
		for(int i=0;i<work.size();i++) {
			if(work.get(i).getText().equals("testing")) {
				work.get(i).click();
				break;
			}
		}
		driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr:nth-of-type(1)>td:nth-of-type(6)>label")).click();
		
		driver.findElement(By.cssSelector("#createTasksPopup_content>div:nth-of-type(2)>div:nth-of-type(2)>div>div")).click();
		System.out.println("************");
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//tr[td[div[div[div[div[text()='API testing']]]]]]/td/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		driver.close();
	}
}
