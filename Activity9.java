package com.CRM.testcases;

import org.testng.annotations.Test;

import com.CRM.base.Testbase;
import com.CRM.pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Activity9 extends Testbase
{
	LoginPage loginPage;
  @Test
  public void usernames() throws Throwable 
  {
	  loginPage.login("admin","pa$$w0rd");
	  Thread.sleep(10000); 
	  
	  
	  driver.findElement(By.id("grouptab_0")).click();
	     WebElement SalesDropDown = driver.findElement(By.id("grouptab_0"));
		    Actions action = new Actions (driver);
		    action.moveToElement(SalesDropDown).click().build().perform();
		    WebElement Lead = driver.findElement(By.id("moduleTab_9_Leads"));
		    action.moveToElement(Lead).click().build().perform();
	  /*
	  driver.findElement(By.id("grouptab_0")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("moduleTab_9_Leads")).click();
	  */
	  Thread.sleep(5000);
	 
	  
		    for(int i=1;i<=10;i++)
			  {
		    
					  String Name = driver.findElement(By.xpath("//table[1]/tbody[1]/tr["+i+"]/td[3]/b/a")).getText();
					  String Username = driver.findElement(By.xpath("//table[1]/tbody[1]/tr["+i+"]/td[8]/a")).getText();
					 System.out.println("Row No:"+i);
					  System.out.println("Name: "+Name+", Username: "+Username);  
					  
			  }
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
