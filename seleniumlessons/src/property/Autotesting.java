package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autotesting {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(
				"D:\\Automation\\workspace\\seleniumlessons\\src\\property\\Autotesting.properties");
		Properties prop = new Properties();
		prop.load(file);
		prop.getProperty("FirstName");
		prop.getProperty("LastName");
		prop.getProperty("Address");
		prop.getProperty("Emailid");
		prop.getProperty("Phone");
		String g = prop.getProperty("Gender");
		String H = prop.getProperty("Hobbies");
		String L = prop.getProperty("Language");
		String sk = prop.getProperty("Skill");
		String I = prop.getProperty("Country");
		String Y = prop.getProperty("Year");
		String M = prop.getProperty("month");
		String D = prop.getProperty("day");
		prop.getProperty("Password");
		prop.getProperty("Confirmpassword");
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		//driver.navigate().refresh();
		driver.findElement(By.cssSelector("#basicBootstrapForm>div>div:nth-of-type(1)>input[placeholder='First Name']"))
				.sendKeys(prop.getProperty("FirstName"));
		driver.findElement(By.cssSelector("#basicBootstrapForm>div>div:nth-of-type(2)>input[placeholder='Last Name']"))
				.sendKeys(prop.getProperty("LastName"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("#basicBootstrapForm>div:nth-of-type(2)>div")));
		driver.findElement(By.cssSelector("#basicBootstrapForm>div:nth-of-type(2)>div>textarea"))
				.sendKeys(prop.getProperty("Address"));
		driver.findElement(By.cssSelector("#basicBootstrapForm>div:nth-of-type(3)>#eid>input"))
				.sendKeys(prop.getProperty("Emailid"));
		driver.findElement(By.cssSelector("#basicBootstrapForm>div:nth-of-type(4)>div>input"))
				.sendKeys(prop.getProperty("Phone"));
		List<WebElement> gender = driver
				.findElements(By.cssSelector("#basicBootstrapForm>div:nth-of-type(5)>div>label"));
		for (int i = 0; i < gender.size(); i++) {
			// System.out.println(gender.get(i).getText());
			if (gender.get(i).getText().trim().equals(g)) {
				gender.get(i).click();
				break;
			}
		}
		System.out.println("*********************************************************");
		WebElement hobbyid = driver.findElement(By.cssSelector("#basicBootstrapForm>div:nth-of-type(6)>div>div>input"));
		List<WebElement> hobbyidlist = driver
				.findElements(By.cssSelector("#basicBootstrapForm>div:nth-of-type(6)>div>div>input"));
		for (int z = 0; z < hobbyidlist.size(); z++) {
			if (hobbyidlist.get(z).getAttribute("value").trim().equals(H)) {
				driver.findElement(By.id(hobbyidlist.get(z).getAttribute("id"))).click();
				;
				break;
			}
		}
		System.out.println("*********************************************************");
		
		System.out.println("*****************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("country")));
		driver.findElement(By.id("country"));
		WebElement con = driver.findElement(By.id("country"));
		Select condrop = new Select(con);
		List<WebElement> conlist = condrop.getOptions();
		for (int i = 1; i < conlist.size(); i++) {
			if (conlist.get(i).getText().equals(I)) {
				conlist.get(i).click();
			}
		}
		System.out.println("*****************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("yearbox")));
		driver.findElement(By.id("yearbox"));
		WebElement year = driver.findElement(By.id("yearbox"));
		Select yeardrop = new Select(year);
		List<WebElement> yearlist = yeardrop.getOptions();
		for (int i = 1; i < yearlist.size(); i++) {
			if (yearlist.get(i).getText().equals(Y)) {
				yearlist.get(i).click();
			}
		}
		System.out.println("*****************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("daybox")));
		driver.findElement(By.id("daybox"));
		WebElement day = driver.findElement(By.id("daybox"));
		Select daydrop = new Select(day);
		List<WebElement> daylist = daydrop.getOptions();
		for (int i = 1; i < daylist.size(); i++) {
			if (daylist.get(i).getText().equals(D)) {
				daylist.get(i).click();
			}
		}
		System.out.println("*****************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("#basicBootstrapForm>div:nth-of-type(11)>div:nth-of-type(2)>select")));
		driver.findElement(By.cssSelector("#basicBootstrapForm>div:nth-of-type(11)>div:nth-of-type(2)>select"));
		WebElement month = driver
				.findElement(By.cssSelector("#basicBootstrapForm>div:nth-of-type(11)>div:nth-of-type(2)>select"));
		Select monthdrop = new Select(month);
		List<WebElement> monthlist = monthdrop.getOptions();
		for (int i = 1; i < monthlist.size(); i++) {
			if (monthlist.get(i).getText().equals(M)) {
				monthlist.get(i).click();
			}
		}
		// driver.findElement(By.cssSelector("#basicBootstrapForm>div:nth-of-type(9)>div")).click();
		driver.findElement(By.id("firstpassword")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.id("secondpassword")).sendKeys(prop.getProperty("Confirmpassword"));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("Skills")));
				driver.findElement(By.id("Skills")).click();
				WebElement drop = driver.findElement(By.id("Skills"));
				Select skill = new Select(drop);
				List<WebElement> alloptions = skill.getOptions();
				for (int i = 1; i < alloptions.size(); i++) {
					if (alloptions.get(i).getText().equals(sk)) {
						alloptions.get(i).click();
					}
				}
		
		System.out.println("****************************");
		driver.findElement(By.id("msdd")).click();
		 List <WebElement>langOptions=
		 driver.findElements(By.cssSelector("#basicBootstrapForm>div:nth-of-type(7)>div>multi-select>div:nth-of-type(2)>ul>li"));
		 for(int j=0;j<langOptions.size();j++) {
			 //System.out.println(langOptions.get(j).getText());
		 if(langOptions.get(j).getText().equals(L)){
			 //System.out.println(langOptions.get(j).getText());
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#basicBootstrapForm>div:nth-of-type(7)>div>multi-select>div:nth-of-type(2)>ul>li>a")));
			langOptions.get(j).click();
			 break;
		 }
		}
		 driver.findElement(By.id("submitbtn")).click();
			System.out.println("submitted sucessfully");
	}
}