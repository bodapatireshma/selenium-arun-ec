package com.java.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods{
	
	public static void main(String[] args) {
		
// configure chrome driver to java
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");
	
      //Interface              //Class
		WebDriver driver = new ChromeDriver();
//get()---it will launch a new browser and opens the given URL in the browser instance	
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
	
//getTitle()---to get the title of the current webpage	
		String title = driver.getTitle();
		System.out.println(title);
		
//getCurrentUrl()---gets a string representing the current url that the browser is opened
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
//getPageSource()---gets the source of the currently loaded page
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
//Close()---closes the current window
//Quit()---closes all the associated window
		driver.close();		
	}
}