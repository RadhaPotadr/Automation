package windowhandling;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver= s1.setUp("chrome", "https://erail.in/");
		String t1= driver.getWindowHandle(); 
		s1.performClick(driver.findElement(By.xpath("//a[text()='eCatering']")));
		Set<String>Options=driver.getWindowHandles();
		Options.remove(t1);
		driver.switchTo().window(Options.iterator().next());
		WebDriverWait wait=new WebDriverWait(driver,60);
		s1.performClick(driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']")));
		s1.typeInput(driver.findElement(By.xpath("//input[@placeholder='Start typing Nagpur, NGP, Rajdhani']")), "12627");
		s1.performClick(driver.findElement(By.xpath("//div[div[div[span[text()='Trains']]]]//button")));
		Thread.sleep(1000);
		s1.performClick(driver.findElement(By.xpath("//input[@placeholder='Boarding Date']")));
		WebElement a=driver.findElement(By.xpath("//input[@placeholder='Boarding Date']"));
		Actions act= new Actions(driver);
		for (int i = 0; i < 100; i++) {
			act.moveToElement(a).sendKeys(Keys.ARROW_RIGHT).build().perform();
			if (a.getAttribute("value").equals("2023-02-07")) {
				a.sendKeys(Keys.ENTER);
				break;
			}
		}
		//Thread.sleep(1000);
		FluentWait wait1=new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(ElementClickInterceptedException.class);
				wait.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath("//span[text()='Boarding Date']"))));
		driver.findElement(By.xpath("//select[@placeholder='Boarding Station']")).click();
		 List<WebElement> stations =driver.findElements(By.cssSelector("div[class='p-4']>div:nth-of-type(2)>select>option"));
		 for (int i = 1; i <stations.size(); i++) {
			if (stations.get(i).getText().contains("ITARSI")) {
				stations.get(i).click();
				break;
			}
		}
		 s1.waitTillElementIsClickable(driver.findElement(By.xpath("//button[text()='FIND FOOD']")));
		 s1.performClick(driver.findElement(By.xpath("//button[text()='FIND FOOD']")));
		 s1.wait.until(ExpectedConditions.urlContains("boardingDate="));
		  s1.wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(".tracking-wide")), "restaurants"));
		  //to print total restraunt count
		  WebElement count=driver.findElement(By.cssSelector(".tracking-wide"));
		  System.out.println("Total restraunt: "+count.getText());
		  List<WebElement> hotelNames=driver.findElements(By.cssSelector(".min-h-screen>div:nth-of-type(2)>div h5.tracking-normal "));
		  for(int i=0;i<hotelNames.size();i++) {
			  System.out.println(hotelNames.get(i).getText());	 
		 }
		 driver.quit();
	}

}
