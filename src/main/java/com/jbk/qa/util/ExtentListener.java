package com.jbk.qa.util;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ExtentListener {
	/*@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.SUCCESS ) {
			if(ptr.getProperty("printLogPass").equals("Y")) {
				childtest.log(Status.PASS,"Test Case Passed is "+result.getName() );
			
			String screenshotPath= ScreenShot.getScreenshot(driver, result.getName());
			MediaEntityModelProvider mediaModel =MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build();
			childtest.log(Status.PASS,"Screenshot For TestCase "+result.getName(), mediaModel);
			
			}
			
		}
		if(result.getStatus()==ITestResult.FAILURE ){
			if(ptr.getProperty("printLogFail").equals("Y")) {
				childtest.log(Status.FAIL,"Test Case Failed  is "+result.getName() );
				childtest.log(Status.FAIL, MarkupHelper.createLabel("Reason of test Case Fail ", ExtentColor.RED));
				childtest.log(Status.FAIL,result.getThrowable());
			}
		}
		if(result.getStatus()==ITestResult.SKIP) {
			if(ptr.getProperty("printLogSkip").equals("Y")) {
				childtest.log(Status.PASS,"Test Case Skiped is "+result.getName() );
			}
		}
		
		
	}
	
	@AfterSuite
	public void endReport() {
		extent.flush();
	}*/	

}
