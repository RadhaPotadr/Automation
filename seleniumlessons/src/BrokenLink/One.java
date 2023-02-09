package BrokenLink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/broken");
		 List<WebElement> links = driver.findElements(By.tagName("a"));
	        // This line will print the number of links and the count of links.
	        System.out.println("No of links are "+ links.size());        
	        //checking the links fetched.
	        for(int i=0;i<links.size();i++){
	            String url= links.get(i).getAttribute("href");
	        try
	        {
	            URL urlc = new URL(url);
	            //Now we will be creating url connection and getting the response code
	            HttpURLConnection httpURLConnect=(HttpURLConnection)urlc.openConnection();
	            httpURLConnect.setConnectTimeout(5000);
	            httpURLConnect.connect();
	            if(httpURLConnect.getResponseCode()>=400)
	            {
	            	System.out.println(url+"----response code is----> "+httpURLConnect.getResponseMessage()+"---- is a invalid/broken link");
	            }           
	            //Fetching and Printing the response code obtained
	            else{
	                System.out.println(url+"----response code is---->"+httpURLConnect.getResponseMessage()+ "---- Valid link");
	            }
	        }catch (Exception e) {
	      }
	}
	}
}
