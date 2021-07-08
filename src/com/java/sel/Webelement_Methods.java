package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
//webelement methods
	//findelement()---uniquely identify a web element within the webpage
	//sendkeys()---to pass the data using sendkey methods
	//click()---click the web elements
	
	WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("bodapatireshma@gmail.com");
	
	WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("reshma@123");
		
	WebElement btn_Click = driver.findElement(By.name("login"));
		btn_Click.click();
	
	}

}
