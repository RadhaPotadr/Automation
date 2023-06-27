package windowhandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LInkedin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		String w1=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Jobs']")).click();
		Set<String> allWinIds = driver.getWindowHandles();
		allWinIds.remove(w1);
		driver.switchTo().window(allWinIds.iterator().next());
		driver.findElement(By.cssSelector(".o3Dpx>div:nth-of-type(1) input")).click();
		driver.findElement(By.cssSelector(".o3Dpx>div:nth-of-type(1) input")).sendKeys("Radha");
		driver.switchTo().window(w1);
	}
}
