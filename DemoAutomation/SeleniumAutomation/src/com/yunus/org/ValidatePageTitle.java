package com.yunus.org;

import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

public class ValidatePageTitle {

	public static void main(String[] args) throws InterruptedException 
	{
		//Set the System property
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");		
		//Object Creation
		ChromeDriver driver = new ChromeDriver();
		//Set the URL 
		String baseUrl = "https://www.google.com/";
		String expectedTitle="Google";
		String actualTitle="";
		//Launch the browser with url
		driver.get(baseUrl);
		//Get the Browser title
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		actualTitle = driver.getTitle();
		//Print
		/*if(actualTitle.contentEquals(expectedTitle))
			System.out.println("Test Passed");
		else
		{
			System.out.println("Test Failed");			
		}*/
		try 
		{
			Assert.assertEquals(expectedTitle, actualTitle);
			System.out.println("Test Passed");

		}
		catch (Exception e) {
			System.out.println("Test Failed");			
		}
		driver.quit();

	}

}
