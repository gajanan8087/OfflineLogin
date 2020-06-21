package com.jbk.qa.testpages;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.qa.base.Base;
import com.jbk.qa.extentreport.ExtentLogs;
import com.jbk.qa.util.ExtentScreenShot;

public class LoginPageTest extends Base {
	
	
	@Test
	public void TittleCheck() throws IOException {
		
		String actual = "JavaByKiran | Log in";
		String expect = "JavaByKiran | Log in";
		
		
		parenttest=extent.createTest("LoginPageTest");
		childtest=parenttest.createNode("TittleCheck");
		ExtentLogs.info(childtest,"Checking for actual and expected" );
		if(actual.equals(expect)) {
			
				soft.assertEquals(actual, expect);
				ExtentLogs.pass(childtest,"TittleCheck Test Passed" );
				ExtentLogs.info(childtest,"Actual and expected is matched" );
				ExtentLogs.info(childtest,"TittleCheck Test is completed" );
				
			
		}
		else if(actual.equals(expect)) {
			
				soft.assertEquals(actual, expect);
				ExtentLogs.fail(childtest,"TittleCheck Test failed","TittleCheck" );
				//ExtentLogs.info(childtest,"Actual and expected is not matched" );
				//ExtentLogs.info(childtest,"TittleCheck Test is completed" );
			
		}
		else {
			
				soft.assertEquals(actual, expect);
				ExtentLogs.skip(childtest, "TittleCheck Test get Skipped");
				//ExtentLogs.info(childtest,"Actual and expected is not found" );
				//ExtentLogs.info(childtest,"TittleCheck Test is completed" );
			
		}
		soft.assertAll();
	}
	
	@Test
	public void UserNameTest() throws IOException {
		
		String actual = "KIRAN";
		String expect = "kiran";
		
		childtest=parenttest.createNode("UserNameTest");
		//ExtentLogs.info(childtest,"Checking for actual and expected" );
		if(actual.equals(expect)) {
				soft.assertEquals(actual, expect);
				ExtentLogs.pass(childtest,"UserNameTest Test Passed" );
				//ExtentLogs.info(childtest,"Actual and expected is matched" );
				//ExtentLogs.info(childtest,"UserNameTest is completed" );
		}
		else if(!(actual.equals(expect))) {
				soft.assertEquals(actual, expect);
				ExtentLogs.fail(childtest,"UserNameTest Test failed","UserNameTest" );
				//ExtentLogs.info(childtest,"Actual and expected is not matched" );
				//ExtentLogs.info(childtest,"UserNameTest Test is completed" );
		}
		else {
				soft.assertEquals(actual, expect);
				ExtentLogs.skip(childtest, "UserNameTest Test get Skipped");
				//ExtentLogs.info(childtest,"Actual and expected is not found" );
				//ExtentLogs.info(childtest,"UserNameTest is completed" );
			
		}
		soft.assertAll();
	}
	
	
	
	

}
