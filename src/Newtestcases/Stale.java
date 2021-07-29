package Newtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stale {
	public static WebDriver  driver;
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\webdriverproject\\WebsiteAutomation\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);


driver.get("http://www.google.com");


WebElement el = driver.findElement(By.name("q"));
el.sendKeys("hello super");
driver.navigate().refresh();
try {
	el.sendKeys("hello super");
}catch(StaleElementReferenceException e)
{
	el = driver.findElement(By.name("q"));
	el.sendKeys("hello super");
	//webdriver wait has been used to wait for time until element clicked;// 
//	WebDriverWait wait = new WebDriverWait(driver, 30);
//	WebElement dc = 
	driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
//	wait.until(ExpectedConditions.elementToBeClickable(dc));
//	dc.click();
	
	
}
driver.close();
}
		
}
	


