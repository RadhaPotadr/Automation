package day04.position;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Actitime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		/*List <WebElement> users=driver.findElements(By.xpath("/html/body//table[@id='demoCredentials']/tbody/tr/td[2]/b"));
		WebElement pwd1 =driver.findElement(By.cssSelector("table[id='demoCredentials']>tbody>tr:nth-of-type(2)>td>b"));
		WebElement pwd2 =driver.findElement(By.cssSelector("table[id='demoCredentials']>tbody>tr:nth-of-type(4)>td>b"));
		List <WebElement> pwds=new ArrayList();
		pwds.add(pwd1);
		pwds.add(pwd2);
		for(int i=0; i<users.size();i++) {
		System.out.println("user: "+users.get(i).getText());
		System.out.println("pass: "+pwds.get(i).getText());
		}
		//WebElement one =driver.findElement(By.name("username"));
		//WebElement two =driver.findElement(By.name("pwd"));
		for(int i=0; i<users.size();i++) {
			
			users=driver.findElements(By.xpath("/html/body//table[@id='demoCredentials']/tbody/tr/td[2]/b"));
			WebElement one=driver.findElement(By.name("username"));
			one.click();
			one.sendKeys(users.get(i).getText());
			WebElement two=driver.findElement(By.name("pwd"));
			two.click();
			pwds=new ArrayList();
			pwds.add(pwd1);
			pwds.add(pwd2);
			two.sendKeys(pwds.get(i).getText());
			driver.findElement(By.id("loginButton")).click();
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
			String exppagetitle= "actiTIME - Enter Time-Track";
			System.out.println("page hometitle  : "+ driver.getTitle());
			System.out.println("page hometitle validation : "+ driver.getTitle().equals(exppagetitle));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("logoutLink")).click();
			wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		}*/
		List <WebElement> users=driver.findElements(By.cssSelector("table[id='demoCredentials']>tbody>tr>td>b"));
		for(int i=0; i<=users.size()/2;i++) {
			WebElement one=driver.findElement(By.name("username"));
			users=driver.findElements(By.cssSelector("table[id='demoCredentials']>tbody>tr>td>b"));
			one.sendKeys(users.get(i).getText());
			WebElement two=driver.findElement(By.name("pwd"));
			users=driver.findElements(By.cssSelector("table[id='demoCredentials']>tbody>tr>td>b"));
			two.sendKeys(users.get(i+1).getText());
			driver.findElement(By.id("loginButton")).click();
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
			String exppagetitle= "actiTIME - Enter Time-Track";
			System.out.println("page hometitle  : "+ driver.getTitle());
			System.out.println("page hometitle validation : "+ driver.getTitle().equals(exppagetitle));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("logoutLink")).click();
			wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
			i=i+1;
	}
}
}
// pwd 1 table[id='demoCredentials']>tbody>tr:nth-of-type(2)>td>b
// pwd 2 table[id='demoCredentials']>tbody>tr:nth-of-type(4)>td>b
//all table[id='demoCredentials']>tbody>tr>td>b