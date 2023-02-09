package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tata {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/stocks/marketstats/nsemact1/index.php?index=FNO");
		driver.findElement(By.xpath("//p[text()='Consent']")).click();
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		System.out.println("price of TATA STEEL Share is :"
				+ driver.findElement(By.xpath("//tr[td[h3[a[text()='Tata Steel']]]]/td[6]")).getText());

	}

}
