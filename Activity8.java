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

public class Activity8 extends Testbase
{
  LoginPage loginPage;
  @Test
  public void Traversing_tables() throws Throwable
  {
	  
	  loginPage.login("admin","pa$$w0rd");
	  Thread.sleep(10000);
	  driver.findElement(By.id("grouptab_0")).click();
	     WebElement SalesDropDown = driver.findElement(By.id("grouptab_0"));
		    Actions action = new Actions (driver);
		    action.moveToElement(SalesDropDown).click().build().perform();
		    WebElement Lead = driver.findElement(By.id("moduleTab_9_Accounts"));
		    action.moveToElement(Lead).click().build().perform();
	  /*
	  driver.findElement(By.id("grouptab_0")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.id("moduleTab_9_Accounts")).click();
	  */
	  Thread.sleep(10000);
	  List<WebElement> elements  = driver.findElements(By.className("oddListRowS1"));
	  
	
	  
	  for( WebElement element : elements)
	  {
		  for(int i=1;i<=5;i++)
		  {
		  System.out.println("*************");
			
			System.out.println(element.getText());
			
			System.out.println("\n");
			
			}
			break;
			
			
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
