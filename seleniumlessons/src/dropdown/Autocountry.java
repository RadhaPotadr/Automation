package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autocountry {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement con= driver.findElement(By.id("country"));
		Select condrop = new Select(con);
		List <WebElement> conlist= condrop.getOptions();
		for(int i=1;i<conlist.size();i++) {
			System.out.println(conlist.get(i).getText());
		}
		String exp="Australia,Bangladesh,Denmark,Hong Kong,India,Japan,Netherlands,New Zealand,South Africa,United States of America";
		String act="";
		for(int i=1;i<conlist.size();i++) {
			if(i!=(conlist.size()-1)) {
				act=act+conlist.get(i).getText()+",";
			}
			else {
				act=act+conlist.get(i).getText();
			}
		}
		System.out.println("exp string :"+exp);
		System.out.println("act string :"+act);
		System.out.println("string matches :"+exp.equals(act));
	}

}