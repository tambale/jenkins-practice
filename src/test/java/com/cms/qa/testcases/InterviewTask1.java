package com.cms.qa.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//integer
public class InterviewTask1 {
	public static WebDriver driver;

	@Test(priority=0)
	public static void m1() {

		System.setProperty("webdriver.chrome.driver", "/home/indoa/Downloads/chromedriver");
	}

	@Test(priority = 1)
	public void showDiv() {
		m1();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://7eb1f3fcd646.ngrok.io/");
		driver.findElement(By.xpath("//*[text()='Show Div']")).click();
		String s = driver.findElement(By.xpath("//*[text()='Show Div']/parent::div/div")).getText();
		System.out.println(s);
	}

	@Test(priority = 2)
	public void delayedDiv() {
		m1();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://7eb1f3fcd646.ngrok.io/");
		driver.findElement(By.xpath("//*[@id='delayedDivButton']")).click();
		String s2 = driver.findElement(By.xpath("//*[text()='Delayed div here']")).getText();
		System.out.println(s2);

	}

	@Test(priority = 3)
	public void modal() {
		m1();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://7eb1f3fcd646.ngrok.io/");
		driver.findElement(By.xpath("//*[@id='modalDivButton']")).click();
		String s = driver.findElement(By.xpath("//p")).getText();
		System.out.println(s);
	}

}
