package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autotesting1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement days =driver.findElement(By.id("daybox"));
	Select daydrop= new Select(days);
	System.out.println("daydrop is multiple dropdown : "+ daydrop.isMultiple());
	System.out.println("daydrop has default status : "+ daydrop.getFirstSelectedOption().getText());
	List <WebElement> daylist= daydrop.getOptions();
	for(int i=0;i<daydrop.getOptions().size();i++) {
		System.out.println(daydrop.getOptions().get(i).getText());
	}
	daydrop.selectByIndex(10);
	System.out.println("daydrop has default status : "+ daydrop.getFirstSelectedOption().getText());
   String expected="10";
   System.out.println("selected option status : "+daydrop.getFirstSelectedOption().getText().equals(expected));
	}
}