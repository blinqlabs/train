@tag
Feature: support page
  I want to use this template for my feature file

Background: 
	Given I launch the url
    And I choose support 
 
@login @manual @regression
    Scenario: Navigation to technical support dropdown option under support
		And I choose technical support 
    And I navigate to the contents of the page
    And I enter "Web services" in search field
    And I navigate to download the files
    
    Scenario: Navigation to purchasing and licensing dropdown option
    And I choose purchasing and licensing 
    And I navigate to the contents of the page
    And I choose Saas as a option 
    And I followup with that respective pricing chart
    And I request quote which does not navigate to the followup page
    And I choose purchase as a option
    And I choose Technical Support 
    
    Scenario: Navigation to contact us
    And I choose contact us 
    Then I navigate to the contact details of the company