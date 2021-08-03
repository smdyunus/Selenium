package com.yunus.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");		
		ChromeDriver driver = new ChromeDriver();
		String baseUrl = "https://www.amazon.in/";	
		driver.get(baseUrl);
		Thread.sleep(3000);
		WebElement signinbtn = driver.findElement(By.className("nav-line-1-container"));
		signinbtn.click();
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("9620301980");
		
		WebElement continueBn = driver.findElement(By.id("continue"));
		continueBn.click();
		
		WebElement email1 = driver.findElement(By.id("ap_password"));
		email1.sendKeys("Yunus@5818");
		
		WebElement btn = driver.findElement(By.id("signInSubmit"));
		btn.click();

		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle="";	
		actualTitle = driver.getTitle();

		if(actualTitle.contentEquals(expectedTitle))
			System.out.println("Test Passed");
		else
		{
			System.out.println("Test Failed");			
		}
		
		driver.quit();		

	}

}
