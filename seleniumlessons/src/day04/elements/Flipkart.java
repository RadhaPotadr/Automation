package day04.elements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("_2doB4z")).click();
		driver.navigate().refresh();
		List<WebElement> flip = driver.findElements(By.cssSelector("html>body>#container>div>div:nth-of-type(2)>div>div>div>a>div:nth-of-type(2)"));
		System.out.println(flip.size());
		for(int i=0;i<flip.size();i++) {
			System.out.println("menu option number "+ (i+1) + " is " + flip.get(i).getText());
		}

	}

}