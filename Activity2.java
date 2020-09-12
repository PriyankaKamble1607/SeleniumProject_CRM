package com.CRM.testcases;

import org.testng.annotations.Test;

import com.CRM.base.Testbase;
import com.CRM.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class Activity2 extends Testbase {
	LoginPage loginPage;
  @Test
  public void getHref() 
  {
	 String element= driver.findElement(By.xpath("//a[@title=\"SuiteCRM\"]")).getAttribute("href");
	  System.out.println("header href="+element);
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
	  Thread.sleep(2000);
	  driver.close();
  }

}
