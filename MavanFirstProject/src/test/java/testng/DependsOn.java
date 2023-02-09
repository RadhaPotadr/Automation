package testng;

import org.testng.annotations.Test;

public class DependsOn {
	@Test(enabled=true, priority=1)
	//@Test(enabled=true, priority=1,expectedExceptions=ArithmeticException.class)
	public void createPIM() {
		int i=10/0;
		System.out.println("PIM created successfully");
	}
	@Test(enabled=true, priority=2, dependsOnMethods="createPIM")
	public void modifyPIM() {
		System.out.println("PIM modified successfully");
	}
	@Test(enabled=true, priority=3, dependsOnMethods="createPIM")
	public void deletePIM() {
		System.out.println("PIM deleted successfully");
	}
	@Test(enabled=true, priority=4)
	public void logoutClose() {
		System.out.println("Logout from the application and close the browser");
	}
}
