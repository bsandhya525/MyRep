package com.testing;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




/**
 * Unit test for simple App.
 */
public class GoogleTest 
{
    
	@Test
	public void testGoogle()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		driver.quit();
		
	}
}
