package day01.browseropening;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Homework4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\geckodriver.exe");
		WebDriver four= new FirefoxDriver();
		four.get("https://demosite.executeautomation.com/Login.html");
		System.out.println("page title : "+four.getTitle());
		System.out.println("page title length  : "+four.getTitle().length());
		System.out.println("page URL : "+four.getCurrentUrl());
		WebElement username= four.findElement(By.name("UserName"));
		username.clear();
		username.sendKeys("execution");
		WebElement pswd= four.findElement(By.name("Password"));
		pswd.clear();
		pswd.sendKeys("admin");
		WebElement btn= four.findElement(By.name("Login"));
		btn.submit();
		System.out.println("page title : "+four.getTitle());
		System.out.println("page title length  : "+four.getTitle().length());
		System.out.println("page URL : "+four.getCurrentUrl());
	
	}

}
