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
		//WebElement email = driver.findElement(By.cssSelector("input[id=ap_email]"));
		// tag[Attributename='AttributeValue']
		// tag#AttributeValue
		//WebElement email = driver.findElement(By.cssSelector("input#ap_email"));
		//Below is for css with classname
		//WebElement email = driver.findElement(By.cssSelector("input.a-input-text.a-span12.auth-autofocus.auth-required-field"));
		//css Start with
		//WebElement email = driver.findElement(By.cssSelector("input[id^=ap_em]"));
		//css End with
		//WebElement email = driver.findElement(By.cssSelector("input[id$=email]"));
		//SubString
		WebElement email = driver.findElement(By.cssSelector("input[id*=mai]"));
		
		email.sendKeys("9620301980");
		Thread.sleep(1000);
		driver.quit();		

	}
	
}
