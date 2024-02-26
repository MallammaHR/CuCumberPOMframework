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
					get("https://web.facebook.com/");
		
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
	
//	@Given("user is one login page")
//	public void user_is_one_login_page()
//	{
//	 
//	}
//
//	@Then("forgotpassword link should be displayed")
//	public void forgotpassword_link_should_be_displayed() 
//	{
//	  loginpage.isforgotPssswordExixts();
//	}



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
	
	@When("Click on Robot click action")
	public void click_on_robot_click_action() 
	{
	   
	}


	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
		loginpage.clickOnSignBtn();
	   
	}

	@Then("user gets the Title of the Home page")
	public void user_gets_the_title_of_the_home_page()
	{
		 String homePageTitle = DriverFactory.getDriver().getTitle();
		    System.out.println("Home page Title is: " + homePageTitle);

		    // Add assertions or verification steps for the home page title
		    Assert.assertEquals("actiTIME - Enter Time-Track", homePageTitle.trim());
	}



	@Then("Page Title should be {string}")
	public void Page_title_should_be(String expectedTitle) 
	{
		String actualTitle = DriverFactory.getDriver().getTitle();
	    System.out.println("Actual page Title is: " + actualTitle);

	    // Add assertions or verification steps for the page title
	    Assert.assertEquals(expectedTitle, actualTitle.trim());
	    
	}









}