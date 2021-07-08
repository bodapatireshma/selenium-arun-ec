package com.java.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_Xpath_SS_Singledropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'in your life')]"));       //contains & text
		//WebElement forgot_pw = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));     //text
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));                  //index
		create.click();
		
		Thread.sleep(4000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First name']"));    //basic
		firstname.sendKeys("Empire");
		
		WebElement surname = driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));   //contains
		surname.sendKeys("King");
		
		Thread.sleep(2000);
		
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("9876543210");
		
		WebElement pass = driver.findElement(By.xpath("//input[@data-type='password']"));
		pass.sendKeys("password");
		
		Thread.sleep(3000);
		
//screenshot
			//interface          //obj class
		TakesScreenshot ts = (TakesScreenshot) driver;	//narrowing type casting
		File source = ts.getScreenshotAs(OutputType.FILE);  //get screenshot
		File destination = new File("C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Screenshot\\image1.png");   //file destination
		FileUtils.copyFile(source, destination);          //copy source file to destination
		
//single dropdown
		
	//day
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("18");
		
	//month
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("May");
		
	//year	
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByIndex(26);
	}
}