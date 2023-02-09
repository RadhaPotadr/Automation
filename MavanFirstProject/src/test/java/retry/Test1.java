package retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	static int num=5;
		@Test(retryAnalyzer = retry.RetryAnalyzer.class)
		public void Test()
		{
			Assert.assertEquals(false, true);
		}
		@Test(retryAnalyzer = retry.RetryAnalyzer.class)
		public void Test2()
		{
			Assert.assertEquals(false, true);
		}	
		@Test(retryAnalyzer = retry.RetryAnalyzer.class)
		public void Test3()
		{
			num--;
			Assert.assertTrue(num<4);
		}
}
