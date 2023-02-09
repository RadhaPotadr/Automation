package day01.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFrirefoxBrowserWithGenric {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		
		WebDriver fd= new FirefoxDriver();
		
	}

}
