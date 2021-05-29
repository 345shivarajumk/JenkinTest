package com.gothub.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestJenkins {
	static {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	WebDriver d=null;
	
	@Test
	public void run() throws InterruptedException
	{
		d= new ChromeDriver();
		d.get("https://www.youtube.com/");
		Thread.sleep(2000);
		d.quit();
	}

}
