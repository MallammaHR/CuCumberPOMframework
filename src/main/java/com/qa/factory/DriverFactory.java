package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory 
{
	public WebDriver driver;
	
	private static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return tlDriver.get();
	}
	
	  public WebDriver init_Driver(String browser) {
	        System.out.println("Browser value is: " + browser);

	        if (browser.equals("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            tlDriver.set(new ChromeDriver());
	        } else if (browser.equals("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            tlDriver.set(new FirefoxDriver());
	        } else {
	            System.out.println("Please enter a valid browser name."+browser);
	        }

	        WebDriver driver = getDriver();
	        if (driver != null) {
	            driver.manage().deleteAllCookies();
	            driver.manage().window().maximize();
	        }

	        return driver;
	    }

}
