package com.yunus.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver");		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	String baseUrl = "https://www.amazon.in/";	
	driver.get(baseUrl);
	Thread.sleep(3000);
	WebElement signinbtn = driver.findElement(By.className("nav-line-1-container"));
	signinbtn.click();
	WebElement email = driver.findElement(By.id("ap_email"));
	email.sendKeys("9620301980");

	WebElement continueBn = driver.findElement(By.id("continue"));
	
	Point p = continueBn.getLocation();
	System.out.println("Button color > "+continueBn.getCssValue("color"));
	System.out.println("Location of Button X and Y axis > "+p);
	
	System.out.println("Button Hight > "+continueBn.getSize().height);
	System.out.println("Button Width > "+continueBn.getSize().width);

	System.out.println("Button is Displayed > "+continueBn.isDisplayed());
	System.out.println("Button is Enable > "+continueBn.isEnabled());
	
	continueBn.click();

	//WebElement email1 = driver.findElement(By.id("ap_password"));
	//email1.sendKeys("Yunus@5818");
	
	WebElement cb = driver.findElement(By.name("rememberMe"));
	//cb.click();
	System.out.println("Checkbox is Selected > "+cb.isSelected());
	
	
	driver.close();

	
	}
}
