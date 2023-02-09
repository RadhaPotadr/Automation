package day3.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Amazonpay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(450,600));
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("page title is :  "+title);
		driver.findElement(By.cssSelector("a[href='/gp/sva/dashboard?ref_=nav_cs_apay']")).click();
		System.out.println("page title is :  "+driver.getTitle());
		driver.navigate().back();
		System.out.println("page title is :  "+driver.getTitle());
		System.out.println("page title validation :  "+driver.getTitle().equals(title));
		driver.close();
	}
	
}
