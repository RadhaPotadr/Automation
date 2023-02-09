package screenshot;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class One {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		//get screenshot using getScreenshotAs() of TakesScreenshot interface
		File file=ts.getScreenshotAs(OutputType.FILE);
		//store above screenshot into required location
		FileUtils.copyFile(file,new File(".\\snapshot\\Vtiger2.jpg"));
		//FileHandler.copy(file, new File(".\\ss\\screenshot.jpg"));
		//FileHandler.copy(file, new File("C:\\Users\\Radha\\OneDrive\\Desktop\\screenshot.jpg"));
		//FileHandler.copy(file, new File("D:\\Automation\\workspace\\seleniumlessons\\snapshot\\screen.jpg"));

	}

}
