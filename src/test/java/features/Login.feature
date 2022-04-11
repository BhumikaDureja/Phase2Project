@F_Login
Feature: This feauture would be used to design the Login page of the SwagLab application

  Background: Open the SwagLab application
    Given I have opened the application in browser
    
@Sanity
  Scenario Outline: Validate the successful Login
    When I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on the login button
    Then I should have landed on the Product page

    Examples: 
      | UserName        | Password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |

 @Regression
  Scenario Outline: Validate the Negative Login
    When I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on the login button
    Then I should get error message as "Epic sadface: Username and password do not match any user in this service"

    Examples: 
      | UserName    | Password |
      | abc@xyz.com | pqr@1234 |
