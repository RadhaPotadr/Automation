package mouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Three {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement one =driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		//one.sendKeys("radha",Keys.chord(Keys.CONTROL,"a"));
		//one.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		one.sendKeys("radha",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		WebElement two=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		two.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		

	}

}
