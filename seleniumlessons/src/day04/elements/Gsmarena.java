package day04.elements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		driver.findElement(
				By.cssSelector("html>body>#uniccmp>div>div>div>div>div:nth-of-type(3)>div>button:nth-of-type(2)"))
				.click();
		driver.navigate().refresh();
		List<WebElement> mb = driver.findElements(
				By.cssSelector("html>body>#wrapper>div>div:nth-of-type(2)>aside>div:nth-of-type(1)>ul>li>a"));
		System.out.println("no of menu options :" + mb.size());
		for (int i = 0; i < mb.size(); i++) {
			System.out.println("mobile phone name is  " + mb.get(i).getText());
		}
		for (int i = 0; i < mb.size(); i++) {
			if (mb.get(i).getText().equals("SAMSUNG")) {
				mb.get(i).click();
				break;
			}
		}
		for (int j = 0; j < 16; j++) {
			List<WebElement> samsung = driver.findElements(By.cssSelector(
					"html>body>#wrapper>div>#body>div>#review-body>div:nth-of-type(1)>ul>li>a>strong>span"));
			System.out.println("no of samsung devices :" + samsung.size());
			for (int i = 0; i < samsung.size(); i++) {
				System.out.println("samsung device name " + samsung.get(i).getText());
			}
			if(driver.findElement(By.cssSelector("html>body>#wrapper>div>#body>div>.review-nav >div:nth-of-type(2)>.pages-next")).isEnabled()) {
			driver.findElement(
					By.cssSelector("html>body>#wrapper>div>#body>div>.review-nav >div:nth-of-type(2)>.pages-next"))
					.click();
		}

	}

}
}
