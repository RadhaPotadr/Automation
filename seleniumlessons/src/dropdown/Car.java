package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Car {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement cardropdown = driver.findElement(By.id("multiselect1"));
		Select car = new Select(cardropdown);
		System.out.println("is multiple select dropdown :" + car.isMultiple());
		// System.out.println("default selction :"+ car.getFirstSelectedOption());
		List<WebElement> carlist = car.getOptions();
		for (int i = 0; i < carlist.size(); i++) {
			System.out.println(carlist.get(i).getText());
		}
		car.selectByVisibleText("Swift");
		car.selectByIndex(0);
		List<WebElement> selectCars=car.getAllSelectedOptions();
		for (int i = 0; i < selectCars.size(); i++) {
		System.out.println(selectCars.get(i).getText());
	}

}}
