 package Newtestcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alerts {
	
	@Test
	public void run() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriverproject\\WebsiteAutomation\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	

	driver.get("https://testpages.herokuapp.com/styled/index.html");
	driver.findElement(By.id("alerts")).click();
	
	driver.findElement(By.id("alertexamples")).click();
	Alert al = driver.switchTo().alert();
	al.accept();
	
	driver.findElement(By.id("confirmexample")).click();
	Alert al2 = driver.switchTo().alert();
	System.out.println(al2.getText());
	al2.accept();
	
	driver.findElement(By.id("promptexample")).click();
	Alert al3 = driver.switchTo().alert();
	System.out.println(al3.getText());
	al3.sendKeys("hello hariesh");
al3.accept();	

driver.navigate().back();
driver.findElement(By.id("basicajax")).click();


Select se = new Select(driver.findElement(By.xpath("//*[@id='combo1']")));

se.selectByVisibleText("Desktop");

WebDriverWait wait = new WebDriverWait(driver, 10);

 wait.until(ExpectedConditions.elementToBeClickable(By.name("submitbutton"))).click();
 
 
driver.navigate().back();
driver.navigate().back();

//driver.findElement(By.id("fileupload")).click();
//Thread.sleep(2000);
//
//driver.findElement(By.id("fileinput")).sendKeys("C:\\Users\\Lenovo\\Downloads\swamy.jpg");
//Thread.sleep(2000);
//
//driver.findElement(By.id("itsanimage")).click();
//Thread.sleep(1000);
//
//driver.findElement(By.name("upload")).click();
//Thread.sleep(3000);
//driver.close();

driver.findElement(By.id("html5form")).click();




//WebElement dateWidget = driver.findElement(By.id(""));

//
//for (WebElement cell: columns){
//   //Select 13th Date 
//   if (cell.getText().equals("13")){
//      cell.findElement(By.linkText("13")).click();
//      break;
// }
// 



	
	
	}
}
