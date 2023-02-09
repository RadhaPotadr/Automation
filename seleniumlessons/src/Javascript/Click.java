package Javascript;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day5.setup.Browser;
public class Click  {

	public static void main(String[] args) {
		Click ck= new Click();
		ck.testCase1();
		//ck.testCase2();
	}
	public void testCase1() {
		WebDriver driver=Browser.setUp("chrome","https://demo.actitime.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		js.executeScript("document.getElementById('username').value='admin'");
		js.executeScript("document.getElementsByName('pwd')[0].value='manager'");
		js.executeScript("document.getElementById('loginButton').click();");	
	}
	
}
