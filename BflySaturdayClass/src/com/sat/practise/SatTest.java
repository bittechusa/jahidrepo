package com.sat.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SatTest 
{
	FirefoxDriver driver;
	public SatTest(FirefoxDriver driver)
	{
		this.driver=driver;
	}
	public void type(WebElement we)
	{
		we.click();
	}
	public void click(By by)
	{
		driver.findElement(by);
	}
	
}
