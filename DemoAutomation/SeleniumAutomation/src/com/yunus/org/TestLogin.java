package com.yunus.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) throws Exception 
	{
				System.setProperty("webdriver.chrome.driver","drivers/chromedriver");		
				ChromeDriver driver = new ChromeDriver();
				String baseUrl = "https://www.amazon.in/";
				driver.get(baseUrl);
				Thread.sleep(2000);
				WebElement text = driver.findElement(By.linkText("Mobiles"));
				System.out.println(text.getText());
				
	}

}
