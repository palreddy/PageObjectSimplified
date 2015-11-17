package com.cucumber.PageObjectMavenSimplified;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SPgObjCommonPage {
	
	/*
	 * And I enter "pqr" in First name field
    And I enter "stu" in Last name field
    And I enter "NE4 5AN" in PostCode field
    And I select "1"  in date  field
    And I select "1"  in month field
    And I select "2015"  in year field
    And I select  "yes" in is this your first baby
    And I enter "stu@gmail.com" in Email Address field
    And I enter "fhjjhjjh" in Username field
    And I enter "ABCDEF075" in Password field
    And I select what goodies would you like
    And I select  checkbox in terms and conditions
	 */
	
	
WebDriver driver=new FirefoxDriver();
	
	SPgObjHomePage homePage ;
	SPgObjRegistrationPage registrationPage;
	SPgObjConfirmPage confirmPage;

	@Given("^I am in Cow & Gate Home Page$")
	public void I_am_in_Cow_Gate_Home_Page() throws Throwable {
		homePage= new SPgObjHomePage(driver);
		homePage.getMaximise();
		homePage.getHomePage();
	  
	}

	@When("^I click on \"([^\"]*)\" link$")
	public void I_click_on_link(String arg1) throws Throwable {
		registrationPage=homePage.clickJoinNow();
	}

	/*@When("^I populate the registration page$")
	public void I_populate_the_registration_page() throws Throwable {
		
	   
	}*/
	@When("^I populate the \"([^\"]*)\" in registration page$")
	public void I_populate_the_in_registration_page(String arg1, DataTable arg2) throws Throwable {
		
	    
	}

	@When("^click on JoinTheClub link$")
	public void click_on_JoinTheClub_link() throws Throwable {
		confirmPage=registrationPage.getRegistered();	
	}

	@Then("^I should navigate to registration sucessfull page$")
	public void I_should_navigate_to_registration_sucessfull_page() throws Throwable {
		String regTitle="Register as a member of the C&G baby club - C&G baby club";
		
		Assert.assertTrue("Test Fail",confirmPage.getPageTitle().equals(regTitle));
	   
	}

}
