package com.cucumber.PageObjectMavenSimplified;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;



public class SPgObjRegistrationPage extends SPgObjAbstractPage{
	public SPgObjRegistrationPage(WebDriver driver) {
		super(driver);
	}

	public SPgObjRegistrationPage getFirstName(String fFirstName){
		
		driver.findElement(By.cssSelector("[name='forename']")).clear();
		
		driver.findElement(By.cssSelector("[name='forename']")).sendKeys(fFirstName);
		return new SPgObjRegistrationPage(driver);
	}
	
	
	public SPgObjRegistrationPage getLastName(String fLastName){
		
		driver.findElement(By.cssSelector("[name='surname']")).clear();
		driver.findElement(By.cssSelector("[name='surname']")).sendKeys(fLastName);
	
		return new SPgObjRegistrationPage(driver);
	}
	public SPgObjRegistrationPage getPostCode(String fPostCode){
	
		driver.findElement(By.cssSelector("[name='postcode_find']")).clear();
	
		driver.findElement(By.cssSelector("[name='postcode_find']")).sendKeys(fPostCode);
	
		return new SPgObjRegistrationPage(driver);
	}

	public SPgObjRegistrationPage getDay(String fDay){
	
		driver.findElement(By.cssSelector("#edd_day")).clear();
		driver.findElement(By.cssSelector("#edd_day")).sendKeys(fDay);
		return new SPgObjRegistrationPage(driver);
	}
	public SPgObjRegistrationPage getMonth(String fMonth){
	
		driver.findElement(By.cssSelector("#edd_month")).clear();
		driver.findElement(By.cssSelector("#edd_month")).sendKeys(fMonth);
		return new SPgObjRegistrationPage(driver);
	}

	public SPgObjRegistrationPage getYear(String fYear){
	
		driver.findElement(By.cssSelector("#edd_year")).clear();
		driver.findElement(By.cssSelector("#edd_year")).sendKeys(fYear);
		return new SPgObjRegistrationPage(driver);
	}
	public SPgObjRegistrationPage getBaby(String fBaby){
	
		driver.findElement(By.cssSelector("#child_first_"+fBaby+"")).click();
		return new SPgObjRegistrationPage(driver);
	}
	public SPgObjRegistrationPage getEmail(String fEmail){
	
		driver.findElement(By.cssSelector("[type='email']")).clear();
	
		driver.findElement(By.cssSelector("[type='email']")).sendKeys(fEmail);
 
		return new SPgObjRegistrationPage(driver);
	}

	public SPgObjRegistrationPage getUserName(String fUser){
	
		driver.findElement(By.cssSelector("#profile_name")).clear();
		driver.findElement(By.cssSelector("#profile_name")).sendKeys(fUser);
		return new SPgObjRegistrationPage(driver);
	}

	public SPgObjRegistrationPage getPassword(String fPass){
	
		driver.findElement(By.cssSelector("[type='password']")).clear();
	
		driver.findElement(By.cssSelector("[type='password']")).sendKeys(fPass);
		return new SPgObjRegistrationPage(driver);
	}

	public SPgObjRegistrationPage getGoodies(){
	
		driver.findElement(By.cssSelector("#checkbox_optin_email")).click();
		return new SPgObjRegistrationPage(driver);
	}

	public SPgObjRegistrationPage getTerms(){
		driver.findElement(By.cssSelector("#accept")).click();

		return new SPgObjRegistrationPage(driver);
	}

	public SPgObjConfirmPage getRegistered(){
	
		driver.findElement(By.cssSelector(".non-mobile.button.button-large.primaryButton")).click();
		return new SPgObjConfirmPage(driver);
	}
/*public List getDataSorted(DataTable data){
	
	List<List<String>> input=data.raw();
	String longData=input.get(1).get(0);  
	
	
	
	return list
}*/
}
