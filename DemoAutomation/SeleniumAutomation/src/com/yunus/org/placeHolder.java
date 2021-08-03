package com.yunus.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class placeHolder {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");		
		ChromeDriver driver = new ChromeDriver();
		String baseUrl = "https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=0HDV4P0ETZHK0A4PDQ3F&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
		driver.get(baseUrl);
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.name("customerName"));
		name.sendKeys("Yunus");
		Thread.sleep(4000);
		name.clear();
		Thread.sleep(4000);
		name.sendKeys("Shaik");
		WebElement text = driver.findElement(By.name("email"));
		//System.out.println(text.getText());
		String output = text.getAttribute("placeholder");
		System.out.println(output);
		text.sendKeys("962912222");
		Thread.sleep(4000);
		//driver.close();
	}

}
