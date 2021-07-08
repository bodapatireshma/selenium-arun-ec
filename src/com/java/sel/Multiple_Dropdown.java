package com.java.sel;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
//is multiple---to check the dropdown is single or multiple
		
		WebElement state = driver.findElement(By.name("States"));
		Select s = new Select(state);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
//get options---returns all the options from the dropdown
		List<WebElement> options = s.getOptions();
//foreach	
		for (WebElement elements : options) {
//get text---to get text value from webelement	
		String text = elements.getText();
		System.out.println(text);
		
		s.selectByValue("Florida");
		s.selectByValue("Texas");
		s.selectByValue("Washington");
		}
//get all selected options
	
		List<WebElement> selectOption = s.getAllSelectedOptions();
		int size = selectOption.size();                   
		System.out.println(size);                        
		
//for loop	
		
		for (int i = 0; i < size; i++) {
			if (i==1||i==0) {
				String text = selectOption.get(i).getText();
				System.out.println(text);
			}
		}	
//foreach
		for (WebElement element : selectOption) {
			if (element.getText().equals("Texas")) {
			}
		}	
//first selected option
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first);
		
//deselect all---deselects all the values from the dropdown
				
		Thread.sleep(3000);
		//s.deselectAll();
		s.deselectByValue("Texas");
	}
}