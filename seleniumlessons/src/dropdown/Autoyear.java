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

public class Autoyear {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement year= driver.findElement(By.id("yearbox"));
		Select yeardrop= new Select(year);
		System.out.println("is it multiple dropdown : "+yeardrop.isMultiple());
		System.out.println("default status :"+ yeardrop.getFirstSelectedOption().getText());
		List<Integer>yearlist= new ArrayList();
		for(int i=1;i<yeardrop.getOptions().size();i++) {
			String yearvalue= yeardrop.getOptions().get(i).getText();
			yearlist.add(Integer.parseInt(yearvalue));
		}
		for(int i=0;i<yearlist.size();i++) {
			System.out.println(yearlist.get(i));
		}
		yeardrop.selectByVisibleText("1994");
		System.out.println("selected year : "+yeardrop.getFirstSelectedOption().getText());
		
		List<Integer>yearlist1= new ArrayList<Integer>(yearlist);
		Collections.sort(yearlist1);
		System.out.println(yearlist);
		System.out.println(yearlist1);
		System.out.println("is year dropdown is in ascending order :"+yearlist.equals(yearlist1));
		
		
		
}
}