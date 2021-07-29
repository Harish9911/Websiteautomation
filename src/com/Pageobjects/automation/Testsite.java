package com.Pageobjects.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.ITestListener;
import org.testng.annotations.Test;

import com.Testcases.automation.website.Testcase1;

public class Testsite extends Testcase1 {

	
	@Test
	public void Test1() {
		
		getdDriver().get("https://testpages.herokuapp.com/styled/index.html");
		
		
		getdDriver().findElement(By.id("alerts")).click();
		getdDriver().findElement(By.id("alertexamples")).click();
		Alert al = getdDriver().switchTo().alert();
		al.accept();
		
		
	}

	

	
	
	
	
	
}
