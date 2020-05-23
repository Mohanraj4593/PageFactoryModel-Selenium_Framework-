package com.abc.PageFactory_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcome {
	
	
	WebDriver driver;
	
	@FindBy(linkText="My Account")
	WebElement MyAccount;
	
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnMyAccount() 
	{
		MyAccount.click();
	}

}
