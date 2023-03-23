Feature: RAT
  Scenario:
    Given I navigate home page
    And I login "tracker user"
    And I skip phone collection
    Then I navigate home page
    
