package day01.browseropening;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Actitime {
	public static void main(String[] args) {
		System.out.println("******");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		String pagetitle=driver.getTitle();
		System.out.println("page title is : "+pagetitle );
		System.out.println("page title length is : "+pagetitle.length() );
		System.out.println("page URL is : "+ driver.getCurrentUrl() );
		String expurl="https://demo.actitime.com/login.do";
		System.out.println("page URL validation : "+ driver.getCurrentUrl().equals(expurl));
		//System.out.println("page source is : "+ driver.getPageSource());
		System.out.println("page source length is : "+ driver.getPageSource().length());
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		String exppagetitle= "actiTIME - Enter Time-Track";
		System.out.println("page hometitle  : "+ driver.getTitle());
		System.out.println("page hometitle validation : "+ driver.getTitle().equals(exppagetitle));
		WebDriverWait wait2 = new WebDriverWait(driver,20);
		wait2.until(ExpectedConditions.urlMatches("https://demo.actitime.com/user/submit_tt.do"));
		String Actualurl="https://demo.actitime.com/user/submit_tt.do";
		System.out.println("page homeurl  : "+ driver.getCurrentUrl());
		System.out.println("page homeurl validation : "+ driver.getCurrentUrl().equals(Actualurl));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("logoutLink")).click();
	}
}
