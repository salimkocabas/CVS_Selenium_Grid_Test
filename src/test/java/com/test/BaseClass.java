package com.test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BaseClass {
	
	 static WebDriver driver;
	 static String hubURL="http://ec2-52-86-42-25.compute-1.amazonaws.com:4444/wd/hub";
	 

	@BeforeMethod(alwaysRun = true)
	public void setupDriver() throws MalformedURLException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
		DesiredCapabilities dc= new DesiredCapabilities();
		//driver = new ChromeDriver();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
//		dc.setBrowserName("firefox");
//		ChromeOptions co= new  ChromeOptions();
//		co.merge(dc);//
		
		driver = new RemoteWebDriver(new URL(hubURL),dc);
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	


	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		if (driver != null) {
		driver.close();
		driver.quit();}

}

}
