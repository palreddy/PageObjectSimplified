package com.cucumber.PageObjectMavenSimplified;

import org.openqa.selenium.WebDriver;



public class SPgObjAbstractPage {
protected WebDriver driver;
	
	public SPgObjAbstractPage(WebDriver driver) {
		this.driver=driver;
	}

	public void getMaximise(){
		driver.manage().window().maximize(); 
	}
	
	public SPgObjHomePage getHomePage(){
		driver.get("http://www.cgbabyclub.co.uk/");
		return new SPgObjHomePage(driver);
	}
	public SPgObjRegistrationPage getRegistrationPage(){
		driver.get("https://www.cgbabyclub.co.uk/register");
		return new SPgObjRegistrationPage(driver);
	}
	public String getPageTitle(){
		String title=driver.getTitle();
		return title;
	}


}
