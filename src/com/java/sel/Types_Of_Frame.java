package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Types_Of_Frame{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
//size---returns frame size
			int size = driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);
			
//index
			Thread.sleep(2000);
//			WebDriver frame = driver.switchTo().frame(0);
			Thread.sleep(2000);
			
		WebElement frameinput = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			frameinput.sendKeys("I frame");
			
//defaultcontent---switch to main page
			
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
			iframe.click();
			
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(outerframe);
		

		WebElement innerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(innerframe);
		
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("We have in Inner Frame");
		
		//parent frame---back to parent frame
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		
		//default content
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
	}
}
