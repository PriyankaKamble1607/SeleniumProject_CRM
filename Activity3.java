package com.CRM.testcases;

import org.testng.annotations.Test;

import com.CRM.base.Testbase;
import com.CRM.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class Activity3 extends Testbase
{
	LoginPage loginPage;
	
  @Test
  public void copyright() 
  {
	 String footer1= driver.findElement(By.id("admin_options")).getText();
	 System.out.println("footer text="+footer1);
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
