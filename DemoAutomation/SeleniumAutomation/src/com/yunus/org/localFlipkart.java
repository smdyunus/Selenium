package com.yunus.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class localFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");		
		ChromeDriver driver = new ChromeDriver();
		String baseUrl = "file:///home/yunusshaik/Desktop/flipkart.html";	
		driver.get(baseUrl);
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.cssSelector("input[type='text']"));
		//tag[Attributename='attributevalue']
		un.clear();
		un.sendKeys("YunusShaik");
		
		WebElement pw = driver.findElement(By.cssSelector("input[type='password']"));
		//tag[Attributename='attributevalue']
		pw.clear();
		pw.sendKeys("Pass1234");
		
		WebElement loginBtn = driver.findElement(By.cssSelector("input[type='button']"));
		loginBtn.click();
		
		WebElement cb = driver.findElement(By.cssSelector("input[type='checkbox']"));
		cb.click();
		//WebElement fpw = driver.findElement(By.id("fb"));
		//WebElement fpw = driver.findElement(By.name("facebook"));
		//WebElement fpw = driver.findElement(By.className("fblogin"));
		//WebElement fpw = driver.findElement(By.linkText("Forgot Password?"));
		WebElement fpw = driver.findElement(By.partialLinkText("Forgot"));
		fpw.click();
		driver.close();
		
	}

}
