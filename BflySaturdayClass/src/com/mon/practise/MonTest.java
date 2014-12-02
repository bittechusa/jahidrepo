package com.mon.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sat.practise.SatTest;

public class MonTest 
{
	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		WebElement newLink=driver.findElement(By.xpath(".//*[@id='gb_70']"));
	
		
		SatTest sattest=new SatTest(driver);
		sattest.type(newLink);
		Thread.sleep(5000);
		driver.close();
	}

}
