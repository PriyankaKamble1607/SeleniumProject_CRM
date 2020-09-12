package com.CRM.testcases;

import org.testng.annotations.Test;

import com.CRM.base.Testbase;
import com.CRM.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class Activity5 extends Testbase
{
	LoginPage loginPage;
  @Test
  public void color() throws Throwable 
  {
	  loginPage.login("admin","pa$$w0rd");
	  String color= driver.findElement(By.className("desktop-toolbar")).getCssValue("color");
	  System.out.println("color code="+color);
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
