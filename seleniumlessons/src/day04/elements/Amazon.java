package day04.elements;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		List<WebElement> amazon = driver.findElements(By.cssSelector(
				"html>body>#a-page>#navbar-main>div>div:nth-of-type(5)>div:nth-of-type(2)>#nav-xshop-container>#nav-xshop>a"));
		System.out.println("count of menu : " + amazon.size());
		for (int i = 0; i < amazon.size(); i++) {
			amazon = driver.findElements(By.cssSelector(
					"html>body>#a-page>#navbar-main>div>div:nth-of-type(5)>div:nth-of-type(2)>#nav-xshop-container>#nav-xshop>a"));
			if(!amazon.get(i).getText().isEmpty()) {
				System.out.println("menu option " + (i + 1) + " is " + amazon.get(i).getText());
				amazon.get(i).click();
				System.out.println(driver.getTitle());
				driver.navigate().back();
			}
			else {
				System.out.println("menu option " + (i + 1) + " is " + amazon.get(i).getAttribute("innerHTML"));
				/*WebDriverWait wait =new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
					"html>body>#a-page>#navbar-main>div>div:nth-of-type(5)>div:nth-of-type(2)>#nav-xshop-container>#nav-xshop>a")));
				amazon.get(i).click();
				System.out.println(driver.getTitle());
				driver.navigate().back();*/
			}
			
		}
	}

}
