package com.testing;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * Unit test for simple App.
 */
public class YahooTest 
{
    
	@Test
	public void testYahoo()
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://yahoo.com");
		
		driver.quit();
		
	}
}
