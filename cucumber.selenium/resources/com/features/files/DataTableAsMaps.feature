#Author: Tapubrat
Feature: Example of using Data table as Map

  @RegressionTest
  Scenario: User Registration using DataTable As Map
    Given User is in the Registration page
    When User Enters the below details
      | FirstName | LastName | Email               | Phone  | Location   |
      | Tony      | Stark    | tonystark@gmail.com | 938474 | Florida    |
      | Ant       | Man      | antman@gmail.com    | 837483 | California |
      | Super     | Man      | superman@gmail.com  | 847598 | Australia  |
      | Spider    | Man      | spidy@gmail.com     | 784759 | London     |
    Then User is Registered Successfully
