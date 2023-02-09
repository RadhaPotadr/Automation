package calander;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		WebElement source =driver.findElement(By.id("src"));
		source.click();
		source.sendKeys("pune");
		List <WebElement> puneOptions=driver.findElements(By.cssSelector("#search_div>#search>div>div>div>ul>li"));
		for(int i=0;i<puneOptions.size();i++) {
			//System.out.println(puneOptions.get(i).getText());
			if(puneOptions.get(i).getText().equals("Shivaji Nagar, Pune")) {
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.elementToBeClickable(By.id("src")));
				//System.out.println(puneOptions.get(i).getText());
				puneOptions.get(i).click();
				break;
			}
		}
		System.out.println("*******src*************");
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.cssSelector("div.rb-calendar>table>tbody>tr:nth-of-type(1)>.next")).click();
		 driver.findElement(By.cssSelector("div.rb-calendar>table>tbody>tr:nth-of-type(4)>td:nth-of-type(4)")).click();
		 System.out.println("********cala*******");	
			WebElement destination =driver.findElement(By.id("dest"));
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("dest")));
			destination.click();
			destination.sendKeys("goa");
			List <WebElement> goaOptions=driver.findElements(By.cssSelector("#search_div>#search>div>div:nth-of-type(2)>div>ul>li"));
			for(int i=0;i<goaOptions.size();i++) {
				//System.out.println(goaOptions.get(i).getText());
				if(goaOptions.get(i).getText().equals("Pernem, Goa")) {
					//System.out.println(puneOptions.get(i).getText());
					goaOptions.get(i).click();
					break;
				}
			}
			 System.out.println("********desti******");	
		 driver.findElement(By.id("search_btn")).click();
		 System.out.println("********search******");
		 
		 List<WebElement>ac=driver.findElements(By.cssSelector("#filter-block>div>.details>ul:nth-of-type(3)>li>label:nth-of-type(2)")) ;
		 for(int i=0;i<ac.size();i++) {
			 if(ac.get(i).getAttribute("title").equals("AC")) {
				 ac.get(i).click();
			 }
		 }
		 System.out.println("*******ac******");	
		 List<WebElement>depart=driver.findElements(By.cssSelector(" #filter-block>div>.details>ul:nth-of-type(2)>li>label:nth-of-type(2)")) ;
		 for(int i=0;i<depart.size();i++) {
			// if((depart.get(i).getAttribute("title").equals("Before 6 am"))!=true) {
			 if((depart.get(i).getAttribute("title").equals("After 6 pm"))){
				 depart.get(i).click();
			 }
		 }
		 System.out.println("********time******");
		 
		 TimeUnit.SECONDS.sleep(5);		 
		/* wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.tripleFive-block>.close-primo>i")));
		 try {	
			 driver.findElement(By.cssSelector("div.tripleFive-block>.close-primo>i")).click();
			}
				catch(NoSuchElementException e) {
					System.out.println(e);
				}*/
		 System.out.println("********popup******");	
		TimeUnit.SECONDS.sleep(5);
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn")));
		// driver.findElement(By.cssSelector(".button>i")).click();
		// wait.until(ExpectedConditions.numberOfElementsToBe((By.cssSelector(".travels")), 18));
		
		 List<WebElement>names=driver.findElements(By.cssSelector(".travels"));
		 System.out.println(names.size());
		 List<WebElement>price=driver.findElements(By.cssSelector(".seat-fare>.fare>span"));
		 System.out.println(price.size());
		 for(int i=0;i<names.size();i++) {
			 System.out.println(names.get(i).getText()+"   :   "+price.get(i).getText());
		 }
			
		 }  
		}	 
	

