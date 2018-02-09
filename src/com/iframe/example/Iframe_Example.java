package com.iframe.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_Example {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Second Commit 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT"
				+ "\\Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://toolsqa.com/iframe-practice-page/");
		
		WebElement iframe = driver.findElement(By.cssSelector("#IF2"));
		
		driver.switchTo().frame(iframe); 
		
		String text = driver.findElement(By.cssSelector("div.col-"
				+ "md-4:nth-child(1) > h5:nth-child(1)")).getText();
		System.out.println(text);
		
		Assert.assertEquals("Unique & Clean", text);
		
		System.out.println("Result Passed");
		
		driver.switchTo().defaultContent();
		
		String text2 = driver.findElement(By.cssSelector(".h1-size")).getText();
		System.out.println("Move to main Website : " + text2);


	} 

}
