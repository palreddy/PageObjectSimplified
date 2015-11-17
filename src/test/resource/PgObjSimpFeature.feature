Feature: Implementing Page Object Model in Cow & Gate Site
  as a user 
  I want to populate Register page 
  then it should navigate to registration succesfull page
  
  Background:
   Given I am in Cow & Gate Home Page

  Scenario: Populating the registration form
   
    When I click on "Join Our Club" link
  	And I populate the data in registration page
  	|data|
  	|wxy-vwx-NE45AN-1-1-2015-yes-wxy@gmail.com-khjjjjjj-ABCDEF075|
  	
    And click on JoinTheClub link
    Then I should navigate to registration sucessfull page
    
    
    