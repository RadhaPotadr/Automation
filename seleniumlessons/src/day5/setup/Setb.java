package day5.setup;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Setb {

	public static void main(String[] args) {
		WebDriver driver=set("firefox","https://www.amazon.in");
		Actions act= new Actions(driver);
		List<WebElement> amazon = driver.findElements(By.cssSelector(
				"html>body>#a-page>#navbar-main>div>div:nth-of-type(5)>div:nth-of-type(2)>#nav-xshop-container>#nav-xshop>a"));
		movehover(act,amazon);
	}
public static WebDriver set(String B, String url) {
	WebDriver driver=null;
	if(B.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	if(B.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(url);
	return driver;
}
static void movehover(Actions action,List<WebElement>menu) {
	for(int i=0;i<menu.size();i++) {
	action.moveToElement(menu.get(i)).build().perform();
}
}
}