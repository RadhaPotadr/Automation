package day01.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenflipkartInFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\geckodriver.exe");
		WebDriver wb= new FirefoxDriver();
		wb.get("http://www.flipkart.com");
		wb.close();
		
	}

}
// its slow