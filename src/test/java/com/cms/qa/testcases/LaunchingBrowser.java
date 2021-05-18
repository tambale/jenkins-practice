package com.cms.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchingBrowser {
	@Test

	public static void m1() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/chromedriver");
//		System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver");
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("start-maximized"); // open Browser in maximized mode
		 * options.addArguments("disable-infobars"); // disabling infobars
		 * options.addArguments("--disable-extensions"); // disabling extensions
		 * options.addArguments("--disable-gpu"); // applicable to windows os only
		 * options.addArguments("--disable-dev-shm-usage"); // overcome limited resource
		 * problems options.addArguments("--no-sandbox"); // Bypass OS security model
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://cms.qa.vigocare.com/login?redirect=%2Fcases%2Findex%2Fcaseinfo%2F609e778ee7dc6f002b7d8846");
		driver.quit();

	}

	@Test
	public static void m2() {

		System.out.println(System.getProperty("user.dir") + "/src/test/java/chromedriver");
		System.out.println(" i am in m2 method");

	}
}
