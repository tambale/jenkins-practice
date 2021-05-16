package com.cms.qa.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/indoa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 30);
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("laptop");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println("Testing");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']/li[20]")));
	
		
		driver.findElement(By.xpath("//ul[@role='listbox']/li[3]")).click();
		
		/*
		 * String str = "laptop table olx"; for (int i = 0; i < list.size(); i++) {
		 * String s = list.get(i).getText(); if (s.equalsIgnoreCase(str)) {
		 * 
		 * w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//ul[@role='listbox']/li[3]")));
		 * 
		 * list.get(i).click(); break; }
		 * 
		 * }
		 */

	}
}
