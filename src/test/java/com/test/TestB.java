package com.test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
public class TestB {
	
	@Test(priority=4, groups="smoke")
	public void test1inB() {
	System.out.println("I'm Test1 in Class B in Thread  "+ Thread.currentThread().getId());
	}
	@Test(priority=4, groups="smoke")
	public void test2inB() {
	System.out.println("I'm Test2 in Class B in Thread  "+ Thread.currentThread().getId());
	}
	@Test(priority=4, groups="smoke")
	public void test3inB() {
	System.out.println("I'm Test3 in Class B in Thread  "+ Thread.currentThread().getId());
	}

}
