package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Mouse {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("http://demo.automationtesting.in/Index.html");
//		
//		WebElement signUp = driver.findElement(By.id("enterimg"));
//		
//		Actions act = new Actions(driver);
//		act.click(signUp).build().perform();
//		
//	//context click---performs right click
//		
//		WebElement rightClk = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//		act.contextClick(rightClk).perform();
		
		
		
		
		
//		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
//		
//		Actions act = new Actions(driver);
//		
//	//double click---performs double click
//		
//		WebElement dblClk = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		act.doubleClick(dblClk).perform();
		
		
		
		
//		driver.get("https://www.amazon.in/");
//		
//		Actions act = new Actions(driver);
//		
//	//move element---moves the mouse 
//		WebElement moveElement = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
//		act.moveToElement(moveElement).perform();
//		
//		Thread.sleep(6000);
//		
//		moveElement.click();
		
		
		
		
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
	//drag and drop
		//source element
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//target element
		WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(from,to).build().perform();
}
}