package com.qa.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	
	public WebDriver init_driver(String browser) {
		System.out.println("Browser Type is :"+browser);
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setAcceptInsecureCerts(true);
			
			tlDriver.set(new ChromeDriver(caps));
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setAcceptInsecureCerts(true);
			
			tlDriver.set(new EdgeDriver(caps));
		}
		else {
			System.out.println("Entered invalid browser:" + browser);
		}
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return getDriver();
	}
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

}
