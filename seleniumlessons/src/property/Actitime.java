package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream(".\\properties\\Actitime.properties");
		Properties prop = new Properties();
		prop.load(file);
		prop.getProperty("url");
		prop.getProperty("expTitle");
		prop.getProperty("username");
		prop.getProperty("password");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		String exppagetitle= prop.getProperty("expTitle") ;
		System.out.println("page hometitle  : "+ driver.getTitle());
		System.out.println("page hometitle validation : "+ driver.getTitle().equals(exppagetitle));
		

	}

}
