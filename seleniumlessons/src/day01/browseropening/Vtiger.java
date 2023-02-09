package day01.browseropening;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	WebElement user =driver.findElement(By.id("username"));
	user.clear();
	user.sendKeys("admin");
	WebElement pwd =driver.findElement(By.id("password"));
	pwd.clear();
	pwd.sendKeys("Test@123");
	driver.findElement(By.className("buttonBlue")).submit();
	driver.findElement(By.className("fa-user")).click();
	driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	}

}
