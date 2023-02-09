package day04.elements;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gsuggestion {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("L2AGLb")).click();
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("SQL");
		search.click();
		List <WebElement> sugg= driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span"));
		System.out.println("number of suggesion : "+ sugg.size());
		for(int i=0;i<sugg.size();i++) {
			System.out.println((i+1)+"suggesion  is : "+ sugg.get(i).getText());
		}
		for(int i=0;i<sugg.size();i++) {
			if(sugg.get(i).getText().equals("sql meaning")) {
				sugg.get(i).click();
				break;
			}
		}
	}
}
