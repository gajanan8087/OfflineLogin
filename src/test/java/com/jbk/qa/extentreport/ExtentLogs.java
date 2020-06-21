package com.jbk.qa.extentreport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.jbk.qa.base.Base;
import com.jbk.qa.util.ExtentScreenShot;

public class ExtentLogs extends Base {
	
	public static void info(ExtentTest test, String message) {
		//test.log(Status.INFO, message);
		test.info(message);
	}
	public static void pass(ExtentTest test, String message) {
		test.log(Status.PASS, message);
	}
	public static void fail(ExtentTest test, String message,String ScreenshotName) throws IOException {
		test.log(Status.FAIL, message);
		String screenshotPath= ExtentScreenShot.getScreenshot(driver,ScreenshotName );
		MediaEntityModelProvider mediaModel =MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build();
	}
	public static void skip(ExtentTest test, String message) {
		test.log(Status.SKIP, message);
	}
	

}
