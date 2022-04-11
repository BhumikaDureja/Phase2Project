Feature: This feauture would be used to validate the prices of the product on the SwagLab application

  Background: Open the SwagLab application
    Given I have opened the application in browser
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click on the login button
    Then I should have landed on the Product page

@Sanity
  Scenario: Validate the price of the product
    And Product price should be as per below table
      | Sauce Labs Backpack     | $29.99 |
      | Sauce Labs Bolt T-Shirt | $49.99 |
