package annotations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Gsearch extends SeleniumUtility {
	@Test(priority=9)
	  public void open() {
		 WebDriver driver=setUp("chrome","https://www.google.com/");
	  }
  @Test(priority=10)
  public void popup() {
	  driver.findElement(By.id("L2AGLb")).click();
  }
  @Test(priority=11)
  public void search() {
	  WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("SQL");
		search.click();
		List <WebElement> sugg= driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span"));
		System.out.println("number of suggesion : "+ sugg.size());
		for(int i=0;i<sugg.size();i++) {
			System.out.println((i+1)+"suggesion  is: "+ sugg.get(i).getText());
		}
  }
  @Test(priority=12)
  public void close() {
	  driver.close();
  }
  }

