package day01.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver sec= new ChromeDriver();
		sec.get("https://www.facebook.com");
		System.out.println("page title: "+sec.getTitle());
		sec.close();	

	}

}
