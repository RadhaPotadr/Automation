package mouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Four {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement element =driver.findElement(By.cssSelector("body"));
		element.sendKeys(Keys.ESCAPE);
		for(int i=0;i<5;i++) {
			element.sendKeys(Keys.PAGE_DOWN);	
			Thread.sleep(1000);
		}
		
		for(int i=0;i<5;i++) {
			element.sendKeys(Keys.PAGE_UP);	
			Thread.sleep(1000);
		}
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		Thread.sleep(1000);
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
		
	}
}
