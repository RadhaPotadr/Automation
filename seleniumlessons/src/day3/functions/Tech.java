package day3.functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tech {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/");
		driver.manage().getCookies();
		System.out.println(driver.getTitle());
		driver.manage().window().maximize(); 
		driver.manage().window().setSize(new Dimension(450,600));
		driver.manage().window().maximize();
		driver.findElement(By.id("ez-accept-all")).click();
		driver.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/java.html']")).click();
		//driver.findElement(By.id("cookieChoiceDismiss")).click();
		System.out.println("page title is : "+driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/selenium-tutorials.html']")).click();
		System.out.println("page title is : "+driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html']")).click();
		System.out.println("page title is : "+driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/software-testing.html']")).click();
		System.out.println("page title is : "+driver.getTitle());
		driver.navigate().back();
		driver.close();
	}

}
