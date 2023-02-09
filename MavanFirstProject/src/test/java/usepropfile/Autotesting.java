package usepropfile;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class Autotesting {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver= s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		s1.typeInput(driver.findElement(By.xpath("//input[@placeholder='First Name']")), s1.getValueFromPropertyFile("/Autotesting.properties", "FirstName"));
		s1.typeInput(driver.findElement(By.xpath("//input[@placeholder='Last Name']")), s1.getValueFromPropertyFile("/Autotesting.properties", "LastName"));
		s1.typeInput(driver.findElement(By.cssSelector("#basicBootstrapForm>div:nth-of-type(2)>div>textarea")), s1.getValueFromPropertyFile("/Autotesting.properties", "Address"));
		s1.typeInput(driver.findElement(By.cssSelector("#basicBootstrapForm>div:nth-of-type(3)>#eid>input")), s1.getValueFromPropertyFile("/Autotesting.properties", "Emailid"));
		s1.typeInput(driver.findElement(By.cssSelector("#basicBootstrapForm>div:nth-of-type(4)>div>input")), s1.getValueFromPropertyFile("/Autotesting.properties", "Phone"));
	}
}
