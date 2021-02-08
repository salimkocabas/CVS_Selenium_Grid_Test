package com.test;


import org.testng.annotations.Test;
import org.testng.Assert;




public class TestA extends BaseClass{

	
	@Test(priority=2, groups="regression")
	public void goToGoogle() throws InterruptedException{
		driver.get("https://www.google.com.tr/");
		String expected ="Google";
		String  actual=driver.getTitle();
		System.out.println("I visited GOOGLE in Thread " + Thread.currentThread().getId());
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);

}
	@Test (priority=1, groups="regression")
	public void goToRedvet() throws InterruptedException{
		driver.get("http://www.redvet.org.tr");
		String expected ="REDVET – International Association for Research and Development of Vocational Education and Training";
		String  actual=driver.getTitle();
		System.out.println("I visited REDVET in Thread " + Thread.currentThread().getId());
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);

}
	@Test(priority=3, groups="regression")
	public void goToFace() throws InterruptedException{
		driver.get("https://www.facebook.com/");
		String expected="Facebook - Log In or Sign Up";
		System.out.println("I visited FACE in Thread " + Thread.currentThread().getId());
		String actual=driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);
		
}
	}
