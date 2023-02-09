package vtiger;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtility;
public class Vtiger {
	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		Actions act = new Actions(driver);
		WebElement user = driver.findElement(By.id("username"));
		user.clear();
		user.sendKeys("admin");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("Test@123");
		driver.findElement(By.className("buttonBlue")).click();
		driver.findElement(By.id("appnavigator")).click();
		driver.findElement(By.xpath("//span[text()=' MARKETING']")).click();
		driver.findElement(By.xpath("//span[text()=' Leads']")).click();
		driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
		WebElement s = driver.findElement(By.xpath("//span[text()='None']"));
		s.click();
		Thread.sleep(1000);
		List<WebElement> none = driver.findElements(By.xpath("//ul[@id='select2-results-2']/li/div"));
		for (int i = 1; i < none.size(); i++) {
			act.moveToElement(s).sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(80);
			if (none.get(i).getText().equals("Ms.")) {
				none.get(i).click();
				break;
			}
		}
		driver.findElement(By.name("firstname")).click();
		driver.findElement(By.name("firstname")).sendKeys("Radha", Keys.TAB);
		driver.findElement(By.name("lastname")).sendKeys("Potdar");
		WebElement w = driver.findElement(By.cssSelector("#s2id_autogen11"));
		w.click();
		List<WebElement> asigne = driver.findElements(By.cssSelector("#select2-results-12 div"));
		for (int i = 1; i < asigne.size(); i++) {
			act.moveToElement(w).sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(80);
			if (asigne.get(i).getText().equals("Team Selling")) {
				asigne.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Leads_detailView_basicAction_LBL_EDIT")).click();
		WebElement u = driver.findElement(By.xpath("//select[@name='industry']"));
		Select a = new Select(u);
		List<WebElement> industry = a.getOptions();
		for (int i = 1; i < industry.size(); i++) {
			if (industry.get(i).getText().equals("Construction")) {
				industry.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".btn-group>button:nth-of-type(5)")).click();
		driver.findElement(By.id("Leads_detailView_moreAction_Delete_Lead")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		driver.close();
	}
}
