#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Testing of WebTables page

  Scenario: Add a user and validate the user has been added to the table
    Given I am on WebTables page of Way2Automation website	
    When I select Add User button
    And add details and save
    Then A row will be added with the details of what I entered

  Scenario: Delete the user "novak" from the table and validate the user has been deleted.
    Given I am on WebTables page of Way2Automation website	
    When I click on cross icon of username "novak"
    Then A dialogue box will be prompted for confirmation
    And entry will be deleted
    
    
    
