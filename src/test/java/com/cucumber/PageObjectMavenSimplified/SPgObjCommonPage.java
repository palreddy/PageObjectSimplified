package com.cucumber.PageObjectMavenSimplified;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SPgObjCommonPage {
	
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


	@When("^I populate the data in registration page$")
	public void I_populate_the_data_in_registration_page(DataTable data) throws Throwable {
		
	   List inputData= registrationPage.getDataSorted(data);
	   
	   registrationPage.getFirstName((String) inputData.get(0))
	   .getLastName((String) inputData.get(1))
	   .getPostCode((String) inputData.get(2))
	   .getDay((String) inputData.get(3))
	   .getMonth((String) inputData.get(4))
	   .getYear((String) inputData.get(5))
	   .getBaby((String) inputData.get(6))
	   .getEmail((String) inputData.get(7))
	   .getUserName((String) inputData.get(8))
	   .getPassword((String) inputData.get(9))
	   .getGoodies()
	   .getTerms();
	   
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
