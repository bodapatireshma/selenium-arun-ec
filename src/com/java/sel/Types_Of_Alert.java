
package com.java.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Types_Of_Alert {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
//simple alert
	WebElement alertclk = driver.findElement(By.xpath("(//button[contains(text(),'click the button to display')])[1]"));
	alertclk.click();
		
	Thread.sleep(3000);
		
	Alert alert = driver.switchTo().alert();
	alert.accept();
		
//confirm alert
		
	Thread.sleep(2000);
		
	WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));	
	confirm.click();	
	
	WebElement confclk = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	confclk.click();
	
	Thread.sleep(3000);
		
	Alert alert2 = driver.switchTo().alert();
	alert2.dismiss();
	
//prompt alert
	
	WebElement alertclk1 = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]"));
	alertclk1.click();
	
	WebElement alertbtn = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"));
	alertbtn.click();
	
	Thread.sleep(2000);
	
	Alert alert3 = driver.switchTo().alert();
	alert3.sendKeys("Hi Alert");
	Thread.sleep(2000);
//get text
	String text = alert3.getText();
	alert3.accept();
	System.out.println(text);
	}
}