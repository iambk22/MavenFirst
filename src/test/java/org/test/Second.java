package org.test;// Automatically --> ReRun when Don't Know which TestCases will Get Fail
// IRetryAnalyzer --> Interface
//This class to give condition for how many times the failed test cases should Rerun

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Second implements IRetryAnalyzer {
      int min=0,max=3;
	public boolean retry(ITestResult arg0) {
		if (min<max) {
			min++;
			return true;
			
		}
		return false;
	}

}
