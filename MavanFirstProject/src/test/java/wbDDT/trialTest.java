/*package wbDDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class trialTest {
  @Test (priority=1)
  public void positive() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get(url);
	  driver.findElement(By.id("username")).sendKeys(Username);
	  driver.findElement(By.name("pwd")).sendKeys(pwd);
	  driver.findElement(By.id("loginButton")).click();
	  WebDriverWait wait = new WebDriverWait (driver,20);
  }
  @Test (priority=2)
  public void negative() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get(url);
	  driver.findElement(By.id("username")).sendKeys(Username);
	  driver.findElement(By.name("pwd")).sendKeys(pwd);
	  driver.findElement(By.id("loginButton")).click();
	  WebDriverWait wait = new WebDriverWait (driver,20);
  }
}
*/