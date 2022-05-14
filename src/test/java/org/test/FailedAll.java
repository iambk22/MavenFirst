package org.test;// Automatically --> ReRun when Don't Know which TestCases will Get Fail
// To Transformer--> To get and set RetryAnalyzer
// Give This class name within the Listeners tag in Testng.Xml
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer {
    // We don't need class, constructor,method in Arguments
	//Need ITestAnnotation for Set and Get RetryAnalyzer
	public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2, Method arg3) {
		
		IRetryAnalyzer retry = annotation.getRetryAnalyzer();
		if (retry==null) {
			annotation.setRetryAnalyzer(Second.class);
		}
	}

}
