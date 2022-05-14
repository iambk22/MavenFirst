package org.test;// Automatically -->Rerun when we know which Test cases will get Fail
// Create another class,implement Interface
import org.testng.Assert;
import org.testng.annotations.Test;

public class B {
	@Test
	private void test1() {
		System.out.println("Test1");

	}
	@Test(retryAnalyzer=Failed.class)// declare retryAnalyzer, Failed--> Class
	private void test2() {
		Assert.assertTrue(false);

	}
	@Test
	private void test3() {
		System.out.println("Test3");

	}
	

}
