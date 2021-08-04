package com.yunus.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "https://www.amazon.in/";	
		driver.get(baseUrl);
		Thread.sleep(1000);
		WebElement signinbtn = driver.findElement(By.className("nav-line-1-container"));
		signinbtn.click();
		//Css with ID
		//WebElement email = driver.findElement(By.cssSelector("input[id=ap_email]"));
		// tag[Attributename='AttributeValue']
		Thread.sleep(2000);
		//CSS selector by class
		//WebElement email = driver.findElement(By.cssSelector("input.a-input-text.a-span12.auth-autofocus.auth-required-field"));
		
		//Start with
		//WebElement email = driver.findElement(By.cssSelector("input[id^=ap_em]"));
		
		//End with
		//WebElement email = driver.findElement(By.cssSelector("input[id$=email]"));
		
		//substring
		WebElement email = driver.findElement(By.cssSelector("input[id*=ema]"));
		email.sendKeys("9620301980");
		
		Thread.sleep(1000);
		driver.quit();		
	
		
	}
	
}
