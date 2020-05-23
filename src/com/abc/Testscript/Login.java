package com.abc.Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

WebDriver driver;
@FindBy(id="email")
WebElement email;

@FindBy(id="pass")
WebElement pass;

@FindBy(id="send2")
WebElement login;

public Login(WebDriver driver) 
{
this.driver=driver;
}

public void enterEmail() 
{
email.sendKeys("sharonvictoria0692@gmail.com");
}


public void enterPassword()
{
	pass.sendKeys("Welcome@1234");
}

public void cliclOnLogin() 
{
	login.click();
}


}
