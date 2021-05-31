package com.cms.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.cms.qa.util.TestUtil;10




public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public Base() throws IOException{
		try {
			prop=new Properties();
			FileInputStream f=new FileInputStream("/home/indoa/Downloads/workspace/POM/src/main/java/com/cms/qa/config/congif.properties");
			prop.load(f);
		}
		catch(FileNotFoundException E) {
			E.printStackTrace();
		}
		catch(IOException E) {
			E.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/indoa/Downloads/chromedriver");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
