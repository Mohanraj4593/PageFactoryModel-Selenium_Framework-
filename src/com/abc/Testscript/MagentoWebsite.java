package com.abc.Testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.PageFactory_Pages.Welcome;

public class MagentoWebsite {
public static void main(String[] args) 
{
    System.setProperty("webdriver.chrome.driver","S:SeleniumComponents\\chromedriver.exe");
    
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.magento.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    
    Welcome w=new Welcome(driver);
    
    w.clickOnMyAccount();
    
    Login l=new Login(driver);
    l.enterEmail();
    l.enterPassword();
    l.cliclOnLogin();
    
    LogOut lo=new LogOut(driver);
    lo.cliclOnLogOut();
    
    
    
	
}
}
