package basicBDD.webpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ActitimrTaskPage extends SeleniumUtility {

	public ActitimrTaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "addNewButton")
	private WebElement AddTask;
	@FindBy(className = "createNewTasks")
	private WebElement CreateTask;
	@FindBy(css = ".customerSelector>div")
	private WebElement customer;

	public void addTaskClick() {
		performClick(AddTask);
		performClick(CreateTask);
		performClick(customer);
	}

	@FindBy(css = ".customerSelector>div>div:nth-of-type(2)>div>div>div>div")
	private List<WebElement> company;

	public void selectCompany(String input) {
		for (int i = 0; i < company.size(); i++) {
			if (company.get(i).getText().trim().equals(input)) {
				company.get(i).click();
			}
		}
	}

	@FindBy(css = ".projectSelector>div")
	private WebElement project;

	public void projectClick() {
		performClick(project);
	}

	@FindBy(css = ".projectSelector>div>div:nth-of-type(2)>div>div>div>div")
	private List<WebElement> projectlist;

	public void selectproject(String input) {
		for (int i = 0; i < projectlist.size(); i++) {
			if (projectlist.get(i).getText().trim().equals(input)) {
				projectlist.get(i).click();
			}
		}
	}

	@FindBy(css = ".taskTableContainer>table>tbody>tr>td>input")
	private WebElement TaskName;

	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement createTask;

	@FindBy(xpath = "//div[text()='API testing']")
	public WebElement createdTask;

	@FindBy(css = ".tasksTableVerticalScrollContainer .title")
	private List<WebElement> TaskList;
	
	public List<String> actualTaskName = new ArrayList();

	public List<WebElement> TaskValidation(List<String> actualTaskName) {
		for (int i = 0; i < TaskList.size(); i++) {
			actualTaskName.add(TaskList.get(i).getText());
		}
		return TaskList;
	}

	public void createTask(String input) {
		performClick(TaskName);
		typeInput(TaskName, input);
		performClick(createTask);
	}

}
