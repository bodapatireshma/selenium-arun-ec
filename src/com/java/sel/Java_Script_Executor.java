package com.java.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Executor {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	//click()
		js.executeScript("arguments[0].click();", mobile);
	//scroll into view
		WebElement back = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", back);
	//scroll up
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-3000);");
	//alert	
		js.executeScript("alert('Done...');");
		driver.switchTo().alert().accept();
	//get title
		//Object executeScript = js.executeScript("return document.title;");
	//toget as return type string
		String title = js.executeScript("return document.title;").toString();
			System.out.println(title);
			
			
			
			
			
			
			
			
			
			
		
}
}