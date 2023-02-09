package testng;

import org.testng.annotations.Test;

public class Example2 {
	int age=25;
	  @Test
	  public void signUp() {
		  System.out.println("i am signup...");
	  }
	  @Test
	  public void login() {
		  System.out.println("I am login....");

	  }
	  @Test
	  public void compose() {
		  System.out.println("I am compose...");
	  }
}
