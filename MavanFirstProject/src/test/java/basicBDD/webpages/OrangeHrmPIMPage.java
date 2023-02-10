package basicBDD.webpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class OrangeHrmPIMPage  extends SeleniumUtility{
	
	public OrangeHrmPIMPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()=' Add ']")
	public WebElement AddPIM;
	
	@FindBy(xpath="//div[@class='oxd-table-card']/div/div[2]")
	public List<WebElement> employees;
	

	@FindBy(xpath="//div[div[div[div[text()='54336']]]]/div//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	public WebElement checkbox;
	
	@FindBy(xpath="//div[div[div[div[text()='54336']]]]/div//i[@class='oxd-icon bi-pencil-fill']")
	public WebElement edit;
	
	@FindBy(xpath="//div[div[div[div[text()='54336']]]]/div//i[@class='oxd-icon bi-trash']")
	public WebElement delete;
	
	@FindBy(xpath="//button[text()=' Yes, Delete ']")
	public WebElement Confirmdelete; 
	
	public void checkboxClick() {
		performClick(checkbox);
	}
	public void editClick() {
		performClick(edit);
	}
	public void AddPIMclick() {
		performClick(AddPIM);
	}
	public List<String> empName = new ArrayList();

	public void getEmployee(List<WebElement> employees) {
		
		for(int i=0;i<employees.size();i++) {
			empName.add(employees.get(i).getText());
		}
	}
	
}
