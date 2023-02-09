package FontClr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.textToBe(By.cssSelector(".errormsg"),"Username or Password is invalid. Please try again."));
		WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
		System.out.println("color of error msg : "+errorMsg.getCssValue("color"));
		System.out.println("font of error msg : "+errorMsg.getCssValue("font-size"));		
	}

}
