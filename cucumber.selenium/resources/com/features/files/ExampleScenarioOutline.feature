#Author: Tapubrat
Feature: Example of Data Driven Test Using Scenario Outline

  @RegressionTest
  Scenario Outline: Calculate Billing Amount
    Given User in on Bill Calculation Page
    When User Enters the Amount "<Amount>"
    And User Enters the Tax Amount <Tax Amount>
    And User Enters the Service Charge "<Service Charge>"
    And User Clicks On Calculate Button
    Then Final Amount is Calculated "<Final Amount>"

    Examples: 
      | Amount | Tax Amount | Service Charge | Final Amount |
      |    100 |          5 |              2 |          107 |
      |     30 |          8 |            3.5 |         41.5 |
