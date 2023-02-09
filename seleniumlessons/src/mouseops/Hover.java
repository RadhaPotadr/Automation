package mouseops;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");
		List<WebElement>options= driver.findElements(By.cssSelector("#menu>ul>li>a"));
		Actions act=new Actions(driver);
		System.out.println("******to move hover******");
		/*act.moveToElement(options.get(3)).perform();
		for(int i=0;i<options.size();i++) {
			act.moveToElement(options.get(i)).perform();
			Thread.sleep(1000);
		}*/
		System.out.println("******to click on each hover******");
		/*for(int i=0;i<options.size();i++) {
		WebElement sec=options.get(i);
		act.moveToElement(sec).contextClick().build().perform();
		Thread.sleep(1000);
		}*/
		act.moveToElement(options.get(2), 100, 0).build().perform();
	}

}
