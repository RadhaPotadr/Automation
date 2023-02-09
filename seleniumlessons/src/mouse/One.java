package mouse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class One {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement element =driver.findElement(By.cssSelector("body"));
		element.sendKeys(Keys.ESCAPE);
		List <WebElement>menu=driver.findElements(By.cssSelector("#container>div>div:nth-of-type(2)>div>div>div>a"));
		Actions act=new Actions(driver);
		System.out.println("********************to go to menu options one by one*********************");
		for(int i=0;i<menu.size();i++) {
			act.moveToElement(menu.get(i)).build().perform();
			Thread.sleep(1000);
		}
		System.out.println("********************to go to perticular menu option *********************");
			act.moveToElement(menu.get(4)).build().perform();
		System.out.println("********************to right click on perticular menu option *********************");	
		act.moveToElement(menu.get(4)).contextClick().build().perform();
		System.out.println("********************to right click on menu options one by one *********************");	
		for(int i=0;i<menu.size();i++) {
			act.moveToElement(menu.get(i)).contextClick().build().perform();
			Thread.sleep(1000);
		}
		System.out.println("********************to open menu option on next tab one by one*********************");
		for(int i=0;i<menu.size();i++) {
		act.keyDown(Keys.CONTROL).click(menu.get(i)).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
	   }
		
		System.out.println("********************to open perticular menu option on next tab*********************");
		WebElement s=menu.get(1);
		act.keyDown(Keys.CONTROL).click(s).keyUp(Keys.CONTROL).build().perform();
		
		}	
	}
