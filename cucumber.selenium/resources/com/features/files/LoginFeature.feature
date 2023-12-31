#Author : Tapubrat
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>

@SmokeScenario
Feature: Feature to Test Login functionality

  @SmokeTest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to the home page
