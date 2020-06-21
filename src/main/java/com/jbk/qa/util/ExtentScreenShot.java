package com.jbk.qa.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.jbk.qa.base.Base;



public class ExtentScreenShot extends Base {
	public static String getScreenshot(WebDriver driver,String screenShotName) {
		String dateName= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destination=System.getProperty("user.dir")+"/TestsScreenshots/"+ screenShotName+dateName+".png";
		File finalDestination= new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return destination;
		
	}

}
