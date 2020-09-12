package com.CRM.testcases;

import org.testng.annotations.Test;

import com.CRM.base.Testbase;
import com.CRM.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class Activity7 extends Testbase
{
	
	LoginPage loginPage;
	
  @Test
  public void information() throws InterruptedException 
  {
	  loginPage.login("admin","pa$$w0rd");
	  Thread.sleep(2000);
	  driver.findElement(By.id("grouptab_0")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("moduleTab_9_Leads")).click();
	  Thread.sleep(5000);
	 driver.findElement(By.xpath("//table/tbody/tr[1]/td[10]/span/span")).click();
	 String Mobile=driver.findElement(By.className("phone")).getText();
	  driver.switchTo().frame(0);
	  System.out.println("Mobile number="+Mobile);
	  
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
