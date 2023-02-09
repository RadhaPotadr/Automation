package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bootstrapdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		WebElement dropdown =driver.findElement(By.id("bsd1-button"));
		dropdown.click();
		List <WebElement>boots= driver.findElements(By.cssSelector(".dropdown-menu >div>a"));
		System.out.println("no of countries : "+boots.size());
		for(int i=0;i<boots.size();i++) {
			System.out.println(boots.get(i).getText());
		}
		boots.get(20).click();
		String Exp="Barbados";
		WebElement selecteion = driver.findElement(By.id("bsd1-button"));
		System.out.println("validation of selection :"+selecteion.getText().equals(Exp));

	}

}


//custom dropdown
