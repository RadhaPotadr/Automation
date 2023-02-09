package day01.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleInChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://www.google.com");
		cd.close();
	}
}
