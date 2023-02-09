package annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Absuite {
  @BeforeSuite
  public void BeforeSuite() {
	  System.out.println("*******************before********************");
  }
  @AfterSuite
  public void AfterSuite() {
	  System.out.println("*******************after********************");
  }
}
