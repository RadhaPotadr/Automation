package day2.uivalidate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("username field is present : "+driver.findElement(By.name("username")).isDisplayed());
		System.out.println("username field is editable : "+driver.findElement(By.name("username")).isEnabled());
		System.out.println("username field has default text : "+driver.findElement(By.name("username")).getAttribute("placeholder"));
		System.out.println("username field default text validation : "+driver.findElement(By.name("username")).getAttribute("placeholder").equals("Username") );
		System.out.println("password field is present : "+driver.findElement(By.name("password")).isDisplayed());
		System.out.println("password field is editable : "+driver.findElement(By.name("password")).isEnabled());
		System.out.println("password field has default text : "+driver.findElement(By.name("password")).getAttribute("placeholder"));
		System.out.println("password field default text validation : "+driver.findElement(By.name("password")).getAttribute("placeholder").equals("Password") );
		System.out.println("login button is present : "+driver.findElement(By.className("orangehrm-login-button")).isDisplayed());
		System.out.println("login button is clickable : "+driver.findElement(By.className("orangehrm-login-button")).isEnabled());
		System.out.println("login button has name : "+	driver.findElement(By.className("orangehrm-login-button")).getText().trim());
		System.out.println("login button name valiadtion : "+driver.findElement(By.className("orangehrm-login-button")).getText().trim().equals("Login"));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		driver.findElement(By.className("oxd-userdropdown-icon")).click();
		System.out.println("logout button is present : "+driver.findElement(By.linkText("Logout")).isDisplayed());
		System.out.println("logout button is clickable : "+driver.findElement(By.linkText("Logout")).isEnabled());
		System.out.println("logoutbutton has name : "+	driver.findElement(By.linkText("Logout")).getText().trim());
		System.out.println("logout button name valiadtion : "+driver.findElement(By.linkText("Logout")).getText().trim().equals("Logout"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
