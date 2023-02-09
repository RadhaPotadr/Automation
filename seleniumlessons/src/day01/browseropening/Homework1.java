package day01.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver first= new ChromeDriver();
		first.get("https://demo.actitime.com/");
		System.out.println("page title name : "+first.getTitle());
		System.out.println("page title length : "+first.getTitle().length());
		System.out.println("page URL : "+first.getCurrentUrl());
		String expURL="https://demo.actitime.com/";
		System.out.println("page URL validation : "+expURL.equals(first.getCurrentUrl()));
		System.out.println("page source : "+first.getPageSource());
		System.out.println("page source length : "+first.getPageSource().length());
		//first.close();
		//System.out.println("page source length : "+first.);
		
	}

}
