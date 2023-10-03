package parallel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelMethod {

		WebDriver driver;

		@Test(priority = 1)
		public void testChrome() throws InterruptedException {
			System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.bstackdemo.com/");
			driver.manage().window().maximize();
			Assert.assertEquals(driver.getTitle(), "StackDemo");
		}

		@Test(priority = 2)
		public void testFirefox() throws InterruptedException {
			System.out.println("The thread ID for Firefox is " + Thread.currentThread().getId());
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.bstackdemo.com/");
			driver.manage().window().maximize();
			Assert.assertEquals(driver.getTitle(), "StackDemo");
		}
		/*@Test(priority = 3)
		public void testTitle() {
			System.setProperty("webdriver.edge.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.bstackdemo.com/");
			driver.manage().window().maximize();
			System.out.println("The thread ID for testTitle Edge is " + Thread.currentThread().getId());
			Assert.assertEquals(driver.getTitle(), "StackDemo");
		}*/
}

