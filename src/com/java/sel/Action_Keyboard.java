package com.java.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Keyboard{

public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement plugin = driver.findElement(By.xpath("//a[text()='Plugins']"));
		act.contextClick(plugin).build().perform();
		
		Robot rob = new Robot();
		
		for (int i = 0; i < 5; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(3000);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
}
}