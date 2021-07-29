package Newtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\webdriverproject\\WebsiteAutomation\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(1000);
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		
WebElement  ele =	driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));

	js.executeScript("arguments[0].scrollIntoView(true);",ele);
	Thread.sleep(6000);
ele.click();



	System.out.println("element has been clicked"+ele.getTagName());
		
		
		
//		js.executeScript("window.scrollBy(0,1000)");
		
		
		
	
       
	Thread.sleep(7000);
		driver.close();
		
		
		
		
		
	}
	
		
	
}
