package extendreports;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import utilities.SeleniumUtility;
public class GoogleSearch extends SeleniumUtility{
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest() {
		String filePath=System.getProperty("user.dir") + "\\extentreports\\GoogleSearchExtentReportResults.html";
		report = new ExtentReports(filePath);
		test = report.startTest("GoogleSearchReport");
	}
	@Test
	public void extentReportsDemo() throws IOException {
		setUp("chrome", "https://www.google.co.in");
		performClick(driver.findElement(By.id("L2AGLb")));
		performClick(driver.findElement(By.name("q")));
		typeInput(driver.findElement(By.name("q")), "manager");
		List<WebElement>sugg=driver.findElements(By.cssSelector("#Alh6id ul>li"));
		System.out.println(sugg.size());
		if (sugg.size()==10) {
			test.log(LogStatus.PASS, test.addScreenCapture(screenShot(driver)), "Number of Search is correct");
		} else {
			test.log(LogStatus.FAIL,test.addScreenCapture(screenShot(driver)), "Test Failed");
		}
		Assert.assertEquals(sugg.size(), 10);
		cleanUp();
	}
	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}
	public static String screenShot(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../extentreports/BStackImages/GoogleSearchPage_" + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}
}
