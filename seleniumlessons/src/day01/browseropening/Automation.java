package day01.browseropening;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation {
 
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demosite.executeautomation.com/Login.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.name("Login")).submit();
		WebDriverWait wait = new WebDriverWait(driver,10);	
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LOGOUT")));
		driver.findElement(By.linkText("LOGOUT")).submit();
	}

}
