#Author : Tapubrat
@SmokeScenario
Feature: Feature to Test Login functionality

  @SmokeTest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to the home page
  #Scenario Outline: Check login is successful with valid credentials
    #Given user is on login page
    #When user enters <username> and <password>
    #And click on login button
    #Then user is navigated to the home page
#
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |