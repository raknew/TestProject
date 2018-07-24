package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-17\\Desktop\\pradeepa\\ExampleTwo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement dd = driver.findElement(By.id("selenium_commands"));
		
		
		
		Select s = new Select(dd);
		List<WebElement> options = s.getOptions();
		
	
		
		for(int j = 0 ; j < options.size();j+=2)
		{
			
			WebElement element = options.get(j);
			System.out.println(element.getText());
			
		}
	
		
	}

}