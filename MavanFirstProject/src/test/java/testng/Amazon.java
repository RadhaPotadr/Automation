package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Amazon extends SeleniumUtility {
	
  @Test(priority=1)
  public void open() {
	 WebDriver driver=setUp("chrome","https://www.amazon.in");
  }
  @Test(priority=2)
  public void all() {
	  performClick(driver.findElement(By.xpath("//a[span[text()='All']]")));
	  WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[div[text()='Gift Cards & Mobile Recharges']]")));
		driver.findElement(By.xpath("//a[div[text()='Gift Cards & Mobile Recharges']]")).click();
		driver.findElement(By.xpath("//a[text()=' All Gift Cards']")).click();
  }
  @Test(priority=3)
  public void checkbox() {
	  driver.findElement(By.xpath("//span[text()='Anniversary']")).click();
		driver.findElement(By.xpath("//span[text()='Brother']")).click();
		driver.findElement(By.xpath("//span[text()='Fashion Accessories']")).click();
  }
}
