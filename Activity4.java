package com.CRM.testcases;

import org.testng.annotations.Test;

import com.CRM.base.Testbase;
import com.CRM.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Activity4 extends Testbase
{
	LoginPage loginPage;
	
  @Test
  public void Login() throws Throwable
  {
	  loginPage.login("admin","pa$$w0rd");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  initializaion();
		openCRM();
		loginPage=new LoginPage(); 
	
  }

  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }

}
