package com.test;

import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CVS extends BaseClass {

			
	@Test (groups="regression")
	public void first4Under15() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.cvs.com/shop?icid=cvsheader:shop");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		js.executeScript("window.scrollBy(0," + 700 + ")");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"addv-shop-cat\"]/div/ul/li[3]/a")));	
		driver.findElement(By.xpath("//*[@id=\"addv-shop-cat\"]/div/ul/li[3]/a")).click();
		String tenFifteenBox = "//*[@id=\"root\"]/div/div/div/div[2]/div/div[1]/div/div/div[3]/div/div[3]/nav/div[2]/div[1]/div[6]/div[2]/div/div/div[3]/div/div[1]";
		
		js.executeScript("window.scrollBy(0," + 1800 + ")");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tenFifteenBox)));
		Thread.sleep(1000);
		driver.findElement(By.xpath(tenFifteenBox)).click();
		Thread.sleep(1000);
		List<WebElement> products = driver.findElements(By.xpath("//*[contains(@class,'css-901oao r-1jn44m2 r-evnaw r-b88u0q r-ttdzmv')]"));
	
		
		Float[] arr= new Float[4];
		for (int i=0; i<4; i++) {
			arr[i]= Float.parseFloat(products.get(i).getText().substring(1).trim());	
		}
		SoftAssert soft=new SoftAssert();
	    for (int i=0; i<4; i++) {
		 if (arr[i]  < (float) 15.00) {
			 Assert.assertTrue(true, "One product price in first 4 in the - page 10-15 - is higher than $15.00");
		 }
		 else {
			 Assert.assertFalse(true);
			
		 }
	 }
	 System.out.println("I visited CVS in Thread " + Thread.currentThread().getId());
	 soft.assertAll();	
	
	}


}

