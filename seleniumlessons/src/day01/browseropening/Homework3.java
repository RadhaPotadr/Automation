package day01.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver three = new ChromeDriver();
		three.get("https://www.google.com");
		System.out.println("page URL :" + three.getCurrentUrl());
		System.out.println("page source length :" + three.getPageSource().length());
		three.close();

	}

}
