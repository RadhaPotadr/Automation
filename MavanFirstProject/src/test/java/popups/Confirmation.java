package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class Confirmation {

	public static void main(String[] args) {

		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.findElement(By.id("accept-choices")).click();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Alert text msg is: "+driver.switchTo().alert().getText());
		//to perform another action on alert, we need to again switch our control to the alert
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("demo")).getText());
	}

}
/**
In order handle any JavaScirpt Pop-up(application specific) we need use driver.switchTo().alert()
because java script popup doesn't contain HTML code
we use predefined functions of Alert to perform any operation on it
after every action control comes back to the main page


*/