@tag
Feature: Blog page
  I want to use this template for my feature file

Background:
	Given I launch the url
    And I choose blog
    
  @tag1
  Scenario: Navigation to the content under devops implementation
    And I choose Read under The key to a successful DevOps implementation
    And I navigate to the content of the page
    And I enter name "Soumya" in Name field
    And I enter email "soumya@gmail.com" in Email field
    And I enter message "This is awesome" in Message field
    And I choose Save
    
    Scenario: Navigation to the content under devops-begineer guide
    And I choose Read under DevOps - A beginner guide
    And I navigate to the content of the page
    
    Scenario: Navigation to the content under Blinqlabs launch
    And I choose Read under Blinqlabs Launch
    And I navigate to the content of the page
    And I enter name "Soumya" in Name field
    And I enter email "soumya@gmail.com" in Email field
    And I enter message "This is awesome" in Message field
    And I choose Save