package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[span[text()='All']]")).click();
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[div[text()='Gift Cards & Mobile Recharges']]")));
		driver.findElement(By.xpath("//a[div[text()='Gift Cards & Mobile Recharges']]")).click();
		driver.findElement(By.xpath("//a[text()=' All Gift Cards']")).click();
		driver.findElement(By.xpath("//span[text()='Anniversary']")).click();
		//"//input[@type='checkbox']"
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Brother']")));
		driver.findElement(By.xpath("//span[text()='Brother']")).click();
		driver.findElement(By.xpath("//span[text()='Fashion Accessories']")).click();
	}
} 
