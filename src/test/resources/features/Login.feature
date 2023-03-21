Feature: Login functionality test
  Scenario: User should be able to login with valid credentials
    Given I navigate to login page
    And I login "tracker user"
    And I skip phone collection
    Then I navigate home page
