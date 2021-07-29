package Newtestcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;

public class ListDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.opera.driver", "D:\\webdriverproject\\WebsiteAutomation\\Drivers\\operadriver.exe");
		
	WebDriver driver = new OperaDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	System.out.println("*******Browser Open********");

	driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
	


for(int j=0;j<4;j++) {
	driver.findElement(By.xpath("(//a[@class=\"increment\"])[3]")).click();
}
Thread.sleep(1000);
List<WebElement> products =	driver.findElements(By.cssSelector("h4.product-name"));
for(int i=0;i<products.size();i++)
{
	String name = products.get(i).getText();
	if(name.contains("Cucumber"))
	{
		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		
		break;
		
	}
	
}

Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		
		Thread.sleep(1000);
		
WebElement hs =	driver.findElement(By.xpath("(//p[text()='Cucumber - 1 Kg'])[1]"));	
		
		
		
	System.out.println(hs.getText());	
WebElement hg =	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
hg.click();

	System.out.println("sucessfully added product to the cart  -->  " + hg.getText());
	
WebElement j =	driver.findElement(By.xpath("//button[text()='Place Order']"));
System.out.println(j.getText());

	j.click();
	
	
	
	Thread.sleep(2000);
	System.out.println("**********Browser Closed**********");
	driver.close();
		
		
		
	}
	
	
	
}
