package extendreports;

import org.jsoup.safety.Cleaner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtility;

public class ExtendReports extends SeleniumUtility{
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest() {
		String filePath=System.getProperty("user.dir") + "\\extentreports\\ExtentReportResults.html";
		report = new ExtentReports(filePath);
		test = report.startTest("GoogleSearchReport");
	}

	@Test
	public void extentReportsDemo() {
	
		setUp("chrome", "https://www.google.co.in");
		if (getPageTitle().equals("Google")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(getPageTitle(), "Google");
		cleanUp();
	}
	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}
}
