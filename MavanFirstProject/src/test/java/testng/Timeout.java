package testng;

import org.testng.annotations.Test;

public class Timeout {
	@Test(enabled=true,timeOut=200)
	public void openBrowserAndAppURL() throws InterruptedException {
		//Thread.sleep(300);
		Thread.sleep(100);
		System.out.println("Open browser and enter app url");
	}
}
// it will run for 200ms, in case of 300 tc fails and for 100 tc passed