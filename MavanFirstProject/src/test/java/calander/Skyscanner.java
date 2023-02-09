package calander;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skyscanner {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.edreams.com/");
		driver.findElement(By.id("didomi-notice-agree-button")).click();
		driver.findElement(By.cssSelector("input[placeholder='Where from?']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Where from?']")).sendKeys("dublin");
		driver.findElement(By.cssSelector("input[placeholder='Where to?']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Where to?']")).sendKeys("mumbai");
		
		driver.findElement(By.cssSelector("input[placeholder='Departure']")).click();
		
		//driver.findElement(By.className("lg:mt-0")).click();*/
		//driver.findElement(By.id("fsc-destination-search")).click();
	}

}
