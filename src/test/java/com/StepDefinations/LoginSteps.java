package com.StepDefinations;

import org.junit.Assert;

import com.Pages.LoginPOMPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{
	private LoginPOMPage loginpage=new LoginPOMPage(DriverFactory.getDriver());
	public String  title;
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		DriverFactory.getDriver().
					get("https://www.facebook.com/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page()
	{
		title=loginpage.getLoginTitle();
		System.out.println("Login Page Title is :"+title);
		
	}

	@Then("page title  should be {string}")
	public void page_title_should_be(String expectedTitle) 
	{
		Assert.assertTrue(title.equals(expectedTitle));
	}

	@When("user enters username {string}")
	public void user_enters_username(String username)
	{
	    loginpage.enterUserName(username);
	}

	@When("user enetrs password {string}")
	public void user_enetrs_password(String password) 
	{
	    loginpage.enterPassword(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
		loginpage.clickOnSignBtn();
	   
	}

	@Then("user is On th HomePage")
	public void user_is_on_th_home_page()
	{
	   
	}





}