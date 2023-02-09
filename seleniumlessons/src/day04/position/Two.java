package day04.position;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Two {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		WebDriverWait wait = new WebDriverWait(driver,20);
		String[] p1 = driver.findElement(By.cssSelector(".login_password")).getText().split("\n");
		String[] name = driver.findElement(By.id("login_credentials")).getText().split("\n");
	for(int i=1;i<name.length;i++) {
		WebElement one =driver.findElement(By.id("user-name"));
		one.clear();
		one.sendKeys(name[i]);
		WebElement	two=driver.findElement(By.id("password"));
		two.clear();
		two.sendKeys(p1[1]);
		driver.findElement(By.id("login-button")).click();
		if(driver.getCurrentUrl().contains("inventory")) {
			wait.until(ExpectedConditions.urlContains("inventory"));
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		}
		else
		 {
		System.out.println("Epic sadface: Sorry, this user has been locked out.");
		one.clear();
		two.clear();
		}
		}
	}
	}

//title=Swag Labs
	//logout -> id=react-burger-menu-btn
	//logoutbutton -> id=logout_sidebar_link