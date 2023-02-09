package FontClr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registed {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement submit= driver.findElement(By.cssSelector("#submitbtn"));
		System.out.println("color of submit button :"+submit.getCssValue("color"));
		System.out.println("background color of submit button :"+submit.getCssValue("background-color"));
		System.out.println("border color of submit button :"+submit.getCssValue("border-color"));
		System.out.println("font of submit button text :"+submit.getCssValue("font-size"));
}
}