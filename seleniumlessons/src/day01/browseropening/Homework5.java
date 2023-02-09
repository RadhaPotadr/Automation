package day01.browseropening;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Homework5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		wb.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement username=wb.findElement(By.name("username"));
		username.clear();
		username.sendKeys("Admin");
		WebElement pwd= wb.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys("admin123");
		WebElement btn =wb.findElement(By.className("orangehrm-login-button"));
		wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		btn.click();
		//WebElement logout= wb.findElement(By.className("oxd-userdropdown-link"));
		WebElement logout= wb.findElement(By.tagName("a"));
		//logout.getAttribute("href");
		System.out.println(logout.getAttribute("href"));
		logout.click();
	}

}
