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
Feature: Search For Orders

  Background: 
    Given User is on Login page
    When User enter username
    And User enter password
    And User Clicks on Login
    Then User is successfully Logged In
    Then User have a search field on WebPage

  @Smoke
  Scenario: Navigate to orders Page
    When User Clicks on Orders Link
    Then Orders Page is displayed

  @Regression
  Scenario: Search for Product Monitor
    When I search for a product with name "External Monitor" and price 5000
    Then Multiple products of same category will be displayed

  @Regression
  Scenario: Search for Product Shoes
    When I search for a product with name "Mens Shoes" and price 2000
    Then Multiple products of same category will be displayed
