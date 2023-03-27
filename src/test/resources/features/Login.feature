Feature: Login functionality test

#  Scenario: User should be able to login with valid credentials
#    Given I navigate to login page
#    And I login "tracker user"
#    And I skip phone collection
#    Then I navigate home page
#
#
#  Scenario Outline: User should be able to login with valid credentials (multiple)
#    Given I navigate to login page
#    And I login "<email>" and "<password>"
#    And I skip phone collection
#    Then I navigate home page
#    Examples:
#      | email            | password    |
#      | ikprdus4@scqa.me | Qweasdzxc1! |
#      | ikprdus4@scqa.me | Qweasdzxc1! |



  Scenario:
    Given I navigate to login page
    When I handle cookies
    And I login "tracker user"
    And I skip phone collection
    Then I navigate home page
    And I click Real Age Test button
    When I take Real Age Test
    Then I should be able to see my result
    And I wait "100000" sec
