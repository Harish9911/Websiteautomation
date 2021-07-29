package Newtestcases;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class Opennewtabwindowhandle {
	WebDriver driver;
@Test
	public void windows() {
		
		System.setProperty("webdriver.opera.driver", "D:\\webdriverproject\\WebsiteAutomation\\Drivers\\operadriver.exe");
		
		driver = new OperaDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	
			
		
			
			 
			// Load app
			driver.get("http://www.naukri.com/");
			 
			// It will return the parent window name as a String
			String parent=driver.getWindowHandle();
			 
			// This will return the number of windows opened by Webdriver and will return Set of St//rings
			Set<String>s1=driver.getWindowHandles();
			 
			// Now we will iterate using Iterator
			Iterator<String> I1= s1.iterator();
			 
			while(I1.hasNext())
			{
			 
			   String child_window=I1.next();
			 
			// Here we will compare if parent window is not equal to child window then we            will close
			 
			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);
			 
			System.out.println(driver.switchTo().window(child_window).getTitle());
			 
			driver.close();
			}
			 
			}
			// once all pop up closed now switch to parent window
			driver.switchTo().window(parent);
			 
			}
			
}
//		WebElement ele = driver.findElement(By.name("q"));
//		ele.sendKeys("hariesh_looks");
//		ele.submit();
//		String str = Keys.chord(Keys.CONTROL,Keys.RETURN);
//		WebElement ele2 = driver.findElement(By.linkText("Images"));
//		ele2.sendKeys(str);
//		String str2 = driver.getWindowHandle();
//		Set<String> str3  = driver.getWindowHandles();
//		for(String obj:str3) {
//			if(!obj.equals(str2)) {
//				driver.switchTo().window(obj);
		   
	         
		
		
		
		


	

//	@AfterMethod
//	public void screenshot(ITestResult result) throws IOException
//	{
//		if(result.getStatus()==ITestResult.SUCCESS)
//		{
//			System.out.println("Test is success");
//			File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			File sc2 = new File("D:\\webdriverproject\\WebsiteAutomation\\screenshots"+result.getName()+".jpeg");
//			FileUtils.copyFile(sc, sc2);
//		}
//		else if(result.getStatus()==ITestResult.FAILURE)
//		{
//			System.out.println("test case is failed");
//			File sc3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			File sc4 = new File("D:\\webdriverproject\\WebsiteAutomation\\screenshots"+result.getName()+".jpeg");
//			FileUtils.copyFile(sc3, sc4);
//				
//		}
//			
//	}
	
	

