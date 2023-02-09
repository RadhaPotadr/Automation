package activeelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		WebElement element = driver.switchTo().activeElement();
		String exp = element.getAttribute("placeholder");
		if (exp.equals("Username")) {
			System.out.println("Mouse pointer is in username field");
			element.sendKeys("admin", Keys.TAB);
			WebElement element1 = driver.switchTo().activeElement();
			String exp1 = element1.getAttribute("placeholder");
			if (exp1.equals("Password")) {
				System.out.println("Mouse pointer is in password field");

	}
}}}