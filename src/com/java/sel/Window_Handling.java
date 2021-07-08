package com.java.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.BreakIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
	//new release
		WebElement newRelease = driver.findElement(By.xpath("(//a[text()='New Releases'])[1]"));
		act.contextClick(newRelease).build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
	//electronics	
		WebElement electronic = driver.findElement(By.xpath("(//a[text()=' Electronics '])[1]"));
		act.contextClick(electronic).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
	//customer service
		WebElement custService = driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));
		act.contextClick(custService).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
//getWindowHandle---return parent window id
		
//		String WindowHandle = driver.getWindowHandle();	
//		String title = driver.getTitle();
//		System.out.println(title);
		
//getWindowHandles---return all active windows
		Set<String> windowHandles = driver.getWindowHandles();
		
		Thread.sleep(3000);
		
		for (String str : windowHandles) {
			//get title based on window id
			
			
			String title = driver.switchTo().window(str).getTitle();
			
			System.out.println(title);
		}
		
	String amazonHelp = "Amazon.in Help: Help";
	
	Thread.sleep(2000);
	
	for (String str : windowHandles) {
		if (driver.switchTo().window(str).getTitle().equals(amazonHelp)) {
			System.out.println("Done...");
			break;
	}System.out.println("check");
	}
}
}