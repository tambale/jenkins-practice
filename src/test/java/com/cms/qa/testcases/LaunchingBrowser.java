package com.cms.qa.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LaunchingBrowser {

	static ExtentTest test;
	static ExtentReports report;
	
	static final Logger  log = Logger.getLogger(LaunchingBrowser.class);

	@Test

	public void m1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/java/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://cms.qa.vigocare.com/login?redirect=%2Fcases%2Findex%2Fcaseinfo%2F609e778ee7dc6f002b7d8846");
		report = new ExtentReports(System.getProperty("user.dir") + "/ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
		System.out.println("*********************************");
		
		
		PropertyConfigurator.configure("/home/indoa/Downloads/workspace/testingteamselenium/log4j.properties");
		
		log.info("this is lod debugger message");
		
		System.out.println(driver.getTitle());
		System.out.println("*********************************");
		
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		driver.quit();

		report.endTest(test);
		report.flush();

	}

	@Test
	public void m2() {

		System.out.println(System.getProperty("user.dir") + "/src/test/java/chromedriver");
		System.out.println(" i am in m2 method");
		test = report.startTest("ExtentDemo2");
		test.log(LogStatus.PASS, "Test Passed");
		report.endTest(test);
		report.flush();

	}
}
