package com.cms.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchingBrowser {
	@Test

	public static void m1() throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "/home/indoa/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://cms.qa.vigocare.com/login?redirect=%2Fcases%2Findex%2Fcaseinfo%2F609e778ee7dc6f002b7d8846");
		System.out.println("*********************************");
		System.out.println(driver.getTitle());
		System.out.println("*********************************");
		Thread.sleep(6000);
		driver.quit();

	}

	@Test
	public static void m2() {

		//System.out.println(System.getProperty("user.dir") + "/src/test/java/chromedriver");
		System.out.println(" i am in m2 method");

	}
}
