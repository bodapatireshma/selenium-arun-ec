package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement mobile = driver.findElement(By.xpath("(//a[text()='Mobiles'])[1]"));
	//click
		js.executeScript("arguments[0].click();", mobile);
		
	//scrollintoview
		WebElement back = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView();",back);
		
	//scrollup
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0, -3000);");
		
	//alert
		js.executeScript("alert('Done...');");
		driver.switchTo().alert().accept();
		
	//gettitle
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
}
}