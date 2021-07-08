package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute_Preethi_Program {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");
			
//get attribute - value
	String attribute = email.getAttribute("value");
		System.out.println("ATTRIBUTE VALUE ::"+attribute);

//get attribute - name
	String attribute2 = email.getAttribute("name");
		System.out.println("ATTRIBUTE NAME ::"+attribute2);
	
//is displayed
	boolean displayed = email.isDisplayed();
		System.out.println("is displayed?"+displayed);
		
//is enabled
	boolean enabled = email.isEnabled();
		System.out.println("is enabled?"+enabled);
	}
}