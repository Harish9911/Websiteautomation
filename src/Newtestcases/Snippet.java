package Newtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snippet {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\webdriverproject\\WebsiteAutomation\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
		WebElement from = driver.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement to = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(from, to).build().perform();
			
		act.contextClick().build().perform();
	}
	
	
	
	
	
}

