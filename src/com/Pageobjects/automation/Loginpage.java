package com.Pageobjects.automation;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Loginpage {
	private  String tcName;
	private static WebDriver driver ;
	
	
	
	
	
	
	@BeforeSuite
	public void openbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\webdriverproject\\WebsiteAutomation\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
	}
	
	
	
	
	
	@Test
	public void loginpage() throws InterruptedException
	{
		 
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("hari1908@gmail.com");
		driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("hariesh");
		driver.findElement(By.id("customer_lastname")).sendKeys("kumar");
		
		driver.findElement(By.id("passwd")).sendKeys("Ha@52121");
		WebElement dd = driver.findElement(By.id("days"));
		Select sc = new Select(dd);
		
		sc.selectByValue("1");
		WebElement mo = driver.findElement(By.id("months"));
		Select sc2 = new Select(mo);
		sc2.selectByValue("7");
		
		WebElement yr = driver.findElement(By.id("years"));
		Select sc3 = new Select(yr);
		sc3.selectByValue("1993");
		
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		driver.findElement(By.id("firstname")).sendKeys("hariesh");
		driver.findElement(By.id("lastname")).sendKeys("kumar");
		driver.findElement(By.id("company")).sendKeys("Business Licence India");
		driver.findElement(By.id("address1")).sendKeys("h.no.355/356,near hanuman temple,subash nagar");
		driver.findElement(By.id("address2")).sendKeys("jeedimetla,hyderabad");
	    driver.findElement(By.id("city")).sendKeys("Hyderabad");
	    WebElement st = driver.findElement(By.id("id_state"));
	    Select sc4 = new Select(st);
	    sc4.selectByVisibleText("Indiana");
	    driver.findElement(By.id("postcode")).sendKeys("50005");
	    driver.findElement(By.id("other")).sendKeys("hello hariesh thanks for registering");
	    driver.findElement(By.id("phone_mobile")).sendKeys("8333956091");
	   WebElement al = driver.findElement(By.id("alias"));
	   al.clear();
	   al.sendKeys("INDIA");
	   driver.findElement(By.id("submitAccount")).click();
	  
	   
	 boolean el =  driver.findElement(By.linkText("Sign out")).isDisplayed();
	   
		
	   System.out.println("In user home page   "+el);
	   
	   }
	
	@BeforeMethod
	public void beforeTCexcecution(Method method) {
		tcName = method.getName();
		System.out.println("current TC executing name is:" +tcName);
		
	}
	@AfterMethod
	public void afterTCexecution(ITestResult result) throws IOException {
		if (result.getStatus()==ITestResult.SUCCESS)
		{
			System.out.println("test case is success:"+result.getName());
			
			File sec = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File Scshotname = new File(".\\screenshots"+result.getName()+".jpeg");
			FileUtils.copyFile(sec, Scshotname);
		}  
		
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			System.out.println("test case failed:"+result.getName());
			
			File sec = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File Scshotname = new File(".\\screenshots"+result.getName()+".jpeg");
			FileUtils.copyFile(sec, Scshotname);
			
			
//			TakesScreenshot screenshot = (TakesScreenshot) driver;
//			File file = screenshot.getScreenshotAs(OutputType.FILE);
//			
//			FileUtils.copyFile(file, new File("D:\\webdriverproject\\WebsiteAutomation\\screenshots"+result.getName()+".jpeg"));
//			//to print exception reason for failing test case
//
//			Throwable exception= result.getThrowable();
//			System.out.println(exception);
			
			
		}
		else if (result.getStatus()==ITestResult.SKIP)
		{
			System.out.println("test case has been skiped:"+result.getName());
			File sec = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File Scshotname = new File(".\\screenshots"+result.getName()+".jpeg");
			FileUtils.copyFile(sec, Scshotname);
			
//			TakesScreenshot screenshot = (TakesScreenshot) driver;
//			File file = screenshot.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(file, new File("D:\\webdriverproject\\WebsiteAutomation\\screenshots"+result.getName()+".jpeg"));
////			to print exception reason for failing test case
//			Throwable exception= result.getThrowable();
//			System.out.println(exception);
		}

		}
	
	@BeforeTest
	public void open() {
		System.out.println("Now browser is opening...");
	}
@AfterTest
	public void close()
	{
		System.out.println("Now browser is closed");
	}
	
	@AfterSuite
	public void closebrowser() throws InterruptedException
	{
		
		
		Thread.sleep(5000);
		
			driver.close();
		}
	    	
	
	
	public static WebDriver getDriver()
	{
		return driver;
		
	}
	public  String getTcName()
	{
		return tcName;
		
	}
	
	
}
