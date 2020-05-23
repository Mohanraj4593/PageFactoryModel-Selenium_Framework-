package com.abc.Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut {
	WebDriver driver;
	@FindBy(linkText="Log Out")
	WebElement logout;

	public LogOut(WebDriver driver) 
	{
	this.driver=driver;
	}

	public void cliclOnLogOut() 
	{
		logout.click();
	}
}
