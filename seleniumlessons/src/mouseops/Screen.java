package mouseops;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement element =driver.findElement(By.cssSelector("body"));
		element.sendKeys(Keys.ESCAPE);
		List <WebElement>menu=driver.findElements(By.cssSelector("#container>div>div:nth-of-type(2)>div>div>div>a"));
		Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		act.moveToElement(menu.get(2)).perform();
		List <WebElement> fashion=driver.findElements(By.xpath("//div[@class='_2IjXr8']/div/a"));
		for(int i=0;i<fashion.size();i++) {
	if(!fashion.get(i).getText().equals("All")) {
		System.out.println(fashion.get(i).getText());
		/*fashion.get(i).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		search.sendKeys(Keys.chord(Keys.CONTROL,"v"));*/
		//Thread.sleep(1000);
	}
	}

	}}
