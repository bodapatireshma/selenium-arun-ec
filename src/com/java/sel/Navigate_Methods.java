package com.java.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {
	
	public static void main(String[] args) {
		//map---//key---driver name //value---file location
	System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");
	
    //Interface              //Class
	WebDriver driver = new ChromeDriver();    //upcasting
	
	driver.get("https://www.google.com/");
	
//maximize ---maximizes the current window
	driver.manage().window().maximize();

//deleteallcookies---deletes all the cookies from the current page
	driver.manage().deleteAllCookies();
	
//navigate methods
	
	//navigate().to()---load a new page in the existing browser
	driver.navigate().to("https://www.amazon.in/");
	
	//navigate().back()---back to previous page
	driver.navigate().back();
	
	//navigate().forward()---forward to next page
	driver.navigate().forward();
	
	//navigate().refresh()---refreshes current page
	driver.navigate().refresh();
	
	
	
	
	
	
	
	
	}

}
