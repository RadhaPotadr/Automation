package mouseops;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		List<WebElement>img=driver.findElements(By.cssSelector("#gallery>li"));
		WebElement trash=driver.findElement(By.id("trash"));
		Actions act=new Actions(driver);
		//act.dragAndDrop(img.get(3), trash).build().perform();
		for(int i=0;i<img.size();i++) {
			act.dragAndDrop(img.get(i), trash).build().perform();
			Thread.sleep(1000);
		}
		
		List<WebElement>trash1=driver.findElements(By.cssSelector("#trash>ul>li"));
		WebElement img1=driver.findElement(By.id("gallery"));
		for(int i=0;i<trash1.size();i++) {
			act.dragAndDrop(trash1.get(i), img1).build().perform();
			Thread.sleep(1000);
		}
		}
	}
		

