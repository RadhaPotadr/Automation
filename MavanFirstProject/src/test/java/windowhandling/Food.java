package windowhandling;
import java.time.Duration;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.DateUtility;
import utilities.SeleniumUtility;
public class Food {
	SeleniumUtility s1=new SeleniumUtility();
	  DateUtility d1=new DateUtility();
	  
	  WebDriver driver=s1.setUp("chrome", "https://erail.in/");
	  String t1= driver.getWindowHandle();
	 /* s1.performClick(driver.findElement(By.xpath("//a[text()='eCatering']")));
		Set<String>Options=driver.getWindowHandles();
		Options.remove(t1);
		driver.switchTo().window(Options.iterator().next());
	  //      or
	  //	  driver.switchTo().window(allWindows.iterator().next())
	  System.out.println("eCatering page title: "+driver.getTitle());
	  System.out.println("eCatering page title: "+driver.getCurrentUrl());
	  s1.performClick(driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']")));
	  s1.typeInput(driver.findElement(By.xpath("//input[@placeholder='Start typing Nagpur, NGP, Rajdhani']")), "12627");
	  s1.waitTillElementIsClickable(driver.findElement(By.cssSelector(".body-3")));
	  s1.performClick(driver.findElement(By.cssSelector(".body-3"))); 
	  //click on boarding date drop down
	  WebElement date=driver.findElement(By.xpath("//input[@name='date']"));
	  date.click();
	  date.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER, Keys.TAB,Keys.ENTER);	
	  //click on the boarding station drop down and then select boarding station
	  FluentWait wait=new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(ElementClickInterceptedException.class);
				wait.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath("//span[text()='Boarding Date']"))));
	  s1.performClick(driver.findElement(By.xpath("//select[@placeholder='Boarding Station']")));		
	  List<WebElement> drop=driver.findElements(By.xpath("//select[@placeholder='Boarding Station']/option"));
	  s1.performClick(drop.get(27));//click on train eg. Itarsi
	  //click on find food
	  s1.waitTillElementIsClickable(driver.findElement(By.xpath("//button[text()='FIND FOOD']")));
	  s1.performClick(driver.findElement(By.xpath("//button[text()='FIND FOOD']"))); 
	  //print restraunt names and count
	  s1.wait.until(ExpectedConditions.urlContains("boardingDate="));
	  s1.wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(".tracking-wide")), "restaurants"));
	  //to print total restraunt count
	  WebElement count=driver.findElement(By.cssSelector(".tracking-wide"));
	  System.out.println("Total restraunt: "+count.getText());
	  List<WebElement> hotelNames=driver.findElements(By.cssSelector(".min-h-screen>div:nth-of-type(2)>div h5.tracking-normal "));
	  for(int i=0;i<hotelNames.size();i++) {
		  System.out.println(hotelNames.get(i).getText());
	  }*/

}

