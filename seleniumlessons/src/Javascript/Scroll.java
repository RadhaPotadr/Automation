package Javascript;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import day5.setup.*;
public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.setUp("chrome", "https://www.amazon.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//vertical scrolling
				js.executeScript("window.scrollBy(0,9500)");
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,-9500)");
				
				//Horizontal scrolling
				//js.executeScript("window.scrollBy(500,0)");
	}

}
