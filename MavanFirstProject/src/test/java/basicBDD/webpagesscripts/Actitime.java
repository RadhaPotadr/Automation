package basicBDD.webpagesscripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import basicBDD.webpages.ActitimeDeleteTaskPage;
import basicBDD.webpages.ActitimeHomePage;
import basicBDD.webpages.ActitimeLoginPage;
import basicBDD.webpages.ActitimeTaskUpdatePage;
import basicBDD.webpages.ActitimrTaskPage;

import utilities.SeleniumUtility;

public class Actitime extends SeleniumUtility {
	ActitimeLoginPage getActitimeLoginPage;
	ActitimeHomePage getActitimeHomePage;
	ActitimrTaskPage getActitimrTaskPage;
	ActitimeTaskUpdatePage getActitimeTaskUpdatePage;
	ActitimeDeleteTaskPage getActitimeDeleteTaskPage;

	@BeforeMethod
	public void prerequisite() {
		WebDriver driver = setUp("chrome", "https://demo.actitime.com/");
		getActitimeLoginPage = new ActitimeLoginPage(driver);
		getActitimeHomePage = new ActitimeHomePage(driver);
		getActitimrTaskPage = new ActitimrTaskPage(driver);
		getActitimeDeleteTaskPage = new ActitimeDeleteTaskPage(driver);
		getActitimeTaskUpdatePage = new ActitimeTaskUpdatePage(driver);
		getActitimeLoginPage.loginInput("admin", "manager");
		getActitimeHomePage.taskClick();
	}

	@Test(priority = 1)
	public void taskCreation() {
		getActitimrTaskPage.addTaskClick();
		getActitimrTaskPage.selectCompany("Galaxy Corporation");
		getActitimrTaskPage.projectClick();
		getActitimrTaskPage.selectproject("Android testing");
		getActitimrTaskPage.createTask("API testing");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.textToBePresentInElement(getActitimrTaskPage.createdTask, "API testing"));
		getActitimrTaskPage.TaskValidation(getActitimrTaskPage.actualTaskName);
		Assert.assertTrue(getActitimrTaskPage.actualTaskName.contains("API testing"),
				"API testing-Task is not created");
	}

	@Test(priority = 2, dependsOnMethods = "taskCreation")
	public void taskModification() {
		//getActitimeTaskUpdatePage.Galaxy.click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		getActitimeTaskUpdatePage.project.click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(getActitimeTaskUpdatePage.calander));
		getActitimeTaskUpdatePage.calanderclick();
		wait.until(ExpectedConditions.elementToBeClickable(getActitimeTaskUpdatePage.month));
		getActitimeTaskUpdatePage.monthclick();
		wait.until(ExpectedConditions.elementToBeClickable(getActitimeTaskUpdatePage.date));
		getActitimeTaskUpdatePage.dateclick();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Assert.assertTrue(getActitimeTaskUpdatePage.calandercheck.getText().equals("Mar 15, 2023"),
				"API testing-Task is not created");
	}

	@Test(priority = 3, dependsOnMethods = "taskCreation")
	public void taskDeletion()  {
		//getActitimeTaskUpdatePage.Galaxy.click();
		getActitimeTaskUpdatePage.project.click();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(getActitimeDeleteTaskPage.checkbox));
		getActitimeDeleteTaskPage.checkbox.click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(getActitimeDeleteTaskPage.delete));
		getActitimeDeleteTaskPage.delete.click();
		getActitimeDeleteTaskPage.confirmdelete.click();
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		getActitimrTaskPage.TaskValidation(getActitimrTaskPage.actualTaskName);
		Assert.assertFalse(getActitimrTaskPage.actualTaskName.contains("API testing"),
				"API testing-Task is not created");
	}

	@AfterMethod
	public void postrequisite() {
		driver.close();
	}
}
