package com.StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps 
{
	private LoginPage login=new LoginPage(DriverFactory.getDriver());
	public static String title;

	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		DriverFactory.getDriver().
				get("https://www.amazon.in/");
		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page()
	{
	    
		 title=login.getLoginTitle();
		 System.out.println("Title of the WebPage is :"+title);
	}

	@Then("page title  should be {string}")
	public void page_title_should_be(String expectedTitle)
	{
		Assert.assertTrue(title.contains(expectedTitle));
	    
	}

	@Given("user is one login page")
	public void user_is_one_login_page() 
	{
	    
	}
	@Then("forgotpassword link should be displayed")
	public void forgotpassword_link_should_be_displayed() 
	{
		 Assert.assertTrue(login.isforgotPssswordExixts()); 
	}


	@When("user enters username {string}")
	public void user_enters_username(String username) 
	{
		login.enterUserName(username);
	    
	}

	@When("user enetrs password {string}")
	public void user_enetrs_password(String password) 
	{
	    login.enterPassword(password);
	    
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button()
	{
	    login.clickOnSignBtn();
	}





}
