package day01.browseropening;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		String exePath = System.getProperty("user.dir") + "\\drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		FirefoxDriver fdriver=new FirefoxDriver();  
	}

}
