package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage
{
	public WebDriver driver;
	//locators

	private By emailID=By.name("username");
	private By password=By.name("pwd");
	private By signinBTN=By.xpath("//div[.='Login ']");
	
	//2.Constructor
	public AccountsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

		//3.Utilization
		public String getLoginTitle()
		{
			return driver.getTitle();	
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
		
	
	
	
	
}
