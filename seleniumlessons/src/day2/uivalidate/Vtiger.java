package day2.uivalidate;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Vtiger {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		System.out.println("username field is present : "+driver.findElement(By.id("username")).isDisplayed());
		System.out.println("username field is editable : "+driver.findElement(By.id("username")).isEnabled());
		System.out.println("username field has default text : "+driver.findElement(By.id("username")).getAttribute("placeholder"));
		System.out.println("username field default text validation: "+driver.findElement(By.id("username")).getAttribute("placeholder").equals("Username"));
		System.out.println("username field has credential : "+driver.findElement(By.id("username")).getAttribute("value"));
		System.out.println("username field credential validation: "+driver.findElement(By.id("username")).getAttribute("value").equals("admin"));
		System.out.println("password field is present : "+driver.findElement(By.id("password")).isDisplayed());
		System.out.println("password field is editable : "+driver.findElement(By.id("password")).isEnabled());
		System.out.println("password field has default text: "+driver.findElement(By.id("password")).getAttribute("placeholder"));
		System.out.println("password field  default text validation: "+driver.findElement(By.id("password")).getAttribute("placeholder").equals("Password"));
		System.out.println("password field has credential : "+driver.findElement(By.id("password")).getAttribute("value"));
		System.out.println("password field credential validation: "+driver.findElement(By.id("password")).getAttribute("value").equals("Test@123"));
		System.out.println("sign in button is present : "+driver.findElement(By.className("buttonBlue")).isDisplayed());
		System.out.println("sign in button is editable : "+driver.findElement(By.className("buttonBlue")).isEnabled());
		System.out.println("sign in button has name : "+driver.findElement(By.className("buttonBlue")).getText().trim());
		System.out.println("sign in button has name : "+driver.findElement(By.className("buttonBlue")).getText().trim().equals("Sign in"));
		WebElement user =driver.findElement(By.id("username"));
		user.clear();
		user.sendKeys("admin");
		WebElement pwd =driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("Test@123");
		driver.findElement(By.className("buttonBlue")).click();
		driver.findElement(By.className("fa-user")).click();
		System.out.println("sign out button is present : "+driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).isDisplayed());
		System.out.println("sign out button is editable : "+driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).isEnabled());
		System.out.println("sign out button has name : "+driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).getText().trim());
		System.out.println("sign out button name validation : "+driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).getText().trim().equals("Sign Out"));
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	}

}
