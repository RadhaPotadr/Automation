package dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class trial2 {
  @Test(dataProvider="testdata")
  public void login(String username,String pwd, String appurl ) {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(appurl);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		System.out.println(driver.getTitle());
		driver.close();
	  
  }
  @DataProvider (name = "testdata")
  public Object[][] getdata() {
	  Object[][] obj = 
	  {
		  {"admin","manager","https://demo.actitime.com/"},
		  {"admin","manager","https://demo.actitime.com/"}
	  };
		  return obj;
  }
}
