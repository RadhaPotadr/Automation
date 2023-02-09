package mouseops;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Cricinfo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cricinfo.com/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		List<WebElement>cricket=driver.findElements(By.xpath("//div[@class='ds-flex ds-flex-row']//a"));
		Actions act=new Actions(driver);
		System.out.println("********************to go to menu options one by one*********************");
		for(int i=0;i<cricket.size();i++) {
			act.moveToElement(cricket.get(i)).build().perform();
			System.out.println("***************************"+cricket.get(i).getText()+"***************************");
			Thread.sleep(1000);
			List<WebElement>options=driver.findElements(By.xpath("//div[@class='tippy-content']/div/div/div/ul/li"));
			for(int j=0;j<options.size();j++) {
				System.out.println(options.get(j).getText());
			
			}	
		}
	}
	}

/*	try {
					driver.findElement(By.id("#wzrk-cancel")).click();
				}
				catch(Exception e) {
					System.out.println("handled");
				}*/
