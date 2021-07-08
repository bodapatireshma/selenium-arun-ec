package com.java.sel;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.selenium.dev/downloads/");
	driver.manage().window().maximize();
		
//how many rows in a table                  //5
	int rows = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr")).size();
	System.out.println("Total number of rows in a table :"+rows);
	
//how many columns in a table               //6
	int columns = driver.findElements(By.xpath("//table[@class='data-list']/thead/tr/th")).size();
	System.out.println("Total number of columns in a table :"+columns);
		
//retrieve the specific value from the table
	String value = driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr[2]/td[1]")).getText();
	System.out.println("The Value is :"+value);
		
//retrieve all the datas from the table
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("Data from the table.....");
	for (int r = 1; r <= rows; r++) {
		for (int c = 1; c <= columns; c++) {
			String data = driver.findElement(By.xpath("//table[@class='data-list']//tr["+r+"]/td["+c+"]")).getText();
			System.out.print(data+"    ");	
		}
		System.out.println();
	}
}
}