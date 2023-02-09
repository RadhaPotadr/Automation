package actitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class Utilityactirime {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver	=s1.setUp("chrome", "https://demo.actitime.com/");
		WebDriverWait wait =new WebDriverWait(driver,20);
		s1.typeInput(driver.findElement(By.name("username")), "admin");
		s1.typeInput(driver.findElement(By.name("pwd")), "manager");
		s1.performClick(driver.findElement(By.id("loginButton")));
		s1.performClick(driver.findElement(By.id("container_tasks")));
		s1.performClick(driver.findElement(By.className("addNewButton")));
		s1.performClick(driver.findElement(By.className("createNewTasks")));
		s1.performClick(driver.findElement(By.cssSelector(".customerSelector>div")));
		List<WebElement>company=driver.findElements(By.cssSelector(".customerSelector>div>div:nth-of-type(2)>div>div>div>div"));
		for(int i=0;i<company.size();i++) {
			if(company.get(i).getText().trim().equals("Galaxy Corporation")) {
				company.get(i).click();
			}
		}
		s1.performClick(driver.findElement(By.cssSelector(".projectSelector>div")));
		List<WebElement>project=driver.findElements(By.cssSelector(".projectSelector>div>div:nth-of-type(2)>div>div>div>div"));
		for(int i=0;i<project.size();i++) {
			project=driver.findElements(By.cssSelector(".projectSelector>div>div:nth-of-type(2)>div>div>div>div"));
			if(project.get(i).getText().trim().equals("Android testing")) {
				project.get(i).click();
			}
		}
		s1.performClick(driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr>td>input")));
		s1.typeInput(driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr>td>input")), "API testing");
		s1.performClick(driver.findElement(By.cssSelector("#ext-comp-1061>tbody>tr>.x-btn-center>em")));
		s1.performClick(driver.findElement(By.cssSelector("#ext-gen110")));
	s1.performClick(driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-of-type(3)>td:nth-of-type(2)>a>em")));
	wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector(".taskTableContainer>table>tbody>tr:nth-of-type(1)>td:nth-of-type(5)>div:nth-of-type(2)"))));
	s1.performClick(driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr:nth-of-type(1)>td:nth-of-type(5)>div:nth-of-type(2)")));
	List<WebElement>work=driver.findElements(By.cssSelector(".taskTableContainer>table>tbody>tr:nth-of-type(1)>td:nth-of-type(5)>div>div>div>div:nth-of-type(1)>div>div"));
	for(int i=0;i<work.size();i++) {
		if(work.get(i).getText().equals("testing")) {
			work.get(i).click();
			break;
		}
	}
	s1.performClick(driver.findElement(By.cssSelector(".taskTableContainer>table>tbody>tr:nth-of-type(1)>td:nth-of-type(6)>label")));
	s1.performClick(driver.findElement(By.cssSelector("#createTasksPopup_content>div:nth-of-type(2)>div:nth-of-type(2)>div>div")));
	System.out.println("************");
	wait.until(ExpectedConditions.elementToBeClickable(By.id("container_tasks")));
	s1.performClick(driver.findElement(By.id("container_tasks")));
	s1.performClick(driver.findElement(By.xpath("//tr[td[div[div[div[div[text()='API testing']]]]]]/td/div")));
	//Thread.sleep(1000);
	s1.performClick(driver.findElement(By.xpath("//div[text()='Delete']")));
	s1.performClick(driver.findElement(By.xpath("//span[text()='Delete permanently']")));
	driver.close();
	}
}
