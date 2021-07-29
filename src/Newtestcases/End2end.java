package Newtestcases;

    import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

import org.openqa.selenium.opera.OperaDriver;

	public class End2end {
	public static void main(String[] args) throws InterruptedException {

	
		System.setProperty("webdriver.opera.driver", "D:\\webdriverproject\\WebsiteAutomation\\Drivers\\operadriver.exe");

	WebDriver driver=new OperaDriver();

	//Is displayed is used when particular object is in code base but it is in visible mode or not
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.get("http://www.makemytrip.com/");

//	System.out.println(" Before clikcing on Multi city Radio button");

//	System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

	driver.findElement(By.xpath("//li[text()='Multi City']")).click();

	driver.findElement(By.xpath("//li[text()='Multi City']")).isEnabled();

	System.out.println(" After clikcing on Multi city Radio button");

	driver.findElement(By.xpath("//span[text()='Travellers & CLASS']")).click();
	driver.findElement(By.xpath("(//li[text()='5'])[1]")).click();
	
	driver.findElement(By.xpath("(//span[text()='From'])[1]")).click();
	driver.findElement(By.xpath("(//span[text()='From'])[1]")).isEnabled();
	//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[3]/a")).click();

//	int i=0;
//
//	while(i<5)
//
//	{
//
//	driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();
//
//	i++;
//
//	}
	for(int i=0;i<5;i++)
	{
		driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();

	}

	//System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

	//System.out.println(driver.findElement(By.xpath(".//*[@id='mui_city_button']/span")).isDisplayed());

	Thread.sleep(3000L);

	//System.out.println(driver.findElement(By.xpath(".//*[@id='responsive_bottom']/div[2]/div[1]/div/div/h3")).getText());

	//If you want to validate the object which is present in web page or code base

	int count=driver.findElements(By.xpath(".//*[@id='mui_city_button']/span")).size();

	if (count==0)

	{

	System.out.println("verified");

	}

	//

	}

	}
	
	
	
	

