package day01.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserWithGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String exepath= System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver",exepath);
      WebDriver wb= new ChromeDriver(); 
	}

}
