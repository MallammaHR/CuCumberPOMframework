package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOMPage
{
	public WebDriver driver;
	
	//1.By locators(initalization)

	
	private By emailID=By.name("email");
	private By password=By.name("pass");
	private By signinBTN=By.name("login");
	//private By forgotPassWord=By.xpath("//a[contains(text(), 'Forgot password?')]");
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
	
//	public boolean isforgotPssswordExixts()
//	{
//		return driver.findElement(forgotPasswordLink).isDisplayed();
//	}
	
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
		 driver.findElement(signinBTN);
	 }
}
