package com.cucumber.PageObjectMavenSimplified;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SPgObjHomePage extends SPgObjAbstractPage{
	
	public SPgObjHomePage(WebDriver driver) {
		super(driver);
	}
	
	public SPgObjRegistrationPage clickJoinNow(){
		driver.findElement(By.cssSelector("#nav-join-our-club")).click();
		return new SPgObjRegistrationPage(driver);
		
	}

}
