Feature: Login functinolaty test
  Scenario: User should be able to login with valid credentials
    Given I navigate to login page
    And I submit my email
    And I submit my password
    And I click login button
    Then I navigate home page
