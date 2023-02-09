package day01.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazonInChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.get("http://www.amazon.com");
		cd.get("http://www.amazon.co.uk");
		cd.close();

	}

}
