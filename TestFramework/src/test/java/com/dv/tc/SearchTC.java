package com.dv.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchTC {

	@Test
	public void search() {
			// TODO Auto-generated method stub
	    
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh\\Downloads\\chromedriver\\chromedriver.exe");
			 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.ca/");
		  	 
		 driver.findElement(By.name("q")).sendKeys("Selenium");
		 driver.findElement(By.name("btnK")).submit();
		 
		 System.out.println("Test Passed");
		 System.out.println("Able to search for SELENIUM");
		 
		 driver.close();
		 
		}
	}


