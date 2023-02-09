package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("_2doB4z")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[text()='Appliances']")).click();
		driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/fk-p-flap/100/100/image/6bc444dacd6be318.jpg?q=50']")).click();
	System.out.println("price of SAMSUNG The Frame 138 cm (55 inch) QLED Ultra HD (4K) Smart Tizen TV is : "+driver.findElement(By.xpath("//div[div[div[text()='SAMSUNG The Frame 138 cm (55 inch) QLED Ultra HD (4K) Smart Tizen TV']]]/div[2]/div/div/div")).getText());
	}

}
