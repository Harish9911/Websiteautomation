package Newtestcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class Tabhandle {
	WebDriver driver;
@Test
	public void tab() throws InterruptedException {
		
System.setProperty("webdriver.opera.driver", "D:\\webdriverproject\\WebsiteAutomation\\Drivers\\operadriver.exe");
		
	driver = new OperaDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	
		driver.get("https://demoqa.com/browser-windows");
		System.out.println(driver.getTitle());		
		
		WebElement ele = driver.findElement(By.xpath("//button[@id='tabButton']"));
		
		ele.click();
//		 
//		 
//		 Iterator<String> iter =windowids.iterator();
//		
//		String mainwindow = iter.next();
//		String childwindow =iter.next();
//		driver.switchTo().window(childwindow);
		
		handles(2);
		
		System.out.println("Title of childwindow:"+driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
		handles(1);
//		driver.switchTo().window(mainwindow);
		System.out.println("Tile of mainwindow:"+driver.getTitle());
		Thread.sleep(3000);
		
		driver.close();
	}
public void handles(int index) {
	
	String windowid= null;
	Set<String> windowids = driver.getWindowHandles();
	 Iterator<String> iter =windowids.iterator();
	for(int i=1;i<=index;i++)
	{
		windowid=iter.next();
	}
	driver.switchTo().window(windowid);
}
		
}
