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
@All
Feature: Book Flight

  @Regression
  Scenario: User wants to Book a Flight
    Given User wants to Book a Flight from "Bangalore" to "Delhi"
    When User Enters From and To Location For Flight
    And Selects Travel Date For Flight
    And Clicks on Search Button For Flight
    Then Available Fight Details are Displayed

  @Smoke
  Scenario: User wants to Book a Train
    Given User wants to Book a Train from "Bangalore" to "Mumbai"
    When User Enters From and To Location For Train
    And Selects Travel Date For Train
    And Clicks on Search Button For Train
    Then Available Train Details are Displayed For Train

  @Regression @Integration
  Scenario: User wants to Book a Bus
    Given User wants to Book a Bus from "Bangalore" to "Pune"
    When User Enters From and To Location For Bus
    And Selects Travel Date For Bus
    And Clicks on Search Button For Bus
    Then Available Bus Details are Displayed For Bus

  @Prod
  Scenario: User wants to Book a Cab
    Given User wants to Book a Cab from "Bangalore" to "Mysore"
    When User Enters From and To Location For Cab
    And Selects Travel Date For Cab
    And Clicks on Search Button For Cab
    Then Available Cab Details are Displayed For Cab

  @Dev @QA-READY @Feature-305 @Epic-500
  Scenario: User wants to Book a Hotel
    Given User wants to Book a Hotel in "Goa"
    When User Enters from "BeginDate" to "EndDate" For Hotel
    And Clicks on Search Button For Hotel
    Then Available Hotel Details are Displayed For Hotel
