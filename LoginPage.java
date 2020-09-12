package com.CRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.base.Testbase;

public class LoginPage extends Testbase
{
	@FindBy(xpath ="//*[@id=\"user_name\"]")
	WebElement username;
	
	@FindBy(xpath ="//*[@id=\"username_password\"]")
	WebElement password;
	
	@FindBy(xpath ="//*[@id=\"bigbutton\"]")
	WebElement loginBtn;
	
	

	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un,String pw) throws InterruptedException
	{
		
			username.sendKeys(un);
			password.sendKeys(pw);
			loginBtn.click();
									
	}
}
