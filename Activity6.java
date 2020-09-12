package com.CRM.testcases;

import org.testng.annotations.Test;

import com.CRM.base.Testbase;
import com.CRM.pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class Activity6 extends Testbase
{
	LoginPage loginPage;
  @Test
  public void ispresent() throws Throwable
  {
	  loginPage.login("admin","pa$$w0rd");
	  Thread.sleep(2000);
	  boolean displayed=driver.findElement(By.id("grouptab_3")).isDisplayed();
	  System.out.println("Element Displayed="+displayed);
	  driver.findElement(By.id("grouptab_3")).click();
	  System.out.println("Clicked on Activities ");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  initializaion();
	  openCRM();
	  loginPage=new LoginPage(); 
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() throws Throwable 
  {
	  Thread.sleep(3000);
	  driver.close();
  }
  

}
