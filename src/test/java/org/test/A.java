package org.test; // ReRun---> Manual
// Right Click Project-->Refresh--->Test Output-->suite-->Testng.Failed.xml
//Testng.Failed.xml--> It contains failed tests--> it run only failed tests
// In Test Output -->emailable.report.html---> Its test Report
import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
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
		System.out.println("Tc3");

	}

}
