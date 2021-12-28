package com.crm.comcast.generalUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListnerImp implements ITestListener
{
	ExtentTest test;
	ExtentReports report;

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getMethod().getMethodName());	
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, result.getMethod().getMethodName()+" is passed");
	}

	public void onTestFailure(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		Object obj = result.getInstance();
		WebDriver driver=null;
	try {
		 driver = (WebDriver)result.getTestClass().getRealClass().getSuperclass().getDeclaredField("driver").get(obj);
	} catch (Throwable e) {
		
		e.printStackTrace();
	} 
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("./screenshot/"+methodName+".PNG");
	try {
		Files.copy(src, dst);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	test.log(Status.FAIL, result.getMethod().getMethodName()+" is failed");
	// to add the screenshot to the extent report
	test.addScreenCaptureFromPath(dst.getAbsolutePath());
	// to get the exceptions in extent report
	test.log(Status.FAIL, result.getThrowable());
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.SKIP, result.getMethod().getMethodName());
	}
	public void onStart(ITestContext context) {
		
		ExtentSparkReporter htmlReport=new ExtentSparkReporter("./ExtentReport.html");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setDocumentTitle("Comrow_5.0.8");
		htmlReport.config().setReportName("Automation Execution Report");
		 report=new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("os",System.getProperty("os.name"));
		PropertiesFileUtility plib=new PropertiesFileUtility();
		try {
			report.setSystemInfo("Testing_Url", plib.getPropertyKeyValue("url"));
			report.setSystemInfo("Browser", plib.getPropertyKeyValue("browser"));
			report.setSystemInfo("Reporter", "Naveen Patil");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		report.flush();
	}
	

}
