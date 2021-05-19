package com.cms.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchingBrowser {
	@Test

	public static void m1() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/home/indoa/Downloads/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu");
		options.addArguments("--disable-dev-shm-usage");// applicable to windows os only
		options.addArguments("--no-sandbox"); // Bypass OS security model
		WebDriver driver = new ChromeDriver();
		driver.get("https://cms.qa.vigocare.com/login?redirect=%2Fcases%2Findex%2Fcaseinfo%2F609e778ee7dc6f002b7d8846");
		System.out.println("*********************************");
		System.out.println(driver.getTitle());
		System.out.println("*********************************");
		Thread.sleep(6000);
		driver.quit();

	}

	@Test
	public static void m2() {

		System.out.println(System.getProperty("user.dir") + "/src/test/java/chromedriver");
		System.out.println(" i am in m2 method");

	}
}
