package com.java.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Types {

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
//implicit wait
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	mobile.click();
	
//explicit wait
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Audio')]")));
	driver.findElement(By.xpath("//span[contains(text(),'Audio')]")).click();
	
//fluent wait
	
	FluentWait wait1 = new FluentWait(driver);
	wait1.withTimeout(4,TimeUnit.SECONDS);
	wait1.pollingEvery(1, TimeUnit.SECONDS);
	wait1.ignoring(NoSuchElementException.class);
	
	driver.findElement(By.xpath("//span[contains(text(),'Audio')]")).click();
}
}