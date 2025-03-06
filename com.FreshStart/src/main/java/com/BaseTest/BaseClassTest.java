package com.BaseTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClassTest {
	@BeforeSuite(groups="Regression Test")
	public static void configBeforeSuite()
	{
		System.out.println("before suite config");
	}

	
	@BeforeClass(groups="Regression Test")
	public static void configBeforeClass()
	{
		System.out.println("before class config");
	}
	
	@BeforeMethod(groups="Regression Test")
	public static void configBeforeMethod()
	{
		System.out.println("before Method config");
	}
	
	@AfterSuite(groups="Regression Test")
	public static void configAfterSuite()
	{
		System.out.println("After suite config");
	}

	
	@AfterClass(groups="Regression Test")
	public static void configAfterClass()
	{
		System.out.println("After class config");
	}
	
	@AfterMethod(groups="Regression Test")
	public static void configAfterMethod()
	{
		System.out.println("After Mathod config");
	}
	
}
