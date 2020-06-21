package com.jbk.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base {
	public static WebDriver driver;
	public static Properties ptr;
	public static ExtentReports extent;
	public static ExtentTest test1;
	public static ExtentTest parenttest;
	public static ExtentTest childtest;
	public static ExtentHtmlReporter htmlreporter;
	public static SoftAssert soft;
	
	public  Base() {
		soft= new SoftAssert();
		ptr=new Properties();
		htmlreporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/report/OfflineJbkReport2.html");
		extent=new ExtentReports(); 
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("HostName", "HP");
		extent.setSystemInfo("Enviroment", "QA");
		extent.setSystemInfo("UserName", "Gajanan Pawar");
		
		try {
			FileInputStream fis =new FileInputStream("E:\\Projects\\OfflineJBK\\src\\main\\resources\\config.properties");
			try {
				ptr.load(fis);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	/*public static void initilaziton() {
		String browsername=ptr.getProperty("browser");
		  
		  if(browsername.equals("chrome")) {
			  //ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");

			  System.setProperty("webdriver.chrome.driver", "E:\\Projects\\OfflineJBK\\src\\test\\java\\driver\\chromedriver78.exe");
			  
		  }
		  else if(browsername.equals("FireFox")) {
				System.setProperty("webdriver.gecko.driver", "driver/geckodriver64bit.exe");
				
	       }
		  
		    driver.get(ptr.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
	}*/
	@AfterSuite
	public void endReport()
	{
		extent.flush();
		System.out.println("Flushed");
	}

}
