package testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Flipkart extends SeleniumUtility {
  @Test(priority=1)
  public void open() {
		WebDriver driver= setUp("chrome","https://www.flipkart.com/");
		driver.get("https://www.flipkart.com/");
  }
  @Test(priority=2)
  public void popup() {
		driver.findElement(By.className("_2doB4z")).click();
		driver.navigate().refresh();
  }
  @Test(priority=3)
  public void search() {
		List<WebElement> flip = driver.findElements(By.cssSelector("html>body>#container>div>div:nth-of-type(2)>div>div>div>a>div:nth-of-type(2)"));
		System.out.println(flip.size());
		for(int i=0;i<flip.size();i++) {
			System.out.println("menu option number "+ (i+1) + " is " + flip.get(i).getText());
		}
  }
}
