package frame;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquary {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		//or
		//driver.switchTo().frame(0);
		driver.switchTo().frame(frame);
		List <WebElement>sort=driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		WebElement sort1=driver.findElement(By.xpath("//ul[@id='sortable']//li"));
		for(int i=sort.size()-1;i>=0;i--) {
			act.dragAndDrop(sort.get(i), sort1).build().perform();
			Thread.sleep(1000);	
		}
		
	}

}
