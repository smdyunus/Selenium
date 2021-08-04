package com.yunus.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestXpath {

	public static void main(String[] args) throws Exception 
	{	
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "https://www.amazon.in/";	
		driver.get(baseUrl);
		Thread.sleep(1000);
		WebElement signinbtn = driver.findElement(By.className("nav-line-1-container"));
		signinbtn.click();
		//Relative xpath
		//WebElement email = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div/div/div/div/input[1]"));
		
		//Absolute xpath
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("9620301980");
		
		//WebElement btn = driver.findElement(By.xpath("//input[@id='continue']"));
		//btn.click();
		
		//xpath by text() function 
		//WebElement cond = driver.findElement(By.xpath("//a[text()='Conditions of Use']"));
		
		//xpath by contains() function  with text()
		//WebElement cond = driver.findElement(By.xpath("//span[contains(text(),'Need')]"));

		//xpath by contains() function  with class
		//WebElement cond = driver.findElement(By.xpath("//span[contains(@class,'expander')]"));

		//Backward Traversing 
		//WebElement cond = driver.findElement(By.xpath("//input[contains(@id,'ap_email')]/../label"));
		//Preceding sibling
		//WebElement cond = driver.findElement(By.xpath("//input[contains(@id,'ap_email')]/preceding::label"));
		//System.out.println(cond.getText());

		//Forward Traversing 
		//WebElement btn = driver.findElement(By.xpath("//input[contains(@id,'ap_email')]/../../div[2]/span"));
		//btn.click();
		
		//Following sibling
		//WebElement btn = driver.findElement(By.xpath("//input[contains(@id,'ap_email')]/following::span"));
		//Thread.sleep(3000);
		//btn.click();
			
		WebElement btn = driver.findElement(By.xpath("//input[starts-with(@id,'cont')]"));
		btn.click();
		driver.quit();
	
	}

}
