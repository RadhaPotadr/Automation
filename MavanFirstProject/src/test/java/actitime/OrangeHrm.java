package actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import basicBDD.webpages.GoogleSearchPage;
import basicBDD.webpages.GoogleSearchResultPage;
import basicBDD.webpages.OrangeHrmAddNewPIMPage;
import basicBDD.webpages.OrangeHrmHomePage;
import basicBDD.webpages.OrangeHrmLoginPage;
import basicBDD.webpages.OrangeHrmPIMPage;
import basicBDD.webpages.OrangeHrmPIMUpdatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
public class OrangeHrm extends SeleniumUtility {
	OrangeHrmLoginPage getOrangeHrmLoginPage;
	OrangeHrmHomePage getOrangeHrmHomePage;
	OrangeHrmPIMPage getOrangeHrmPIMPage;
	OrangeHrmAddNewPIMPage getOrangeHrmAddNewPIMPage;
	OrangeHrmPIMUpdatePage getOrangeHrmPIMUpdatePage;

    @Given("^user already in OrangeHRM login page$")
    public void user_already_in_orangehrm_login_page()  {
    	WebDriver driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getOrangeHrmLoginPage = new OrangeHrmLoginPage(driver);
		getOrangeHrmHomePage = new OrangeHrmHomePage(driver);
		getOrangeHrmPIMPage = new OrangeHrmPIMPage(driver);
		getOrangeHrmAddNewPIMPage = new OrangeHrmAddNewPIMPage(driver);
		getOrangeHrmPIMUpdatePage = new OrangeHrmPIMUpdatePage(driver); 
    }

    @When("^clicks on Add button$")
    public void clicks_on_add()  {
    	getOrangeHrmPIMPage.AddPIMclick();
    }

    @When("^user enters  Employeeid as (.+) in Employee id filed$")
    public void user_enters_employeeid_as_in_employee_id_filed(String empid)  {
    	getOrangeHrmAddNewPIMPage.EmpIdInput(empid);  
    }

    @Then("^user should verify PIM is created with Employeeid as (.+)$")
    public void user_should_verify_pim_is_created_with_employeeid_as(String empid)  {
    	wait.until(ExpectedConditions.elementToBeClickable(getOrangeHrmAddNewPIMPage.FirstName));
		getOrangeHrmHomePage.PIMclick();
		getOrangeHrmPIMPage.getEmployee(getOrangeHrmPIMPage.employees);
		Assert.assertTrue(getOrangeHrmPIMPage.empName.contains(empid), "PIM is created sucessfully");  
    }

    @Then("^user should verify PIM is modified with Job Title as (.+)$")
    public void user_should_verify_pim_is_modified_with_job_title_as_of_employeeid_as(String jobtitle)  {
    	getOrangeHrmHomePage.PIMclick();
		Assert.assertEquals(getOrangeHrmHomePage.PIMupdate.getText(), jobtitle, "PIM is updated sucessfully");    
    }

    @Then("^user should verify PIM is deleted with Employeeid as (.+)$")
    public void user_should_verify_pim_is_deleted_with_employeeid_as(String empid)  {
    	getOrangeHrmHomePage.PIMclick();
		getOrangeHrmHomePage.PIMsearch(empid);
		getOrangeHrmHomePage.searchbutton.click();
		Assert.assertEquals(getOrangeHrmHomePage.PIMDeletion.getText(), "No Records Found", "PIM deletion validation");		
	}

    @And("^user login successfully with valid data$")
    public void user_login_successfully_with_valid_data()  {
    	getOrangeHrmLoginPage.UserNameInput("Admin");
		getOrangeHrmLoginPage.passwordInput("admin123");
		getOrangeHrmLoginPage.Loginclick();  
    }

    @And("^click PIM$")
    public void click_pim()  {
    	getOrangeHrmHomePage.PIMclick(); 
    }

    @And("^user enters FirstName as (.+) in FirstName filed$")
    public void user_enters_firstname_as_in_firstname_filed(String firstname)  {
    	getOrangeHrmAddNewPIMPage.FirstNameInput(firstname);  
    }

    @And("^user enters LastName as (.+) in LastName filed$")
    public void user_enters_lastname_as_in_lastname_filed(String lastname)  {
    	getOrangeHrmAddNewPIMPage.LastNameInput(lastname);
    }

    @And("^clears Employee id filed and enters Employeeid as (.+) in Employee id filed$")
    public void clears_employee_id_filed_and_enters_employeeid_as_in_employee_id_filed(String empid)  {
    	getOrangeHrmAddNewPIMPage.EmpIdInput(empid);
    }

    @And("^clicks on Save button$")
    public void clicks_on_save_button()  {
    	getOrangeHrmAddNewPIMPage.SavePIMClick();
    }

    @And("^close the browser$")
    public void close_the_browser()  {
    	cleanUp();
    }

    @And("^clicks on Search button$")
    public void clicks_on_search_button()  {
    	getOrangeHrmHomePage.searchbutton.click();
    }

    @And("^user selectes checkbox of PIM$")
    public void user_selectes_checkbox_of_pim()  {
    	getOrangeHrmPIMPage.checkboxClick();
    }

    @And("^clicks on edit logo$")
    public void clicks_on_edit_logo()  {
    	getOrangeHrmPIMPage.editClick();
    }

    @And("^clicks on Job$")
    public void clicks_on_job()  {
    	getOrangeHrmPIMUpdatePage.job.click();
    }

    @And("^selects Job Title as (.+) from list$")
    public void selects_job_title_as_from_list(String jobtitle)  {
    	wait.until(ExpectedConditions.elementToBeClickable(getOrangeHrmPIMUpdatePage.jobselecter));
		getOrangeHrmPIMUpdatePage.jobselecter.click();
		getOrangeHrmPIMUpdatePage.JobTitleUpdate(getOrangeHrmPIMUpdatePage.jobselecter, jobtitle);
		getOrangeHrmAddNewPIMPage.SavePIMClick();
    }

    @And("^clicks on delete logo$")
    public void clicks_on_delete_logo()  {
    	getOrangeHrmPIMPage.delete.click() ;  
    }

    @And("^user will get a popup to comfirm deletion, select Yes,Delete$")
    public void user_will_get_a_popup_to_comfirm_deletion_select_yesdelete()  {
    	getOrangeHrmPIMPage.Confirmdelete.click();  
    }

}
