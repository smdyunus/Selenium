package com.yunus.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");		
		ChromeDriver driver = new ChromeDriver();
		String baseUrl = "https://www.amazon.in/";	
		driver.get(baseUrl);
		Thread.sleep(3000);
		//WebElement AmazonPay = driver.findElement(By.linkText("Amazon Pay"));
		WebElement Mobiles = driver.findElement(By.linkText("Mobiles"));
		//AmazonPay.click();
		Mobiles.click();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement l:list) 
		{
			System.out.println(l);
		}
		driver.close(); //It will close only a single/Current window
		driver.quit();  //It will close all the window/tab
	}
	
}
