@tag
Feature: service page
  I want to use this template for my feature file

Background: 
	Given I launch the url
    And I choose service 
 
@login @manual @regression
  Scenario: Navigation to manage services
    And I choose Devops and content is displayed below the heading
    And I choose Learnmore under manage services
    Then I navigate to the detailed content of the manage services
    
  @login @addtest
  Scenario: Navigation to Devops
    And I choose Devops and content is displayed below the heading
    And I choose Contactus under DevOps
    Then I navigate to the contact details of the company
    
  Scenario: Navigation to Agile
    And I choose Devops and content is displayed below the heading
    And I choose Contactus under Agile
    Then I navigate to the contact details of the company
    
   Scenario: Navigation to Cheetah
    And I choose Devops and content is displayed below the heading
    And I choose Learnmore under Cheetah
    But I navigate to HTTP error code:404
    
    Scenario: Navigation to cloud under service
    And I choose cloud
    And I choose contact us which is displayed below the heading
    Then I navigate to the contact details of the company
    
    Scenario: Navigation to workflows and automation under service
    And I choose workflows and automation
    And I choose pricing link
    And I navigate to the pricing page
    And I choose Saas as a option which displays the pricing chart 
    And I followup with that respective pricing chart
    And I request quote which does not navigate to the followup page
    And I choose purchase now which does not navigate to the followup page
    And I choose Technical Support
    
    Scenario: Navigation to custom app development under service
    And I choose Custom app development
    And I choose contact us which is displayed below the heading
    Then I navigate to the contact details of the company
    
    Scenario: Navigation to training under service
    And I choose training
    And I choose contact us which is displayed below the heading
    Then I navigate to the contact details of the company 
    
    Scenario: Navigation to Enterprice service dropdown option under service
		And I choose Enterprice service 
    And I navigate to the contents of the page
    Then I choose Learnmore in the content page 
    But I can not access the detailed page 
    
    Scenario: Navigation to Startups and SMBs dropdown option
    And I choose Startups and SMBs dropdown under service
    And I navigate to the contents of the page
    Then I choose Learnmore in the content page 
    
    Scenario: Navigation to DevOps tool chain(Saas) dropdown option
    And I choose DevOps tool chain(Saas) dropdown under service
    And I navigate to the contents of the page
    
    Scenario: Navigation to open source projects dropdown option
    And I choose open source project dropdown under service
    And I navigate to the contents of the page
    
    Scenario: Navigation to Trainings and certification dropdown option
    And I choose Trainings and certifications dropdown under service
    And I navigate to the contents of the page
    Then I choose Learnmore in the content page 
    But I can not access the detailed page 
    
    
    
    
    
    