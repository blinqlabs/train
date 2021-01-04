@tag
Feature: Home page
  I want to use this template for my feature file

Background:
	  Given I launch the url
    And I choose Home
    
  @tag1
  Scenario: Navigation to who we are
    And I navigate to who we are
    And I enter email "r17cs406@cit.reva.edu.in" in Email field
    And I subcribe
    Then I verify the confirmation page
   
  @tag2
  Scenario: Navigation to Careers
    And I navigate to careers
    And I select Join us
    But I can not access login page
    
  Scenario: Navigation to why work with us
    And I navigate to why work with us
    And i navigate to complex page
    And I enter email " " in Email field
   	And I subcribe
    But I followup with confirmation page when no mail is given