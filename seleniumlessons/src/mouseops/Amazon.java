package mouseops;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<WebElement> amazon = driver.findElements(By.cssSelector(
				"#nav-xshop-container>div>a"));
		Actions act=new Actions(driver);
		System.out.println("********************to go to menu options one by one*********************");
		for(int i=0;i<amazon.size();i++) {
			act.moveToElement(amazon.get(i)).build().perform();
			System.out.println(amazon.get(i).getText());
			//Thread.sleep(1000);
		}
	}

}
