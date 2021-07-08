package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Twitter {

public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://twitter.com/login");
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		WebElement username = driver.findElement(By.xpath("(//input[@name='session[username_or_email]'])[1]"));
		username.sendKeys("arunk@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("(//input[@name='session[password]'])[1]"));
		pass.sendKeys("smith@2021");
		
		WebElement login_Btn = driver.findElement(By.xpath("(//div[@data-testid='LoginForm_Login_Button'])[1]"));
		login_Btn.click();
}
}