package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Attachment {

public static void main(String[] args) throws InterruptedException {
				
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
				
//	driver.get("https://demoqa.com/upload-download");
//	driver.manage().window().maximize();
//	
//	WebElement file = driver.findElement(By.id("uploadFile"));
//	file.sendKeys("C:\\Users\\user\\Downloads\\25152402.jpg");
//	
//	Thread.sleep(4000);
//	
//	WebElement download = driver.findElement(By.id("downloadButton"));
//	download.click();
	
	
	
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	
	WebElement file1 = driver.findElement(By.id("imagesrc"));
	file1.sendKeys("C:\\Users\\user\\Downloads\\25152402.jpg");
}
}