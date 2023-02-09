package mouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Five {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement element =driver.findElement(By.cssSelector("body"));
		element.sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
				//element.sendKeys(Keys.F5);
				
				element.sendKeys(Keys.chord(Keys.CONTROL,"R"));
				
				driver.navigate().refresh();
	}

}
