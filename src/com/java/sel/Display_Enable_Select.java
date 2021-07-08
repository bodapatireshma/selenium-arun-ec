package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display_Enable_Select {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//	//is displayed---element present or not
//		WebElement amazonApp = driver.findElement(By.className("nav-imageHref"));
//		boolean displayed = amazonApp.isDisplayed();
//		System.out.println(displayed);
		
	//is selected---option is selected or not
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement male = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		male.click();
		boolean selected = male.isSelected();
		System.out.println(selected);
		
	//is enabled---element enabled or not
		boolean enabled = male.isEnabled();
		System.out.println(enabled);
}
}