package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import day5.setup.*;
public class Three {

	public static void main(String[] args) throws IOException {
		WebDriver driver=Browser.setUp("chrome","https://demo.actitime.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		String location=".\\snapshot\\actitime_"+System.currentTimeMillis()+".jpg";
	//	FileHandler.copy(file, new File(location));	
		FileUtils.copyFile(file,new File(location));
	}

}
