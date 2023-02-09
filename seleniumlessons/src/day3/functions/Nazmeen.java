package day3.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nazmeen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com");
		driver.manage().getCookies();
		System.out.println(driver.getTitle());
		driver.manage().window().setSize(new Dimension(500,600));
		driver.manage().window().maximize();
		driver.findElement(By.id("ez-accept-all")).click();
		System.out.println("******************JAVA*************");
		driver.findElement(By.cssSelector("a['href='https://www.techlistic.com/p/java.html']")).click();
		System.out.println("page title is :" + driver.getTitle());
		driver.navigate().back();
		System.out.println("******************seleniumlink*************");
	    driver.findElement(By.cssSelector("a['href='https://www.techlistic.com/p/selenium-tutorials.html']")).click();
		System.out.println("page title is :" + driver.getTitle());
		driver.navigate().back();
		System.out.println("******************BDD*************");
		driver.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html']")).click();
		System.out.println("page title is :" + driver.getTitle());
		driver.navigate().back();
	}

}
