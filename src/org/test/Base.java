package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver getDriver(String webAddress) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-17\\Desktop\\pradeepa\\ExampleTwo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(webAddress);
		return driver;

	}
	
	
}
