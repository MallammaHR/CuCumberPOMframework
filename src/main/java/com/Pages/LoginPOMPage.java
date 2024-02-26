package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOMPage
{
	public WebDriver driver;
	
	//1.By locators(initalization)

	
	private By emailID=By.name("username");
	private By password=By.name("pwd");
	private By signinBTN=By.xpath("//div[.='Login ']");
	private By forgotPasswordLink=By.xpath("//a[.='Forgot your password?']");
	//private By forgotPasswordLink=By.linkText("Forgot password?");
	
	//2.Constructor
	public LoginPOMPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//3.Utilization
	public String getLoginTitle()
	{
		return driver.getTitle();	
	}
	
	public boolean isforgotPssswordExixts()
	{
		return driver.findElement(forgotPasswordLink).isDisplayed();
	}
	
	public void enterUserName(String email)
	{
		driver.findElement(emailID).sendKeys(email);
	}
	 public void enterPassword(String pass)
	 {
		 driver.findElement(password).sendKeys(pass);
	 }
	 
	 public void clickOnSignBtn()
	 {
		 driver.findElement(signinBTN).click();	 
	 }
	 
	 public void doLogin(String un, String pwd)
	 {
		 System.out.println("Login with : "+un+"  "+pwd+"  ");
		  driver.findElement(emailID).sendKeys(un);
		  driver.findElement(password).sendKeys(pwd);
		  driver.findElement(signinBTN).click();
	 }
}
