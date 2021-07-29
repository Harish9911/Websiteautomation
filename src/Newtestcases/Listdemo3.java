package Newtestcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Listdemo3 {
public static void main(String[] args) {
System.setProperty("webdriver.opera.driver", "D:\\webdriverproject\\WebsiteAutomation\\Drivers\\operadriver.exe");
	
	WebDriver driver = new OperaDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	System.out.println("*******Browser Open********");

	
	driver.navigate().to("http://automationpractice.com/index.php");
	
	//driver.findElement(By.partialLinkText("Mobiles")).click();
	
	
	List<WebElement> mob = driver.findElements(By.xpath("//div[@class='product-image-container']"));
	
	for(int i=0;i<mob.size();i++)
	{
		
	driver.findElements(By.xpath("(//a[@title=\"Blouse\"])[1]")).get(i).click();
	break;	
		
		
		}
	
	
	
}
	
}
