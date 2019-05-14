package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Modules {
	public static WebDriver driver;
	static String browser;
	public static void setBrowser() {
		PropertiesEx.readProperties();
		browser=PropertiesEx.properties.getProperty("browser");
	}
	public static void setBrowserConfig() {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prana\\eclipse-workspace\\ModularTest4\\src\\main\\java\\chromedriver.exe");
		}
	}
	public static void runTest() {
		driver=new ChromeDriver();
		driver.get(PropertiesEx.properties.getProperty("url"));		
	}
	public static void endTest() {
		driver.quit();
	}
}
