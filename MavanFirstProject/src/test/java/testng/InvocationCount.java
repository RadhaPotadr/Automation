package testng;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(enabled=true,invocationCount=5)
	public void openBrowserAndAppURL() {
		System.out.println("Open browser and enter app url");
	}
}
/**
* we can define multiple parameter in @Test by using comma separator
* test will run no of times mentioned in invocationCount
*/