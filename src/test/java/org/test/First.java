package org.test;// Automatically --> ReRun when Don't Know which TestCases will Get Fail
//We want to create two classes --> For rerun(RetryAnalyzer) and for Transform(AnnotationTransformer)
//Create Testng.xml for This class
import org.testng.Assert;
import org.testng.annotations.Test;

public class First {
	@Test
	private void tc1() {
		System.out.println("Tc1");

	}
	@Test
	private void tc2() {
		Assert.assertTrue(false);
	}
	@Test
	private void tc3() {
		Assert.assertTrue(false);

	}

}
