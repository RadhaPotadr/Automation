package mouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement one=driver.findElement(By.name("username"));
		WebElement two=driver.findElement(By.name("pwd"));
		one.sendKeys("trainee",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		two.sendKeys(Keys.chord(Keys.CONTROL,"v"),(Keys.ENTER));

	}

}
