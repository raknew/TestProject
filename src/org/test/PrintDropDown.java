package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-17\\Desktop\\pradeepa\\ExampleTwo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/registration/");
		
		WebElement dd = driver.findElement(By.id("dropdown_7"));
		
		
		Select s = new Select(dd);
		
		List<WebElement> options = s.getOptions();
		
		System.out.println("Printing first 10 elements");
		for(int i = 0 ; i<10 ; i++)
		{
			
			WebElement element = options.get(i);
			System.out.println(element.getText());
		}
		
		System.out.println("Printing Last 10 elements");
		for(int i = options.size()-1 ; i > options.size() - 11 ; i--)
		{
			
			WebElement element = options.get(i);
			System.out.println(element.getText());
		}
		
	}

}
