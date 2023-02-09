package dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automonth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement months = driver.findElement(By.cssSelector(
				"html>body>#section>div>div>div:nth-of-type(2)>#basicBootstrapForm>div:nth-of-type(11)>div:nth-of-type(2)>select"));
		Select monthlist = new Select(months);
		System.out.println("is month dropdown is multiple : " + monthlist.isMultiple());
		System.out.println("is month dropdown has default status : " + monthlist.getFirstSelectedOption().getText());
		/*
		 * List <String>monthdrop= new ArrayList<String>(); for(int
		 * i=1;i<monthlist.getOptions().size();i++) { String month =
		 * monthlist.getOptions().get(i).getText(); monthdrop.add(month); } for(int
		 * i=0;i<monthdrop.size();i++) { System.out.println(monthdrop.get(i)); }
		 * monthlist.selectByVisibleText("August");
		 * System.out.println("selected month is : "+
		 * monthlist.getFirstSelectedOption().getText());
		 */
		List<WebElement> monthdrop = monthlist.getOptions();
		for (int i = 1; i < monthdrop.size(); i++) {
			System.out.println(monthdrop.get(i).getText());
		}

		String exp = "January, February, March, April, May, June, July, August, September, October, November, December";
		String act = "";
		/*
		 * for(int i=1; i<monthlist.getOptions().size();i++) {
		 * if(i!=(monthlist.getOptions().size()-1)) {
		 * act=act+monthlist.getOptions().get(i).getText()+", "; } else {
		 * act=act+monthlist.getOptions().get(i).getText(); } }
		 */
		for (int i = 1; i < monthdrop.size(); i++) {
			if (i != (monthdrop.size() - 1)) {
				act = act + monthdrop.get(i).getText() + ", ";
			} else {
				act = act + monthdrop.get(i).getText();
			}
		}
		System.out.println("actual string :" + act);
		System.out.println("expected string :" + exp);
		System.out.println("string matches :" + act.equals(exp));
		
		
		String expected= "September";
		monthlist.selectByIndex(9);
		System.out.println("selected month is : "+monthlist.getFirstSelectedOption().getText());
		System.out.println("selected month calidation: "+monthlist.getFirstSelectedOption().getText().equals(expected));
	}

}
