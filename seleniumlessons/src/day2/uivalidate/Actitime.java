package day2.uivalidate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		System.out.println(" ********************username field*********************");
		System.out.println(" username field is present : "+driver.findElement(By.name("username")).isDisplayed());
		System.out.println(" username field is editable : "+driver.findElement(By.name("username")).isEnabled());
		System.out.println(" username field has default text : "+driver.findElement(By.name("username")).getAttribute("placeholder"));
		System.out.println(" username field default text validation: "+driver.findElement(By.name("username")).getAttribute("placeholder").equals("Username"));
		System.out.println("******************* password field*************************");
		System.out.println(" password field is present : "+driver.findElement(By.name("pwd")).isDisplayed());
		System.out.println(" password field is editable : "+driver.findElement(By.name("pwd")).isEnabled());
		System.out.println("password field has default text : "+driver.findElement(By.name("pwd")).getAttribute("placeholder"));
		System.out.println("password field default text validation: "+driver.findElement(By.name("pwd")).getAttribute("placeholder").equals("Password"));
		System.out.println("********************checkbox field***********************");
		System.out.println("checkbox field is present : "+driver.findElement(By.name("remember")).isDisplayed());
		System.out.println("checkbox field is editable : "+driver.findElement(By.name("remember")).isEnabled());
		System.out.println("checkbox field has default selection : "+driver.findElement(By.name("remember")).isSelected());
		driver.findElement(By.name("remember")).click();
		System.out.println("checkbox field has status after selection : "+driver.findElement(By.name("remember")).isSelected());
		System.out.println("***************keep me logged in field***********************");
		System.out.println("keep me logged in field is present : "+driver.findElement(By.id("keepLoggedInLabel")).isDisplayed());
		System.out.println("keep me logged infield is editable : "+driver.findElement(By.id("keepLoggedInLabel")).isEnabled());
		System.out.println("keep me logged in field has name : "+driver.findElement(By.id("keepLoggedInLabel")).getText().trim());
		System.out.println("keep me logged in field name validation : "+driver.findElement(By.id("keepLoggedInLabel")).getText().trim().equals("Keep me logged in"));
		System.out.println("*******************login button*************************");
		System.out.println("login button is present : "+driver.findElement(By.id("loginButton")).isDisplayed());
		System.out.println("login button is editable : "+driver.findElement(By.id("loginButton")).isEnabled());
		System.out.println("login button has name  : "+driver.findElement(By.id("loginButton")).getText().trim());
		System.out.println("login button name validation : "+driver.findElement(By.id("loginButton")).getText().trim().equals("Login"));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("****************************logout button*************");
		System.out.println("logout button is present : "+driver.findElement(By.id("logoutLink")).isDisplayed());
		System.out.println("logout button is editable : "+driver.findElement(By.id("logoutLink")).isEnabled());
		System.out.println("logout button has name  : "+driver.findElement(By.id("logoutLink")).getText().trim());
		System.out.println("logout button name validation : "+driver.findElement(By.id("logoutLink")).getText().trim().equals("Logout"));
		driver.findElement(By.id("logoutLink")).click();
	}

}
