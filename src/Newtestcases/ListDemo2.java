package Newtestcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class ListDemo2 {

	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.opera.driver", "D:\\webdriverproject\\WebsiteAutomation\\Drivers\\operadriver.exe");
		
	WebDriver driver = new OperaDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	System.out.println("*******Browser Open********");
	driver.get("http://www.google.com");
WebElement	lk  =driver.findElement(By.name("q"));
lk.sendKeys("Harish looks");
lk.submit();

Thread.sleep(2000);
List<WebElement> links = driver.findElements(By.xpath("//div[@class='yuRUbf']"));


for(int i=0;i<links.size();i++)
{
	String name = links.get(i).getText();
	if(name.contains("Harish Looks (harishlooks) – Profile | Pinterest"))
	{
		
		driver.findElements(By.xpath("//h3[text()='Harish Looks (harishlooks) – Profile | Pinterest']")).get(i).getText();
		break;
	}
	
}

	
	
	
	
	
}
}