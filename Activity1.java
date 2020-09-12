package com.CRM.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.CRM.base.Testbase;
import com.CRM.pages.LoginPage;

public class Activity1 extends Testbase
{
	LoginPage loginPage;
	
	public Activity1()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		initializaion();
		openCRM();
		loginPage=new LoginPage(); 
		
		
	}
	@Test
	public void VerifyTitle() throws Throwable
	{
		
		assertEquals("SuiteCRM", driver.getTitle());
		
		
	}
	
	@AfterMethod
	 
	public void close()
	{
		driver.close();
	}
}

