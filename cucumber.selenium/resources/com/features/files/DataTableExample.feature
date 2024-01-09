#Author : Tapubrat
Feature: Data Table As List Example

  @RegressionTest
  Scenario: Multiple Users Registration
    Given User is in Registration Page
    When User Enters the following user details
      | firstName1 | lastName1 | user1@gmail.com | phoneNo1 | Bangalore |
      | firstName2 | lastName2 | user2@gmail.com | phoneNo2 | Mumbai    |
      | firstName3 | lastName3 | user3@gmail.com | phoneNo3 | Kolkatta  |
      | firstName4 | lastName4 | user4@gmail.com | phoneNo4 | Chennai   |
    Then User Registration should be successfull
