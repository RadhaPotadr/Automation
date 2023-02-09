package dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autodays {

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
		List <Integer> dayselect = new ArrayList<Integer>();
		for(int i=1;i<daydrop.getOptions().size();i++) {
			String day=daydrop.getOptions().get(i).getText();
			dayselect.add(Integer.parseInt(day));
		}	
		for(int i=0;i<dayselect.size();i++) {
			System.out.println(dayselect.get(i));
		}
		daydrop.selectByIndex(10);
		System.out.println("selected day : "+daydrop.getFirstSelectedOption().getText());
		System.out.println(dayselect);
		List <Integer> dayselect1 = new ArrayList<Integer>(dayselect);
		//dayselect1.addAll(dayselect);
		System.out.println(dayselect1);
		Collections.sort(dayselect1);
		System.out.println("is day dropdown is in ascending order :"+dayselect.equals(dayselect1));
		}

	}

