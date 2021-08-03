package com.yunus.org;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicTest {

	public static void main(String[] args) throws Exception
	{	
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver");		
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			/*Thread.sleep(4000);
			driver.navigate().to("https://mail.google.com/mail/u/0/?ogbl#inbox");			
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.navigate().forward();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			driver.close();	*/
	}

}
