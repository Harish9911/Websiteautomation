package com.Testcases.automation.website;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Testcase1 {
	private static WebDriver driver;
@BeforeTest
public void run() {
	System.setProperty("webdriver.chrome.driver", "D:\\webdriverproject\\WebsiteAutomation\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

}	
@AfterTest
public void teardown() {
	
	driver.close();
	
}

public static  WebDriver getdDriver() {
	return driver;
} 
}
