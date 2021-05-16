package com.cms.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleSelectDropDown {
	@Test
	public void screenshotpractice() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/indoa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/s?k=iphone11phone&crid=2S3VT89Z57YDB&sprefix=iphone11%2Caps%2C310&ref=nb_sb_ss_ts-doa-p_1_8");
		// Select fruits = new Select(driver.findElement(By.id("fruits")));
		// List<WebElement> list
		// =driver.findElements(By.xpath("//*[@id='fruits']/option"));
		// List<WebElement> list =fruits.getOptions();
		// System.out.println(list.size());

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'New-Apple-iPhone-11-64GB')]/span/span/span[2]")).click();

	}
}
