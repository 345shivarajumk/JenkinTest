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
		System.out.println("browser opened");
		d= new ChromeDriver();
		System.out.println("youtube loadesd");
		d.get("https://www.youtube.com/");
		Thread.sleep(2000);
		d.quit();
		System.out.println("browser closed");
	}

}
