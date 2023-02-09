package day04.elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricinfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cricinfo.com/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.navigate().refresh();
		List<WebElement>cricket=driver.findElements(By.cssSelector("html>body>#__next>#pane-main>#main-container>div:nth-of-type(3)>div>nav>div>div>div>div:nth-of-type(2)>div>div>a"));
		System.out.println("no of menu options :"+cricket.size());
		for(int i=0;i<cricket.size();i++) {
			System.out.println("menu option "+(i+1)+" is  "+ cricket.get(i).getText());
		}
	}

}
