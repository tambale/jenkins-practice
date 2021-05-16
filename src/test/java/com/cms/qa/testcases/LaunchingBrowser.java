package com.cms.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchingBrowser {
	@BeforeMethod

	public static void m1() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/chromedriver");
//		System.setProperty("webdriver.chrome.driver", "/home/indoa/Downloads/workspace/testingteamselenium/src/test/java/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://cms.qa.vigocare.com/login?redirect=%2Fcases%2Findex%2Fcaseinfo%2F609e778ee7dc6f002b7d8846");
		driver.quit();

	}

	@Test
	public static void m2() {
		System.out.println(" i am in m2 method");
	}
}
