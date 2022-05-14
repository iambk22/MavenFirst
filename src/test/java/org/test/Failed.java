package org.test;// Automatically rerun--> when we know which testCase will get false
//Implement IRetryAnalyzer
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer  {
	int min =0,max=3; // Give value
	public boolean retry(ITestResult result) {
		//give condition for how many times the failed test cases should Rerun
		if (min<max) {
			min++;
			return true;
			
		}
		return false;
	}



}
