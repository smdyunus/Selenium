package com.yunus.org;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenshot {

		public static void main(String[] args) throws InterruptedException, IOException 
		{
			
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver");		
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			String baseUrl = "https://www.amazon.in/";	
			driver.get(baseUrl);
			Thread.sleep(3000);
			
			File f1 = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("screenshots/login.png"));
			
			WebElement signinbtn = driver.findElement(By.className("nav-line-1-container"));
			signinbtn.click();
			WebElement email = driver.findElement(By.id("ap_email"));
			email.sendKeys("9620301980");

			File f2 = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f2, new File("screenshots/login_mobile_number.png"));

			WebElement continueBn = driver.findElement(By.id("continue"));			
			continueBn.click();

			WebElement email1 = driver.findElement(By.id("ap_password"));
			email1.sendKeys("Yunus@5818");
			
			File f3 = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f3, new File("screenshots/login_password.png"));

						
			WebElement btn = driver.findElement(By.id("signInSubmit"));
			btn.click();

			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			
			File f4 = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f4, new File("screenshots/Loggedin.png"));
			
			String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			String actualTitle="";	
			actualTitle = driver.getTitle();

			if(actualTitle.contentEquals(expectedTitle))
				System.out.println("Test Passed");
			else
			{
				System.out.println("Test Failed");			
			}
			driver.close();
	}

}
