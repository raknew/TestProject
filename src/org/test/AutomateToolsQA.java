package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomateToolsQA extends Base{
	
	public static void main(String[] args) {
		
		
		WebDriver driver = getDriver("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("firstname")).sendKeys("Siddharthan");
		driver.findElement(By.name("lastname")).sendKeys("Prabakaran");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-2")).click();
		driver.findElement(By.id("datepicker")).sendKeys("20/06/2018");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-1")).click();
		
		
		WebElement e=driver.findElement(By.id("continents"));
		Select s = new Select(e);
		s.selectByIndex(0);
		
		WebElement f=driver.findElement(By.id("selenium_commands"));
		Select q= new Select(f);
		q.selectByIndex(1);
		q.selectByIndex(2);
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("submit"))).click();
		
		
		
		
	}

}
